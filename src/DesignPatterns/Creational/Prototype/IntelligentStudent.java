package DesignPatterns.Creational.Prototype;

public class IntelligentStudent extends Student {
    private int iq;

    public IntelligentStudent(IntelligentStudent copy)
    {
        super(copy);
        copy.iq=102;
    }
    public IntelligentStudent(){}
    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }
}
