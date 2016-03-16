import javax.swing.*;
import java.awt.*;

/**
 * Created by Dario on 16/03/2016.
 */
public class Header extends JPanel {

    Header() {
        Dimension size = getPreferredSize();
        size.width = 1000;
        size.height = 60;
        setPreferredSize(size);
        final JButton setting = new JButton(new ImageIcon(((new ImageIcon(this.getClass().getResource("Resources/help-icon.png"))).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));
        final JButton help = new JButton(new ImageIcon(((new ImageIcon(this.getClass().getResource("Resources/settings-icon.png"))).getImage()).getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH)));


        setLayout(new GridBagLayout());

        GridBagConstraints navCon = new GridBagConstraints();

        final JLabel space0 = new JLabel("");

        navCon.gridx = 0;
        navCon.gridy = 0;
        navCon.weightx = 10;

        add(space0, navCon);



        navCon.weightx=0;
        navCon.gridx = 1;
        navCon.gridy = 0;
        add(setting, navCon);


        navCon.gridx = 2;
        navCon.gridy = 0;
        add(help, navCon);

        final JLabel space1 = new JLabel("");

        navCon.gridx = 3;
        navCon.gridy = 0;
        navCon.weightx = 1;

        add(space1, navCon);


    }

}
