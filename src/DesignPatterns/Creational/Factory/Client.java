package DesignPatterns.Creational.Factory;

public class Client {
    public static void main(String[] args) {
        /*
            To change the platform, we just have to pass a different platform to createFactory method,
            else we don't have to change anything.
            Client doesn't know anything about how ui elements are created and we don't have to use a particular
            class anywhere here to create an object leading to loose coupling.
         */
        Flutter flutter=new Flutter(Platform.IOS);
        UIFactory uiFactory=flutter.createFactory();

        uiFactory.createWindow();

        uiFactory.createButton();

        uiFactory.createMenu();
    }
}
