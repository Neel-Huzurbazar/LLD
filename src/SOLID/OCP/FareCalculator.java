package SOLID.OCP;

public class FareCalculator {
    /*
        Below code violates OCP principle as for adding a new type,we have to modify the existing code
     */
    public double calculateFare(String route,String type)
    {
        if(type.equals("Regular")) return 1.0;
        else if(type.equals("Surge")) return 2.0;
        else return 3.0;
    }

    /* Fix-
        Use polymorphism for extensibility
        interface FareStrategy{
            double calculateFare(String route)
            }

        class RegularFate{
            public double calculateFare(String route){}
            public Surge surgeFare(
        }
    *  */

}
