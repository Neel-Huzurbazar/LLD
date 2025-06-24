package DesignPatterns.Creational.Singleton.Database;

public class DatabaseConnection {
    private String url;
    private String userName;
    private String password;
    private static DatabaseConnection databaseConnection;

    /*  Eager loading
        It works if there are couple of such singleton classes.For large number of such classes,
        boot time may slow down and also leads to unwanted initialization before hand as the created object
        may never actually be used.
        private DatabaseConnection databaseConnection =new DatabaseConnection();
     */

    @Override
    public String toString() {
        return "DatabaseConnection{" +
                "url='" + url + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    /* private constructor prevents the initialization */
    private DatabaseConnection() {}

    /*  For early loading
        public static DatabaseConnection getDBInstance()
        {
            return databaseConnection;
        }
    */

    public static DatabaseConnection getDBInstance()
    {
        /*  Double locking
            If we keep add the condition check for null inside the synchronized,
            the thread have to wait inorder to read. If we keep the check inside the synchronized block,multiple instances
            get created. The solution to this is to check it twice, so that only one instance is created
            and no threads have to wait for a wait.
         */
        if(databaseConnection==null)
        {
            synchronized (DatabaseConnection.class)
            {
                if(databaseConnection==null) databaseConnection=new DatabaseConnection();
            }
        }
        return databaseConnection;
    }

}
