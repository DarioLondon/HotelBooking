/**
 * Created by Dario on 16/03/2016.
 */


import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDb {

    static final String DB_URL = "jdbc:mysql://localhost:8889/cryptodb";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "root";

    public static Connection getConnection(){
        Connection conn = null;

        try{

            //STEP 3: Open a connection
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");

           return conn;

        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{

            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try

        System.out.println("Goodbye!");
        return null;
    }


   public static void createTable(){
       Connection conn=getConnection();
       Statement stmt=null;
       try{


           System.out.println("Creating table in given database...");
           stmt = conn.createStatement();

           String userTable = "CREATE TABLE IF NOT EXISTS users" +
                   "(idUser INTEGER not NULL, " +
                   " name VARCHAR(255), " +
                   " surname VARCHAR(255), " +
                   " username VARCHAR(255), " +
                   " password VARCHAR(255), " +
                   " level INTEGER, " +
                   " PRIMARY KEY ( idUser ))";



           String hotelTable = "CREATE TABLE IF NOT EXISTS rooms" +
                   "(room_id INTEGER not NULL, " +
                   " roomNumber INTEGER, " +
                   " date DATE," +
                   "customer_id int, " +
                   " PRIMARY KEY ( room_id ))";

           String  customerTable = "CREATE TABLE IF NOT EXISTS customers" +
                   "(customer_id INTEGER not NULL, " +
                   "name VARCHAR(255), " +
                   "surname VARCHAR(255), " +
                   "credit_card VARCHAR(255), " +
                   "address VARCHAR(255), " +
                   "postcode VARCHAR(255), " +
                   " dateIn DATE," +
                   " dateOut DATE," +
                   "room_id int, " +
                   " PRIMARY KEY ( customer_id ))";

           stmt.executeUpdate(userTable);
           stmt.executeUpdate(hotelTable);
           stmt.executeUpdate(customerTable);
           System.out.println("Created table in given database...");
       }catch(SQLException se){
           //Handle errors for JDBC
           se.printStackTrace();
       }catch(Exception e){
           //Handle errors for Class.forName
           e.printStackTrace();
       }finally{
           //finally block used to close resources
           try{
               if(stmt!=null)
                   conn.close();
           }catch(SQLException se){
           }// do nothing
           try{
               if(conn!=null)
                   conn.close();
           }catch(SQLException se){
               se.printStackTrace();
           }//end finally try
       }//end try
       System.out.println("Goodbye!");



    }


}
