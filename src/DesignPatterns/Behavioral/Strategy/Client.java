package DesignPatterns.Behavioral.Strategy;

public class Client {
    public static void main(String[] args) {
        /*
            Strategy pattern suggest moving different algorithms to different classes and
            creating an parent interface for them to invoke dynamically.
         */
        Navigation navigate;
        Mode transportMode=Mode.TRAIN;
        if(transportMode==Mode.CAR)
        {
            navigate=new Car();
        }
        else if(transportMode==Mode.TRAIN)
        {
            navigate=new Train();
        }
        else if(transportMode==Mode.WALK)
        {
            navigate=new Walk();
        }
        else navigate=new Car();
        navigate.calculateRoute();
    }
}
