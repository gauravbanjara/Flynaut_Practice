package Inheritance;
public class BankAccount {
    private String  accountNumber;
    private double balance;
    BankAccount(String  accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited Money: " + amount +" And new Balance is "+balance);
        } else
            System.out.println("Deposit more than 0 Rs");
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn money: " + amount +" And new Balance is "+balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Negative amount can't be withdraw");
        }
    }
    void Display(){
        System.out.println("Account Number is: "+ accountNumber+ " And Current Balance is: "+ balance);
    }

    public static void main(String[] args) {
        BankAccount bank = new BankAccount("14872", 5000);
        bank.Display();
        System.out.println();
        bank.deposit(2000);
        System.out.println();
        bank.withdraw(500);
    }
}
