package DesignPatterns.Creational.Prototype;

public class Client {
    public static void main(String[] args) {
        Registry registry =new Registry();
        startRegistry(registry);

        Student june25=registry.getObject("May_23");
        june25.setBatch("25_June_Morning");

    }

    public static void startRegistry(Registry studentRegistry)
    {
        Student may25=new Student();
        may25.setBatch("25_May_Morning");
        studentRegistry.register("May_23",may25);

        IntelligentStudent april25=new IntelligentStudent();
        april25.setBatch("April_25");
        studentRegistry.register("April_25",april25);

    }
}
