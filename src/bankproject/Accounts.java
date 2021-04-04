package bankproject;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author J.K. Cortes
 */
public class Accounts {
    
    public abstract class BankAccount{

        protected abstract double read(Statement st) throws SQLException;

        protected abstract void write(Statement st, double x);

        public abstract RecieptInfo getReceipt(double val, Statement st);

        public String getPassword(Statement st, int accountNum) throws SQLException {
            ResultSet rs = st.executeQuery("SELECT Password FROM clientsavings WHERE AccountNum = " + accountNum);
            
            if (rs.next()) return rs.getString("Password");
            return "";    
        };

        public String getPasswordfromWindow (String x, String y){
            Enter_Password window = new Enter_Password(x, y);
            window.setVisible(true);
            return window.newPass;
        }
        
        public boolean checkPassword(Statement st, int accountNum, String x, String y) throws SQLException {
            String pass; 

            pass = getPasswordfromWindow(x,y);
            String holdpass = "";
            holdpass = getPassword(st,accountNum);
            
            if(holdpass.equals(pass)) return true;
            return false;
        };
        
    }
    

     public static class RecieptInfo {
        public int acctNum;
        public double balance;
        public double transBill;
        public String date;

    }


    public static class SavingsAccount extends BankAccount{
        private int accountNum;
        private String username;
        private String password;
       
        public SavingsAccount(String username, String password, Statement st) throws SQLException{
           this.username = username;
           this.password = password;
           
           ResultSet rs = st.executeQuery("SELECT AccountNum FROM clientinfo WHERE Name = " + "'" + username + "'");
           
            if (rs.next()) accountNum = rs.getInt("AccountNum");
            else System.out.println("No existing record...");
        }

        @Override
        protected double read(Statement st) throws SQLException {
         
           ResultSet rs = st.executeQuery("SELECT Balance FROM clientsavings WHERE AccountNum = " + accountNum);

           if (rs.next()){ 
            double x = rs.getDouble("Balance");
            return x;
           }
           return 0;
        }

        @Override
        protected void write(Statement st, double x) {
            try {
                st.executeUpdate("UPDATE clientsavings " + " SET Balance = " + x + " WHERE AccountNum = " + accountNum);
            } catch (SQLException ex) {ex.printStackTrace();}
        }
        
        public void withdraw (Statement st, double val){
            System.out.println(accountNum);
            try {
               double bal = read(st); 

               if (bal > 0){
                   if(bal>= val){
                        val = bal - val;
                        write(st, val);
                    }
                   else System.out.println("Insuficient Funds....");      
               }

            } catch (SQLException ex){ex.printStackTrace();}
        }
        
        public void deposit (Statement st, double val){
            try{
                double bal = read(st); 
                 val = bal + val;
                write(st, val);
                System.out.println("Balance: " + val);
                
            }catch (SQLException ex){ex.printStackTrace();}            
        }
        
        public String checkBal(Statement st){
            try {
                double bal = read(st);
                return Double.toString(bal);
                    
            } catch (SQLException ex) {ex.printStackTrace();}

            return "0.0";
        }

        @Override
        public RecieptInfo getReceipt(double val, Statement st) {
            RecieptInfo hold = new RecieptInfo();
            
            try {
                hold.acctNum = accountNum;
                hold.transBill = val;
                hold.balance = read(st);
                java.util.Date date = Calendar.getInstance().getTime();
                DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
                hold.date = dateFormat.format(date);
                
            } catch (SQLException ex) { ex.printStackTrace();}
            
            return hold;
        }

    }
    

    public static class CreditCard extends BankAccount{

        private int accountNum;
        private String password;
        private String username;
        
        public CreditCard(String username, String password, Statement st) throws SQLException {
           this.username = username;
           this.password = password;
           
           ResultSet rs = st.executeQuery("SELECT AccountNum FROM clientinfo WHERE Name = " + "'" + username + "'");

           if (rs.next()) accountNum = rs.getInt("AccountNum");
           else System.out.println("No existing record...");
        }
    
        @Override
        protected double read(Statement st) throws SQLException {
            ResultSet rs = st.executeQuery("SELECT Balance FROM creditcard WHERE AccountNum = " + accountNum);
  
           if (rs.next()){ 
            double x = rs.getDouble("Balance");
            return x;
           }
           return 0;
        }

        @Override
        protected void write(Statement st, double x) {
            try {
                st.executeUpdate("UPDATE creditcard " + " SET Balance = " + x + " WHERE AccountNum = " + accountNum);
            } catch (SQLException ex) {ex.printStackTrace();}
        }
    
        public int getCreditScore (Statement st){
           ResultSet rs;
           int hold;

            try {
                rs = st.executeQuery("SELECT CreditScore FROM creditcard WHERE AccountNum = " + accountNum);
                
                if (rs.next()){
                    hold = rs.getInt("CreditScore");
                    return hold;
                }
            } catch (SQLException ex) { Logger.getLogger(Accounts.class.getName()).log(Level.SEVERE, null, ex);}
            
            return 0;
        }
        
        public boolean canLoan(Statement st){
            if (getCreditScore(st) > 580) return true;
            return false;             
        };

        public void payDebt1(Statement st, SavingsAccount client){
            try {
                double bal = read(st);
                client.withdraw(st,bal);
                st.executeUpdate("UPDATE creditcard " + " SET Balance = 0" + " WHERE AccountNum = " + accountNum);
                addCredit(st, 2);
            }
            catch (SQLException e){ e.printStackTrace();}
        }

        public void payDebt2(Statement st, double hm) throws SQLException{
            int choice;
            Scanner input = new Scanner(System.in);
            double bal = read(st);
            
            try {
                if(bal == hm){
                    st.executeUpdate("UPDATE creditcard " + " SET Balance = 0" + " WHERE AccountNum = " + accountNum);
                    addCredit(st, 2);
                } 
                
                else if (bal > hm) {
                    hm = bal - hm;
                    st.executeUpdate("UPDATE creditcard " + " SET Balance = " + hm + " WHERE AccountNum = " + accountNum);
                    System.out.println("Remaining Balance: " + hm);
                } 
                
                else System.out.println("Overpayment...");

            }catch (SQLException ex){ ex.printStackTrace();}
        };

        private void addCredit (Statement st, int mode) throws SQLException{
            int val;

            ResultSet rs = st.executeQuery("SELECT CreditScore FROM creditcard WHERE AccountNum = " + accountNum);

            if(rs.next()){
                switch (mode){
                    case 1: 
                        val = rs.getInt("CreditScore") + 1;
                        st.executeUpdate("UPDATE creditcard " + " SET CreditScore = " + val  + " WHERE AccountNum = " + accountNum);
                        break;

                    case 2:
                        val = rs.getInt("CreditScore") + 5;
                        st.executeUpdate("UPDATE creditcard " + " SET CreditScore = " + val  + " WHERE AccountNum = " + accountNum);
                        break;
                }
            }
        }

        public void addDebt(Statement st, double val) throws SQLException{
            try {
                double bal = read(st);
                val += bal;
                write(st, val);
                addCredit(st, 1);

            } catch (SQLException ex){ ex.printStackTrace();}
        };
        
        public void checkBal(Statement st){
            try {
                if(super.checkPassword(st, accountNum, username, password)){
                    double bal = read(st);
                    System.out.println("Balance: " + bal);
                }
                else System.out.println("Wrong Password...");
                
            } catch (SQLException ex) { ex.printStackTrace();}
        }

        @Override
        public RecieptInfo getReceipt(double val, Statement st) {
            RecieptInfo hold = new RecieptInfo();

            try {
                hold.acctNum = accountNum;
                hold.transBill = val;
                hold.balance = read(st);
                java.util.Date date = Calendar.getInstance().getTime();
                DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
                hold.date = dateFormat.format(date);
                
            } catch (SQLException ex) {ex.printStackTrace();}            
            return hold;
        }
        
    }
  
    
}