package bankproject;

import java.util.HashMap;

/**
 * @author: D.D. Amiana 
 */

/**
 * Entity: base class for all entities in the system, extends Cipher class
 * 
 * Member functions:
 * - setAccountNo - sets account number based on hash function 
 * - setDefaultPassword - sets default password based on name and age
 * - setPassword - sets password based on str parameter
 * - getPassword
 * - getAge
 * - getName
 * - getAccountNo
 * - bindToMap - binds encrypted accountNo and encrypted password to entityMap
 */
public class Entity extends Cipher{

    public HashMap<String,String> entityMap = new HashMap<String, String>();

    private String name;
    private String accountNo;
    private String password;
    private int age;

    //implement error handling for age
    Entity(String name, int age){
        this.name = name;
        this.age = age;
        this.setAccountNo();
        this.setDefaultPassword();
        this.bindToMap();
    }

    // implement constructor for handling Admin
    private void setAccountNo(){
        String temp = this.name+this.age+this.name;
        this.accountNo = super.hashFunction(temp);
    }

    protected void setPassword(String password){
        //Note: this should be non-deterministic encryption, for the meantime let's make it simple
        this.password = super.encrypt(password);
    }

    protected void setDefaultPassword(){
        this.password = super.encrypt(this.name+this.age);
    }

    protected String getPassword(){
        //decrypt password from user map ~ also used for validating password
        return super.decrypt(password); // make authentications before decripting 
    }

    protected String getAge(){
        return String.valueOf(this.age);
    }

    protected String getName(){
        return this.name;
    }

    protected String getAccountNo(){
        return this.accountNo;
    }

    private void bindToMap(){
        entityMap.put(this.accountNo, this.password);
    }
}

/*class Test2{
    public static void main(String args[]){
        Entity e = new Entity("Billy James", 13);
        Entity e2  = new Entity("Billy James.", 13);
        Entity e3  = new Entity("Billy James", 13);

        System.out.println(e.getAccountNo());
        System.out.println(e3.getAccountNo());
        System.out.println(e2.getAccountNo()); // this results to an entirely new account number, hash function is also deterministic
    }
}*/
