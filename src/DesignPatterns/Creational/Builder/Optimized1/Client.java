package DesignPatterns.Creational.Builder.Optimized1;
public class Client {
    public static void main(String[] args) {
        /*
            Here, client student doesn't have to worry about Builder class and its implementation
         */
         Student student=Student.builder().
                 setName("test").
                 setAge(24).
                 setPhone("321312313").
                 build();

        System.out.println(student);
    }
}
