package db;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.*;


public class DataBaseTest {
    @Test
    public void testDatabaseConnetion() throws SQLException {
        String url = "jdbc:mysql://sql.freedb.tech:3306/freedb_mohamed_test_db";
        String user = "freedb_test_user_refaat";
        String pass = "test@123";

        Connection connection = DriverManager.getConnection(url , user , pass);
        Statement statement= connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT 'Mohamed' AS Name");

        if (resultSet.next()){
            String name = resultSet.getString("Name");
            System.out.println("Data found in DB "+ name);
            Assert.assertEquals(name, "Mohamed", "Name in DB doesn't match!");
        }

        connection.close();


    }
}
