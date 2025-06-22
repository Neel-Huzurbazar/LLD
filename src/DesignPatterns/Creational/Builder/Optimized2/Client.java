package DesignPatterns.Creational.Builder.Optimized2;


public class Client {
    public static void main(String[] args) {

         /*
            Optimization 2-
            If have multiple such classes, we have to create and manage a builder class for each of them which could be
            overwhelming, instead, we can use nested builder class
            We also need to prevent direct invocation of Student constructor so need to make it private
          */
            Student student= Student.builder().
                setName("test").
                setAge(24).
                setPhone("321312313").
                setPsp(76).
                build();
            System.out.println(student.toString());
    }
}
