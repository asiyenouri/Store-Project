package payment;

public class  CreditCardPayment implements PaymentStrategy {

    String CardNumber;
    String CardHolderNumberName;

    //constructor
    public CreditCardPayment(String CardNumber, String CardHolderNumberName) {
        this.CardNumber = CardNumber;
        this.CardHolderNumberName = CardHolderNumberName;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + "  " + getPaymentDetails());
    }

    @Override
    public String getPaymentDetails() {
        return "     CreditCardPayment" + "   " + CardNumber + "  " + CardHolderNumberName + " " ;
    }
}
