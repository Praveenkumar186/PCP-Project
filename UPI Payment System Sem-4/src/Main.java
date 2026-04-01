import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Balance of Marsh:");
        double balance=sc.nextDouble();
        System.out.println("Enter balance of Renshaw:");
        double bal=sc.nextDouble();
        BankAccount acc1 = new BankAccount("12345",balance);
        BankAccount acc2 = new BankAccount("67890",bal);
        User user1 = new User("Marsh", "marsh@upi", acc1);
        User user2 = new User("Renshaw", "renshaw@upi", acc2);

        upiService UPIService = new upiService();
        System.out.println("Enter Amount to Transfer to Renshaw:");
        double amount=sc.nextDouble();
        Transaction t1 = new FundTransfer(user1, user2,amount);
        UPIService.makeTransaction(t1);
        System.out.println("Enter the Bill Amount to be Paid:");
        double Bill=sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter Name of Shop");
        String shop=sc.nextLine();
        sc.close();


        Transaction t2 = new BillPayment(user1,Bill,shop);
        UPIService.makeTransaction(t2);
        System.out.println("Marsh paid "+Bill+" to "+shop);

        System.out.println(user1.getName() + " Balance: ₹" + user1.getAccount().getBalance());
        System.out.println(user2.getName() + " Balance: ₹" + user2.getAccount().getBalance());








    }
}
