package DesignPatterns.Creational.Factory;

import DesignPatterns.Creational.Factory.Button.Button;
import DesignPatterns.Creational.Factory.Menu.Menu;

public interface UIFactory {
    void createWindow();
    Button createButton();
    Menu createMenu();
}
