package DesignPatterns.Creational.Builder.Optimized1;

public class Builder {
    private String name;
    private String phone;
    private double psp;
    private int age;

    public String getName() {
        return name;
    }

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Builder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public double getPsp() {
        return psp;
    }

    public Builder setPsp(double psp) {
        this.psp = psp;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }
    public Student build()
    {
        return new Student(this);
    }
}
