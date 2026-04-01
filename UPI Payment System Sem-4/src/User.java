public class User{
    private String name;
    private String upiID;
    private BankAccount Account;
    public User(String name,String upiID,BankAccount Account){
        this.name=name;
        this.upiID=upiID;
        this.Account=Account;
    }
    public String getName(){
        return name;
    }
    public String getUpiID(){
        return upiID;
    }
    public BankAccount getAccount(){
        return Account;
    }
    public static void main(String[] args) {


    }
}