package SOLID.SRP;

public class RideService {
    /*violation -
        below code violates SRP principle as it has multiple responsibilities and reason to change
        Fix-
        Separete reponsibilities into multiple classes
     */
    public void findDriver(String location){};
    public void calculateFare(String route){};
    public void processPayment(String method){};
}

/*
    Fix-
    class Drive{
        public void findDriver(String location){};
        }
    class Fare{
        public void calculateFare(String route){};
    }
    class Payment{
        public void processPayment(String method){};
    }
 */