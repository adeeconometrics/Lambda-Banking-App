package bankproject;

import java.sql.*;

public class Client extends Entity{

    protected String clientPassword;
    protected String clientAccountNo;
    private int Age;
    protected String cKey;

    public Client(String name, int age) {
        super(name, age);
        this.clientAccountNo = getAccountNo();
        this.clientPassword = getPassword();
    }

    public String clientKey(String password, String accountNo){
         this.cKey = password+"_"+accountNo;
         return this.cKey;
    }
    
}
