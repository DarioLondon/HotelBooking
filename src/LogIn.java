/**
 * Created by Dario on 22/02/2016.
 */
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class LogIn{
    // JDBC driver name and database URL

    static final String DB_URL = "jdbc:mysql://localhost:2222/w1409831_0?verifyServerCertificate=false&useSSL=true&requireSSL=true";

    //  Database credentials
    static final String USER = "w1409831";
    static final String PASS = "m1Gj6kC1IYUy";

   public void connectiondb(){
        Connection conn = null;
        Statement stmt = null;

        try{

            //STEP 3: Open a connection
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");

            //STEP 4: Execute a query
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

    public boolean getUserDetails(String _username, String _pwd ){
        Connection conn = null;
        Statement stmt = null;
        boolean isResult=false;
        try{

            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");

            //STEP 4: Execute a query
            System.out.println("Creating table in given database...");

            Statement st = conn.createStatement();
            String sql = ("SELECT * FROM users ");
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()) {
                int level = rs.getInt("level");
                String tmp_username = rs.getString("password");
                String tmp_pwd = rs.getString("password");
                if(tmp_username.equals(_username)&& tmp_pwd.equals(_pwd)){

                    conn.close();
                    isResult=true;
                }
                else{
                    isResult=false;
                }

            }

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


        return isResult;
    }


    public void update(String romm, String dateIn, String dateOut, String name ,String Surname,String creditCard,String[] address ){



    }


}