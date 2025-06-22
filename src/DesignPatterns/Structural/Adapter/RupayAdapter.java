package DesignPatterns.Structural.Adapter;

public class RupayAdapter implements PaymentGateway {
    RupayPayment rupay;
    public RupayAdapter(RupayPayment rupay)
    {
        this.rupay=rupay;
    }
    @Override
    public void processPayment(double amount) {
        System.out.println("Making the payment");
        rupay.transferMoney(10000);
    }
}
