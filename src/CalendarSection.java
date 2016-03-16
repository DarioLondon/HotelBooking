import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Created by Dario on 16/03/2016.
 */
public class CalendarSection extends JPanel {

    final JButton next   =new JButton(new ImageIcon(((new ImageIcon(this.getClass().getResource("Resources/next-icon.png"))).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
    final JButton back   =new JButton(new ImageIcon(((new ImageIcon(this.getClass().getResource("Resources/back-icon.png"))).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));

    final JLabel[] labels=new JLabel[32];
    CalendarSection(){
        Dimension size= getPreferredSize();
        size.width=1000;
        size.height=100;
        setPreferredSize(size);



        setLayout(new GridBagLayout());

        GridBagConstraints navCon = new GridBagConstraints();


        for(int counter=1;counter<labels.length;counter++){

            labels[counter]=new JLabel(String.valueOf(counter));

            navCon.anchor= GridBagConstraints.CENTER;
            navCon.gridx=counter;
            navCon.gridy=2;
            Border border=BorderFactory.createLineBorder(Color.blue);
            Border paddingBorder = BorderFactory.createEmptyBorder(10,10,10,10);
            labels[counter].setBorder(BorderFactory.createCompoundBorder(border,paddingBorder));
            labels[counter].setHorizontalTextPosition(SwingConstants.CENTER);
            labels[counter].setVerticalTextPosition(SwingConstants.CENTER);
            labels[counter].setVerticalAlignment(SwingConstants.CENTER);
            labels[counter].setMinimumSize(new Dimension(50,50));
            labels[counter].setFont(new Font("Serif", Font.BOLD, 12));
            add(labels[counter],navCon);

        }

        navCon.anchor=GridBagConstraints.CENTER;
        navCon.gridx = 0;
        navCon.gridy = 2;
        add(back, navCon);


        navCon.anchor=GridBagConstraints.CENTER;
        navCon.gridx = 32;
        navCon.gridy = 2;
        add(next, navCon);

    }


}
