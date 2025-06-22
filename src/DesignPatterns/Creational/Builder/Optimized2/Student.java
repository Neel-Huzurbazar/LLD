package DesignPatterns.Creational.Builder.Optimized2;

public class Student {
    private String name;
    private String phone;
    private double psp;
    private int age;
    static class Builder {
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
    private Student(Builder builder)
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

    public static Builder builder()
    {
        return new Builder();
    }
}
