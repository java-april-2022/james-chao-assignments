import java.util.Random;

public class BankAccount {

    // instance variables
    private double checkingBalance;
    private double savingsBalance;

    // Sensei Challenge
    private int accountId;

    //static variables
    public static int accountsCreated = 0;
    public static double totalMoney = 0;
    private static int createUniqueId() {
        Random randGenerator = new Random();
        int uniqueId = randGenerator.nextInt(1000000000) + 999999999;
        return uniqueId;
    }

    //creating the constructor
    public BankAccount(){
        accountsCreated++;
        this.accountId = BankAccount.createUniqueId();
    }

    //creating the getters and setters
    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    public double getSavingsBalance(){
        return this.savingsBalance;
    }

    public int getAccountNumber(){
        return this.accountId;
    }

    //creating class methods
    public void depositMoney(double money, String account){
        if(account.equals("checking")){
            this.checkingBalance = this.checkingBalance + money;
        }
        else if(account.equals("saving")){
            this.savingsBalance = this.savingsBalance + money;
        }
        BankAccount.totalMoney = totalMoney + money;
    }

    public void withdrawMoney(double money, String account){
        boolean canWithdraw = false;
        if(account.equals("checking")){
            //check if there is enough money
            if(this.checkingBalance - money >= 0){
                canWithdraw = true;
                this.checkingBalance = this.checkingBalance - money;
            }
            if(canWithdraw){
                BankAccount.totalMoney = BankAccount.totalMoney - money;
            }
        }
        else if(account.equals("saving")){
            if(this.savingsBalance - money >= 0){
                canWithdraw = true;
                this.savingsBalance = this.savingsBalance - money;
            }
            if(canWithdraw){
                BankAccount.totalMoney = BankAccount.totalMoney - money;
            }
        }
        else{
            System.out.println("Insufficient funds.");
        }
    }

    public void displayAccountBalance(){
        System.out.printf("Savings: $%.2f, Checking: $%.2f", this.savingsBalance, this.checkingBalance);
    }

    
}
