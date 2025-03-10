package payment;

public class  CreditCardPayment implements PaymentStrategy {

    String CardNumber;
    String CardHolderName;

    //constructor
    public CreditCardPayment(String CardNumber, String CardHolderName) {
        this.CardNumber = CardNumber;
        this.CardHolderName = CardHolderName;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + "  " + getPaymentDetails());
    }

    @Override
    public String getPaymentDetails() {
        return "     CreditCardPayment" + "   " + CardNumber + "  " + CardHolderName + " " ;
    }
}
