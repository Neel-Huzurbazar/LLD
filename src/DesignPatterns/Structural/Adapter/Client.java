package DesignPatterns.Structural.Adapter;

public class Client {
    public static void main(String[] args) {
        /*
         Here,client PaymentGateway doesn't have to worry about the implementation , we can change the api any time
         making it loosely coupled
         */

        //use Strip
        PaymentGateway gateway= new StripPaymentAdapter(new StripPayment());
        gateway.processPayment(1000);

        //use Rupay
        gateway= new RupayAdapter(new RupayPayment());
        gateway.processPayment(1000);
    }
}
