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
    User user =new User();
    LogIn login= new LogIn();
    private JPanel loginPanel;
    private Container container;
    private GridBagConstraints c = new GridBagConstraints();
    private JPanel mainContainer;


    LogInGui() {

        this.init();
        super.setSize(WIDTH, HEIGHT);
        super.setMinimumSize(new Dimension(WIDTH, HEIGHT));
        super.setMaximumSize(new Dimension(WIDTH, HEIGHT));
        super.setTitle("Login :");
        super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        pack();
        super.setVisible(true);



    }


    public void init() {
         container= this.getContentPane();
         mainContainer=new JPanel();
         loginPanel = new JPanel(new GridBagLayout());
         loginPanel.setBackground(Color.GRAY);
         mainContainer.add(loginPanel,BorderLayout.CENTER);




        JLabel nameLabel = new JLabel("Name :");
        c.gridx = 0;
        c.gridy = 0;
        loginPanel.add(nameLabel, c);

        JTextField nameField= new JTextField(15);
        c.gridx = 1;
        c.gridy = 0;
        nameField.setToolTipText("Please enter username");
        loginPanel.add(nameField, c);


          JLabel passwordLabel = new JLabel("Password:");
        c.gridx = 0;
        c.gridy = 1;
        loginPanel.add(passwordLabel, c);

         JPasswordField passwordField = new JPasswordField(15);
        c.gridx = 1;
        c.gridy = 1;
        passwordField.setToolTipText("Please enter password");
        loginPanel.add(passwordField, c);





        JButton loginButton = new JButton("LogIn");

        c.gridy = 3;
        loginPanel.add(loginButton, c);


          JLabel feedbackConnection=new JLabel();
        c.gridx = 1;
        c.gridy = 4;
        loginPanel.add(feedbackConnection, c);






        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingWorker<Boolean,Void> worker=new SwingWorker<Boolean,Void>() {
                    @Override
                    protected Boolean doInBackground() throws Exception {
                        String password="";
                        char[] tmppw=passwordField.getPassword();
                        for(int i=0;i<tmppw.length;i++){
                            password+=tmppw[i];
                        }

                        //System.out.println(password);
                        user.setUsername(nameField.getText());
                        user.setPassword(password);


                        boolean conn=login.getUserDetails(user.getUsername(),user.getPassword());





                        return conn;
                    }

                    @Override
                    protected void done() {
                        boolean connection;
                        try{
                            connection=get();
                            if(connection){

                                MainGui gui=new MainGui();

                            }else{
                                nameField.setText("");
                                passwordField.setText("");
                                feedbackConnection.setText("Wrong Username/Password");
                            }
                        }catch(Exception e){
                            e.printStackTrace();
                        }
                    }
                };


                worker.execute();




            }

        });


        container.add(loginPanel);



    }




}
