package DesignPatterns.Creational.Singleton;

public class Client {
    public static void main(String[] args) {
        Student student= Student.getInstance();
        student.setName("Test");
        student.setAge(25);
        student.setPsp(75);
        student.setBatch("Test 123");

        System.out.println(student);
        Student student2= Student.getInstance();
        System.out.println(student);
    }
}
