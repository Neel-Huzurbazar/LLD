package DesignPatterns.Creational.Factory;

public class UIFactoryFactory {
    public static UIFactory getUIFactory(Platform platform)
    {
        if(platform==Platform.Android) return new AndroidFactory();
        else if(platform==Platform.IOS) return new IOSFactory();
        else if(platform==Platform.Windows) return null;
        else if(platform==Platform.Mac) return null;
        else throw new IllegalStateException("Unsupported Platform");
    }
}
