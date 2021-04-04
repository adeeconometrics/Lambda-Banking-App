package bankproject;

import java.util.HashMap;

//Note: should this be an abstract class?

/**
 * @author: D.D.Amiana 
 */

/**
 * Class for encrypting ans decrypting transactions 
 * 
 * Member functions:
 * - request -- for transactions request, throws exception for invalid password
 * - isValid(helper function) -- checks if password and account number is valid
 * - toHex(helper function) -- converts a string to hexadecimal representation
 * - hexToString(helper function) -- converts hexadecimal representation to string
 * - encrypt -- shift encryption 
 * - decryption -- shift decryption
 * - keypair - calls hashFunction to put values in the map
 * - hashFunction (helper function) -- generates a hash value for a given set of string (used in encryption)
 */
public class Cipher {
    private final int key = (int)Math.pow(2,16)-1;
    public HashMap<String, String> map = new HashMap<String, String>(); // this should get communicated with the database
    private String accountNo;
    public String password;

    Cipher(){}
    Cipher(String accountNo, String password){
        this.accountNo = encrypt(accountNo);
        this.password = encrypt(password);
        keypair(this.accountNo, this.password);
    }

    public void request(String accountNo, String password){
        try{
            if(isValid(accountNo, password)){
                //make transactions
                System.out.println("authentication verified, you can now make transactions");
            }
            else throw new Exception("invalid password, try again");
        }catch(Exception e){
            System.err.println(e);
        }
    }

    public boolean isValid(String accountNo, String password){
        if(hashFunction(encrypt(password)).equals(map.get(encrypt(accountNo)))) return true;
        return false;
    }

    protected String toHex(String str){
        String s ="";
        char ch[] = str.toCharArray();
        for(int i = 0; i < ch.length; i++) {
            s+= Integer.toHexString(ch[i]).toUpperCase();
        }
        return s;
    }

    protected String hexToString(String str){
        String result = "";
        char charArray[] = str.toCharArray();
        for(int i = 0; i < charArray.length; i=i+2) {
            String st = ""+charArray[i]+""+charArray[i+1];
            char ch = (char)Integer.parseInt(st, 16);
            result += ch;
        }
        return result;
    }

    protected String encrypt(String str){
        String result = "";
        char charArray[] = str.toCharArray();
        
        for(int i = 0; i < charArray.length; i++) {
            int j = (key+(int)charArray[i]);
            result += (char)j; 
        }
        return toHex(result);
    }

    protected String decrypt(String str){
        str = hexToString(str);
        String result = "";
        char ascii[] = str.toCharArray();

        for(char ch: ascii) {
            int i = (((int)ch-key));
            result += (char)i;
        }
        return result;
    }

    public void keypair(String accountNo, String password){
        String signiture = hashFunction(password);
        map.put(accountNo, signiture);
    }

    protected String hashFunction(String str){
        char ch[] = str.toCharArray();
        int hashAddress = 0;
        for(int i = 0; i <ch.length; i++) {
            hashAddress = Math.abs(ch[i] +(hashAddress<<16) + (hashAddress << 32)) - hashAddress;
        }
        return String.valueOf(hashAddress);
    }
}



