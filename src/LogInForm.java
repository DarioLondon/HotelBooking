import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
/*
 * Created by JFormDesigner on Thu Mar 24 14:00:23 GMT 2016
 */


/**
 * @author Dario Guida
 */
public class LogInForm extends JFrame {
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Dario Guida
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JButton LogIn;
    private JTextField inputUsername;
    private JPasswordField inputPassword1;
    private JLabel feedbackConnection;

    public LogInForm() {
        initComponents();
    }

    private void LogInActionPerformed(ActionEvent e) {
        User user = new User();
        LogIn login = new LogIn();
        SwingWorker<Boolean, Void> worker = new SwingWorker<Boolean, Void>() {
            @Override
            protected Boolean doInBackground() throws Exception {
                String password = "";
                char[] tmppw = inputPassword1.getPassword();
                for (int i = 0; i < tmppw.length; i++) {
                    password += tmppw[i];
                }

                //System.out.println(password);
                user.setUsername(inputUsername.getText());
                user.setPassword(password);


                boolean conn = login.getUserDetails(user.getUsername(), user.getPassword());


                return conn;
            }

            @Override
            protected void done() {
                boolean connection;
                try {
                    connection = get();
                    if (connection) {

                        feedbackConnection.setText("Access Granted");
                        new MainForm().setVisible(true);
                        LogInForm.this.setVisible(false);

                    } else {
                        inputUsername.setText("");
                        inputPassword1.setText("");
                        feedbackConnection.setText("Wrong Username/Password");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };


        worker.execute();


    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Dario Guida
        usernameLabel = new JLabel();
        passwordLabel = new JLabel();
        LogIn = new JButton();
        inputUsername = new JTextField();
        inputPassword1 = new JPasswordField();
        feedbackConnection = new JLabel();

        //======== this ========
        setTitle("User LogIn");
        setMinimumSize(new Dimension(300, 300));
        setBackground(new Color(70, 70, 70));
        setFont(new Font("Helvetica Neue", Font.PLAIN, 15));
        setMaximizedBounds(new Rectangle(0, 0, 300, 300));
        Container contentPane = getContentPane();

        //---- usernameLabel ----
        usernameLabel.setText("UserName :");
        usernameLabel.setHorizontalAlignment(SwingConstants.TRAILING);

        //---- passwordLabel ----
        passwordLabel.setText("Password :");
        passwordLabel.setHorizontalAlignment(SwingConstants.TRAILING);

        //---- LogIn ----
        LogIn.setText("Login");
        LogIn.addActionListener(e -> LogInActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(usernameLabel, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passwordLabel, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                        .addComponent(inputPassword1)
                                                        .addComponent(inputUsername, GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addComponent(LogIn, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 99, Short.MAX_VALUE)))
                                                .addGap(14, 14, 14))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(feedbackConnection, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(68, Short.MAX_VALUE))))
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(usernameLabel, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(inputUsername, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(passwordLabel, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(inputPassword1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addComponent(feedbackConnection, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LogIn)
                                .addContainerGap(130, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
