import javax.swing.*;
import java.sql.*;

class Main {

    public   static LogInGui login;

    public static void main(String[] args) {


      /* try {
            JSplash splash= new JSplash(Main.class.getResource("splash.jpg"),true,true,false,"V 1.0",null,Color.GREEN,Color.BLUE);
            splash.splashOn();
            splash.setProgress(20,"Init");
            Thread.sleep(1000);
            splash.setProgress(40,"Loading ...");
            Thread.sleep(1000);
            splash.setProgress(60,"Get Resources");
            Thread.sleep(1000);
            splash.setProgress(80,"Applying ....");
            Thread.sleep(1000);
            splash.setProgress(100,"Done");
            Thread.sleep(1000);
            splash.splashOff();


        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                login = new LogInGui();
                login.init();


            }
        });

       ConnectionDb d=new ConnectionDb();
        try {
            d.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    }
