public class BillPayment extends Transaction{
    private String billerName;

    public BillPayment(User sender,double amount,String billerName){
        super(sender,null,amount);
        this.billerName=billerName;
    }
    public void processTransaction(){
        if(sender.getAccount().withdraw(amount)){
            System.out.println("Bill Payment Successsful!");
            System.out.println(sender.getName()+" paid "+amount+" to "+billerName);
        }
        else{
            System.out.println("Bill Payment Failed! Insufficient Balance.");
        }
    }
}
