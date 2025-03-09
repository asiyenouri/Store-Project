package payment;

public class BitcoinPayment implements PaymentStrategy {

    String walletAddress;

    //constructor
    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + getPaymentDetails());

    }

    @Override
    public String getPaymentDetails() {
        return "       BitcoinPayment" + "      " + walletAddress + " " ;
    }
}
