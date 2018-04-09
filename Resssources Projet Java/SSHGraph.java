import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SSHGraph extends JFrame {
    JPanel pan;

    private JLabel username_ECE= new JLabel();
    private JLabel password_ECE= new JLabel();
    private JLabel username_DB= new JLabel();
    private JLabel password_DB= new JLabel();
    private JTextArea username_ECEt= new JTextArea();
    private JTextArea username_DBt= new JTextArea();
    private JTextArea password_ECEt= new JTextArea();
    private JTextArea password_DBt= new JTextArea();

    private String username_ECEString;
    private String password_ECEString;
    private String username_BDString;
    private String password_BDString;


    private JButton valider = new JButton();
    private JLabel message_1=new JLabel();
    private JLabel fauxtruc= new JLabel();

    Connexion conxSSh;

    public SSHGraph(){

        pan=new JPanel();

        this.setTitle("Acceuil SSH");
        this.setSize(800, 600);


        username_ECE.setText("username ECE");
        username_ECE.setSize(100,25);
        username_ECE.setLocation(50,50);


        username_ECEt.setSize(200,25);
        username_ECEt.setLocation(300,50);


        password_ECE.setText("Password ECE");
        password_ECE.setSize(100,25);
        password_ECE.setLocation(50,200);

        password_ECEt.setSize(200,25);
        password_ECEt.setLocation(300,200);

        username_DB.setText("username DB");
        username_DB.setSize(100,25);
        username_DB.setLocation(50,350);

        username_DBt.setSize(200,25);
        username_DBt.setLocation(300,350);


        password_DB.setText("Password DB");
        password_DB.setSize(100,25);
        password_DB.setLocation(50,450);

        password_DBt.setSize(200,25);
        password_DBt.setLocation(300,450);

        valider.setText("Valider");
        valider.setSize(100,25);
        valider.setLocation(500,500);

        message_1.setSize(100,25);
        message_1.setLocation(0,500);


    }

    public JPanel afficherSSH(){

        this.add(username_ECE);
        this.add(password_ECE);
        this.add(username_DB);
        this.add(password_DB);

        this.add(username_ECEt);
        this.add(password_ECEt);
        this.add(username_DBt);
        this.add(password_DBt);

        this.add(valider);




        this.add(fauxtruc);


        fauxtruc.setVisible(false);


        this.setVisible(true);



        return pan;
    }

    public JPanel Test_ConnexSSH(){



        valider.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                username_ECEString=username_ECEt.getText();
                password_ECEString=password_ECEt.getText();
                username_BDString=username_DBt.getText();
                password_BDString=password_DBt.getText();

                try {
                    conxSSh= new Connexion(username_ECEString,password_ECEString,username_BDString,password_BDString);
                    message_1.setText("");
                    pan.add(message_1);
                    fauxtruc.setVisible(false);
                    pan.setVisible(true);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                    message_1.setText(ex.getMessage());
                    pan.add(message_1);
                    fauxtruc.setVisible(false);
                    pan.setVisible(true);

                }

            }
        });


        return pan;



    }




}
