package DesignPatterns.Creational.Singleton;

public class Student {
    private String name;
    private int age;
    private String batch;
    private double psp;
    private static Student instance;
    private Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", batch='" + batch + '\'' +
                ", psp=" + psp +
                '}';
    }

    public static Student getInstance()
    {
        if(instance==null)
        {
            synchronized (Student.class)
            {
                if(instance==null)
                {
                    instance=new Student();
                }
            }
        }
        return instance;
    }

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

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }
}
