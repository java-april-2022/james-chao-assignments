
public class TestBankAccount{
    public static void main(String[] args) {
        BankAccount acct1 = new BankAccount();
        System.out.println("Account Number: " + acct1.getAccountNumber());
        acct1.depositMoney(100.50, "checking");
        acct1.depositMoney(1000.10, "saving");
        acct1.displayAccountBalance();
        System.out.println("\n");
        System.out.println("Banks Money: " + BankAccount.totalMoney);
        BankAccount acct2 = new BankAccount();
        System.out.println("Account Number: " + acct2.getAccountNumber());
        acct2.depositMoney(2000.50, "checking");
        acct2.depositMoney(5000, "saving");
        acct2.displayAccountBalance();

        System.out.println("\n");
        System.out.println("Number of accounts: " + BankAccount.accountsCreated);
        System.out.println("Banks Money: " + BankAccount.totalMoney);

        //check to see if user can change account balance
        // public void setCheckingBalance(double money){
        //     BankAccount.checkingBalance = money;
        // } 
    }
}