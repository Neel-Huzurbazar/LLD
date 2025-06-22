package DesignPatterns.Creational.Factory;

import DesignPatterns.Creational.Factory.Button.IOSButton;
import DesignPatterns.Creational.Factory.Menu.IOSMenu;

public class IOSFactory implements UIFactory {
    @Override
    public void createWindow() {
        System.out.println("Creating IOS window");
    }

    @Override
    public IOSButton createButton() {
        return new IOSButton();
    }

    @Override
    public IOSMenu createMenu() {
        return new IOSMenu();
    }
}
