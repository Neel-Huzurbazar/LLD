package DesignPatterns.Creational.Prototype;

public class Student implements Prototype<Student>{
    private String name;
    private int age;
    private double psp;
    private String batch;
    private String pwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }
    public Student(){}
    public Student(Student copy)
    {
        copy.psp=50;
        copy.age=24;
        copy.name="test";
        copy.batch="morning";
        copy.pwd="pwd123";
    }
    @Override
    public Student clone() {
        return new Student(this);
    }
}
