import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
/*
 * Created by JFormDesigner on Thu Mar 24 14:22:48 GMT 2016
 */


/**
 * @author Dario Guida
 */
public class MainForm extends JFrame {
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Dario Guida
    private JPanel panel1;
    private JButton settingButton;
    private JButton helpButton;
    private JButton logOutButton;
    private JButton button1;
    private JTabbedPane tabbedPane1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;

    public MainForm() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Dario Guida
        panel1 = new JPanel();
        settingButton = new JButton();
        helpButton = new JButton();
        logOutButton = new JButton();
        button1 = new JButton();
        tabbedPane1 = new JTabbedPane();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();

        //======== this ========
        setBackground(new Color(63, 63, 63));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setIconImage(null);
        setAutoRequestFocus(false);
        setAlwaysOnTop(true);
        setTitle("Hotel Booking System");
        Container contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBackground(new Color(63, 63, 63));

            // JFormDesigner evaluation mark
            panel1.setBorder(new javax.swing.border.CompoundBorder(
                    new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                            "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                            javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                            java.awt.Color.red), panel1.getBorder()));
            panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                public void propertyChange(java.beans.PropertyChangeEvent e) {
                    if ("border".equals(e.getPropertyName())) throw new RuntimeException();
                }
            });


            //---- settingButton ----
            settingButton.setIcon(new ImageIcon("/Users/Dario/Developmet/Java/HotelBooking/src/Resources/settings-icon.png"));
            settingButton.setBackground(Color.white);
            settingButton.setBorder(LineBorder.createBlackLineBorder());
            settingButton.setBorderPainted(false);

            //---- helpButton ----
            helpButton.setIcon(new ImageIcon("/Users/Dario/Developmet/Java/HotelBooking/src/Resources/settings-icon.png"));
            helpButton.setBackground(Color.white);
            helpButton.setBorder(LineBorder.createBlackLineBorder());
            helpButton.setBorderPainted(false);

            //---- logOutButton ----
            logOutButton.setIcon(new ImageIcon("/Users/Dario/Developmet/Java/HotelBooking/src/Resources/settings-icon.png"));
            logOutButton.setBackground(Color.white);
            logOutButton.setBorder(LineBorder.createBlackLineBorder());
            logOutButton.setBorderPainted(false);

            //---- button1 ----
            button1.setEnabled(false);
            button1.setIcon(new ImageIcon("/Users/Dario/Desktop/logo.jpg"));
            button1.setBorderPainted(false);
            button1.setBorder(null);

            //======== tabbedPane1 ========
            {
                tabbedPane1.setBackground(Color.white);
                tabbedPane1.setBorder(new EtchedBorder());

                //======== panel2 ========
                {
                    panel2.setBackground(Color.white);
                    panel2.setBorder(null);

                    GroupLayout panel2Layout = new GroupLayout(panel2);
                    panel2.setLayout(panel2Layout);
                    panel2Layout.setHorizontalGroup(
                            panel2Layout.createParallelGroup()
                                    .addGap(0, 1131, Short.MAX_VALUE)
                    );
                    panel2Layout.setVerticalGroup(
                            panel2Layout.createParallelGroup()
                                    .addGap(0, 509, Short.MAX_VALUE)
                    );
                }
                tabbedPane1.addTab("CALENDAR", panel2);

                //======== panel3 ========
                {

                    GroupLayout panel3Layout = new GroupLayout(panel3);
                    panel3.setLayout(panel3Layout);
                    panel3Layout.setHorizontalGroup(
                            panel3Layout.createParallelGroup()
                                    .addGap(0, 1165, Short.MAX_VALUE)
                    );
                    panel3Layout.setVerticalGroup(
                            panel3Layout.createParallelGroup()
                                    .addGap(0, 539, Short.MAX_VALUE)
                    );
                }
                tabbedPane1.addTab("CREATE BOOKING", panel3);

                //======== panel4 ========
                {

                    GroupLayout panel4Layout = new GroupLayout(panel4);
                    panel4.setLayout(panel4Layout);
                    panel4Layout.setHorizontalGroup(
                            panel4Layout.createParallelGroup()
                                    .addGap(0, 1165, Short.MAX_VALUE)
                    );
                    panel4Layout.setVerticalGroup(
                            panel4Layout.createParallelGroup()
                                    .addGap(0, 539, Short.MAX_VALUE)
                    );
                }
                tabbedPane1.addTab("ROOM STATUS", panel4);
            }

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                    .addGroup(panel1Layout.createParallelGroup()
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                    .addGap(312, 312, 312)
                                                    .addComponent(button1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGap(159, 159, 159)
                                                    .addComponent(settingButton, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(logOutButton, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(helpButton, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                                    .addContainerGap()
                                                    .addComponent(tabbedPane1, GroupLayout.DEFAULT_SIZE, 1174, Short.MAX_VALUE)))
                                    .addContainerGap())
            );
            panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                    .addGroup(panel1Layout.createParallelGroup()
                                            .addComponent(helpButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(logOutButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(settingButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addComponent(tabbedPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(46, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
