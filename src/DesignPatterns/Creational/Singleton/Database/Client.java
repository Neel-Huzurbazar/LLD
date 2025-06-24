package DesignPatterns.Creational.Singleton.Database;

public class Client {
    public static void main(String[] args) {
        DatabaseConnection databaseConnection = DatabaseConnection.getDBInstance();
    }
}
