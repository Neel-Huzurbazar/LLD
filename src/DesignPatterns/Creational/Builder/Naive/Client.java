package DesignPatterns.Creational.Builder.Naive;

public class Client {
    public static void main(String[] args) {
        /*
            Naive-
            Here client student has to know and deal with Builder class which is not its responsibility
            Builder builder =new Builder();
            builder.setName("abc");
            builder.setAge(23);
            builder.setPsp(80);
            builder.setPhone("31312311");
            Student student =new Student(builder);
         */

         /*
            Optimization 1- Student return an builder obj but still client Student needs to be aware of builder
          */
            Builder builder=Student.builder();
            builder.setName("abc");
            builder.setAge(23);
            builder.setPsp(80);
            builder.setPhone("31312311");
            Student student =new Student(builder);
        System.out.println(student.toString());
    }
}
