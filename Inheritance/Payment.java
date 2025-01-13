package Inheritance;
public class Payment {
    public void pay(){
    }
}
class CreditCardPayment extends Payment {
    @Override
    public void pay() {
        System.out.println("Payment made using Credit Card.");
    }
}
class DebitCardPayment extends Payment {
    @Override
    public void pay() {
        System.out.println("Payment made using Debit Card.");
    }
}

class UPIPayment extends Payment {
    @Override
    public void pay() {
        System.out.println("Payment made using UPI.");
    }
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment();
        Payment debitCard = new DebitCardPayment();
        Payment upiPayment = new UPIPayment();
        creditCard.pay();
        debitCard.pay();
        upiPayment.pay();
    }
}


