package DesignPatterns.Creational.Factory;

public class Flutter {
    Platform platform;
    public Flutter(Platform platform)
    {
        this.platform=platform;
    }

    //Common/non-factory methods
    public void refreshRate()
    {
        System.out.println("Refreshing");
    }

    //factory method, responsible for returning a factory object
    public UIFactory createFactory(){
        return UIFactoryFactory.getUIFactory(platform);
    }

}
