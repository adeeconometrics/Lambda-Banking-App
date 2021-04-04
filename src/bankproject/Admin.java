package bankproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author A.A. Yapan
 */
public class Admin extends Entity{
    protected String adminAccountNo;
    protected String adminPassword;
    protected String aKey;
    
    // For registration
    protected String storeName ;
    protected String storeAge ;
    protected String storePassword ;
    protected String storeAccountNo ;

    public Admin(String name, int age) {
        super(name, age);
        this.adminAccountNo = super.getAccountNo();
        this.adminPassword = this.getPassword();
    }

    public String adminKey(String password, String accountNo){
        this.aKey = password+"_"+accountNo;
        return this.aKey;    // Admin Key
    }

    public void makeAccount(String name, int age) {  // Create Client Account : Need to store in data base
        Client client = new Client(name,age);
        
        try {
           
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clientdb", "root", "admin1");
            Statement st = con.createStatement();
            
            System.out.println("Connected");
            
             st.executeUpdate("INSERT INTO clientinfo (AccountNum, Password, Name, Age) VALUES (" + "'"+ client.getAccountNo()  + "'"+ ", "  + "'" + client.getPassword()  + "'" + ", "  + "'" + client.getName()  + "'" + ", " + client.getAge() + ");");
             st.executeUpdate("INSERT INTO clientsavings (AccountNum, Password) VALUES (" + "'"+ client.getAccountNo()  + "'"+ ", "  + "'" + client.getPassword()  + "'" + ");");
             st.executeUpdate("INSERT INTO creditcard (AccountNum, Password) VALUES (" + "'"+ client.getAccountNo()  + "'"+ ", "  + "'" + client.getPassword()  + "'" + ");");

        } catch (SQLException ex) {ex.printStackTrace();}
        
        //************** TO BE STORED IN DATABASE ?? *************
        storePassword = client.getPassword();
        storeAccountNo = client.getAccountNo();

    }
    
    
}
