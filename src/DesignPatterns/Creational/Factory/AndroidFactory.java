package DesignPatterns.Creational.Factory;

import DesignPatterns.Creational.Factory.Button.AndroidButton;
import DesignPatterns.Creational.Factory.Menu.AndroidMenu;

public class AndroidFactory implements  UIFactory{
    @Override
    public void createWindow() {
        System.out.println("Creating android window");
    }

    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }
}
