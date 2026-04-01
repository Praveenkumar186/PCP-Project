public abstract class Transaction {
    protected User sender;
    protected User receiver;
    protected double amount;

    public Transaction(User sender,User receiver,double amount){
        this.sender=sender;
        this.receiver=receiver;
        this.amount=amount;
    }
    public abstract void processTransaction();
}
