import javax.swing.*;
import java.awt.*;

/**
 * Created by Dario on 22/02/2016.
 */
public class MainGui extends JFrame {
    final static private int WIDTH = 1200;
    final static private int HEIGHT = 800;
    MainGui() {

        this.init();
        super.setSize(WIDTH, HEIGHT);
        super.setMinimumSize(new Dimension(WIDTH, HEIGHT));
        //super.setMaximumSize(new Dimension(WIDTH, HEIGHT));
        super.setTitle("Hotel Booking System:");
        super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        super.setVisible(true);
    }

   protected void init(){



   }


}
