import sun.swing.SwingAccessor;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Year;
import java.util.Calendar;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

import static java.awt.BorderLayout.*;
import static java.awt.Font.BOLD;

/**
 * Created by Dario on 22/02/2016.
 */
public class MainGui extends JFrame {
    final static private int WIDTH = 1400;
    final static private int HEIGHT = 800;

    CalendarSystem cal= new CalendarSystem();
    private Header headerPanel;
    private CalendarSection calendarSection;
    private JPanel TopPanel;



    MainGui() {


        super.setSize(WIDTH, HEIGHT);
        super.setMinimumSize(new Dimension(WIDTH, HEIGHT));
       // super.setMaximumSize(new Dimension(WIDTH, HEIGHT));
        super.setTitle("Hotel Booking System:");
        super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       // Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
       // this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        setLayout(new BorderLayout());
        headerPanel=new Header();
        calendarSection=new CalendarSection();
        TopPanel=new JPanel();
        TopPanel.setLayout(new BoxLayout(TopPanel,BoxLayout.Y_AXIS));
        TopPanel.add(headerPanel);
        TopPanel.add(calendarSection);
        Container container = this.getContentPane();

        container.add(TopPanel, NORTH);


         pack();
        super.setVisible(true);
    }

    public void init() {
















        SwingWorker<String[],Void> worker=new SwingWorker<String[],Void>() {
            @Override
            protected String[] doInBackground() throws Exception {

                String[] days;
                days=cal.getDayinMonth();

                return days ;
            }
            @Override
            protected void done(){

                String[] days;
                try{
                    days=get();

                    for(int i=0; i<days.length;i++) {

                       // labels[i].setText(String.valueOf(days[i]));

                    }

                }catch (InterruptedException e) {
                    e.printStackTrace();


                }catch (ExecutionException e){
                    e.printStackTrace();

                }
            }

        };
        worker.execute();


    }


}
