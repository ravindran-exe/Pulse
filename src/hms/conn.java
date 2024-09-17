package hms;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class conn {

    Connection connection;
    Statement statement;

    public conn(){
        try {
            connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/hms", "root", "");
            /*
                Modify the above line as:
                    -  replace jdbc:mysql://localhost:3306/hms with jdbc:mysql://localhost:3306/YOUR-DATABASE-NAME
                    -  insert the password of your database instance
             */
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
