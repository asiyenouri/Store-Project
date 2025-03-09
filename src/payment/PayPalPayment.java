package payment;

public class PayPalPayment implements PaymentStrategy{

    String email;

    //constructor
    public PayPalPayment(String email) {
        this.email = email;
    }
    @Override
    public void pay(double amount) {
        System.out.println(amount + getPaymentDetails());
    }

    @Override
    public String getPaymentDetails() {
        return "       PayPalPayment" + "       " + email + " " ;
    }
}
