/**
 * Created by Dario on 16/03/2016.
 */


import java.sql.*;
import java.util.ArrayList;

public class ConnectionDb {



    //  Database credentials
    private static final String USER = "w1409831";
    private static final String PASS = "m1Gj6kC1IYUy";
    private static final String DATABASE="w1409831_0";
    private static final String DB_URL = "jdbc:mysql://localhost:2222/"+DATABASE+"?verifyServerCertificate=false&useSSL=true&requireSSL=true";


        public static  Connection getConnection() throws Exception{
            Connection conn = null ;

            try{

                //STEP 3: Open a connection
                System.out.println("Connecting to a selected database => "+DATABASE);
                conn = DriverManager.getConnection(DB_URL, USER, PASS);
                System.out.println("Connected database successfully...");



            }catch(SQLException se){
                //Handle errors for JDBC
                se.printStackTrace();
            }catch(Exception e){
                //Handle errors for Class.forName
                e.printStackTrace();
            }

           return conn;

        }


       public static void createTable() {
       Connection conn=null;
       Statement stmt=null;
       try{

           conn=getConnection();
           System.out.println("Creating table in given database => "+DATABASE);
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
                   "(room_id INTEGER NOT NULL, " +
                   " roomNumber INTEGER, " +
                   "bedAvailable INTEGER," +
                   "customer_id INT, " +
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
               System.out.println("Tables Created ");
           }catch(SQLException se){
           }// do nothing
           try{
               if(conn!=null)
                   conn.close();
               System.out.println("Connection Close");
           }catch(SQLException se){
               se.printStackTrace();
           }//end finally try
       }//end try




    }


    public boolean Authenticate(String username, String password) {

        Connection conn;
        PreparedStatement stmt;
        boolean authentication = false;
        String USER_AUTHENTICATION = "SELECT * FROM users WHERE username=? AND password=?";
        try{
            conn = getConnection();
            stmt = conn.prepareStatement(USER_AUTHENTICATION);
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet result = stmt.executeQuery();

            authentication = result.next();

        }catch(Exception e){
            e.printStackTrace();
        }

        return authentication;

    }

    public ArrayList<Room> getBookingData(ArrayList<Room> rooms) {

        Connection conn = null;
        Statement stm = null;
        ArrayList<Customer> customers = null;
        try {
            conn = getConnection();
            stm = conn.createStatement();
            String DATA_BOOKING = "SELECT * FROM rooms ";
            ResultSet result = stm.executeQuery(DATA_BOOKING);
            while (result.next()) {

                rooms.add(new Room(result.getInt("room_id"), result.getInt("roomNumber"), (Customer) result.getObject("customer"), result.getDate("checkIn"), result.getDate("checkOut")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rooms;
    }


}
