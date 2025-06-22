package DesignPatterns.Creational.Builder.Naive;

public class Student {
    private String name;
    private String phone;
    private double psp;
    private int age;
    public Student(Builder builder)
    {
        if(builder.getAge()<22) throw new RuntimeException("Age below 22");
        if(builder.getPsp()<75) throw new RuntimeException("PSP below 75");
        if(builder.getPhone()=="") throw new RuntimeException("No phone provided");
        this.age= builder.getAge();
        this.psp=builder.getPsp();
        this.name=builder.getName();
        this.age=builder.getAge();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", psp=" + psp +
                ", age=" + age +
                '}';
    }

    /*
            Optimization 1 , return builder obj
         */
    public static Builder builder()
    {
        return new Builder();
    }
}
