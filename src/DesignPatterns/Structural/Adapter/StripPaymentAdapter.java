package DesignPatterns.Structural.Adapter;

public class StripPaymentAdapter implements PaymentGateway {
    StripPayment strip;
    public StripPaymentAdapter(StripPayment strip)
    {
        this.strip=strip;
    }
    @Override
    public void processPayment(double amount) {
        System.out.println("Making the payment");
        strip.makePayment(amount);
    }
}
