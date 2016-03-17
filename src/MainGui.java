import javax.swing.*;
import java.awt.*;
import java.util.concurrent.ExecutionException;

import static java.awt.BorderLayout.*;

/**
 * Created by Dario on 22/02/2016.
 */
public class MainGui extends JFrame {
    final static private int WIDTH = 1400;
    final static private int HEIGHT = 800;

    CalendarSystem cal= new CalendarSystem();
    private Header headerPanel;
    private CalendarSection calendarSection;
    private JPanel topPanel;



    MainGui() {


        super.setSize(WIDTH, HEIGHT);
        super.setMinimumSize(new Dimension(WIDTH, HEIGHT));
       // super.setMaximumSize(new Dimension(WIDTH, HEIGHT));
        super.setTitle("Hotel Booking System:");
        super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        setLayout(new BorderLayout());
        headerPanel=new Header();
        calendarSection=new CalendarSection();
        topPanel =new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel,BoxLayout.Y_AXIS));
        topPanel.add(headerPanel);
        topPanel.add(calendarSection);
        Container container = this.getContentPane();
        container.add(topPanel, NORTH);
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
