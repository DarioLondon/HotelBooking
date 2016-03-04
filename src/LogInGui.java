import javafx.scene.control.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Created by Dario on 12/02/2016.
 */
public class LogInGui extends JFrame {

    final static private int WIDTH = 500;
    final static private int HEIGHT = 500;

    protected JPanel loginPanel;
    protected JLabel nameLabel ;
    protected JLabel passwordLabel;
    protected JLabel feedbackConnection;
    protected JButton loginButton;
    protected String username;
    protected char[] password;

    LogInGui() {

        this.init();
        super.setSize(WIDTH, HEIGHT);
        super.setMinimumSize(new Dimension(WIDTH, HEIGHT));
        super.setMaximumSize(new Dimension(WIDTH, HEIGHT));
        super.setTitle("Login :");
        super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        super.setVisible(true);



    }


    public void init() {

        Container container = this.getContentPane();
        loginPanel = new JPanel(new GridBagLayout());
        loginPanel.setBackground(Color.GRAY);
        container.add(loginPanel);
        nameLabel = new JLabel("Name :");
        passwordLabel = new JLabel("Password:");
        loginButton = new JButton("Log In");
        JTextField nameField= new JTextField();
        JPasswordField passwordField = new JPasswordField();
        feedbackConnection=new JLabel("Wrong Username/Password");
        feedbackConnection.setVisible(true);
        GridBagConstraints c = new GridBagConstraints();
        nameField.setSize(new Dimension(100, 50));


        c.gridx = 0;
        c.gridy = 0;
        loginPanel.add(nameLabel, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipadx = 150;      //make this component ta
        c.gridx = 1;
        c.gridy = 0;
        nameField.setToolTipText("Please enter username");
        loginPanel.add(nameField, c);


        c.ipadx = 0;
        c.gridx = 0;
        c.gridy = 1;
        loginPanel.add(passwordLabel, c);

        c.gridx = 1;
        c.gridy = 1;
        passwordField.setToolTipText("Please enter password");
        loginPanel.add(passwordField, c);

        c.ipadx = 80;
        c.ipady = 10;
        c.gridx = 1;
        c.gridy = 2;
        loginPanel.add(loginButton, c);

        c.gridx = 1;
        c.gridy = 4;
        loginPanel.add(feedbackConnection, c);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                username=nameField.getText();
                password=passwordField.getPassword();
               if(isPasswordCorrect(password)){

               }else{
                   MainGui gui=new MainGui();
                   gui.init();
               }
                System.out.println("Username : "+username);



            }

        });

        loginPanel.setVisible(true);





    }

    private static boolean isPasswordCorrect(char[] inputPassword) {
        char[] actualPassword = { 'h', 'e', 'm', 'a', 'n', 't', 'h' };
        if (inputPassword.length != actualPassword.length)
            return false; // Return false if lengths are unequal
        for (int i = 0; i < inputPassword.length; i++)
        if (inputPassword[i] != actualPassword[i])
            return false;
        return true;
    }



}
