package Exception;
public class BankAccountException {
    private String  accountNumber;
    private double balance;
    BankAccountException(String  accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) throws ArithmeticException {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited Money: " + amount + " And new Balance is " + balance);
        }else {
            throw new ArithmeticException("Deposit more than 0 rs");
        }
    }
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn money: " + amount +" And new Balance is "+balance);
        } else if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient funds.");
        } else {
            System.out.println("Negative amount can't be withdraw");
        }
    }
    void Display(){
        System.out.println("Account Number is: "+ accountNumber+ " And Current Balance is: "+ balance);
    }

    public static void main(String[] args) {
        BankAccountException bank = new BankAccountException("14872", 10000);
        try{
        //  Deposit the money
            bank.deposit(2000);
        //  Get details
            bank.Display();
        // Withdraw Money
            bank.withdraw(500);
        }catch (ArithmeticException e){
            System.err.println("Exception :" + e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
