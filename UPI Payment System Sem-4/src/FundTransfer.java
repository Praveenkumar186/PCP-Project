public class FundTransfer extends Transaction {
    public FundTransfer(User sender,User receiver,double amount){
        super(sender,receiver,amount);
    }
    public void processTransaction(){
        if(sender.getAccount().withdraw(amount)){
            receiver.getAccount().deposit(amount);
            System.out.println("Transaction Successful!");
            System.out.println(sender.getName()+" transferred "+amount+" to "+receiver.getName());
        }
        else{
            System.out.println("Transaction Failed! Insufficient Balance.");
        }
    }
}
