import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LocalGraph extends JFrame{
    JPanel pan ;

    private JLabel nom_DB= new JLabel();
    private JLabel login_DB= new JLabel();
    private JLabel password_DB= new JLabel();

    private JTextArea nom_DBt= new JTextArea();
    private JTextArea login_DBt= new JTextArea();
    private JTextArea password_DBt= new JTextArea();

    private JLabel message1=new JLabel();

    private JButton valider = new JButton();
    private JLabel fauxtruc= new JLabel();

   private String nom_BDs;
    private String login_BDs;
    private String password_BDS;

    static RequetteSQL requSQL;

    Connexion conxLocal;

    public LocalGraph(){
        pan=new JPanel();

        this.setTitle("Acceuil Local");
        this.setSize(800, 600);

        nom_DB.setText("nom base de donnee");
        nom_DB.setSize(200,25);
        nom_DB.setLocation(50,50);


        nom_DBt.setSize(200,25);
        nom_DBt.setLocation(300,50);


        login_DB.setText("login base de donnee");
        login_DB.setSize(200,25);
        login_DB.setLocation(50,200);

        login_DBt.setSize(200,25);
        login_DBt.setLocation(300,200);

        password_DB.setText("passeword base de donnee");
        password_DB.setSize(200,25);
        password_DB.setLocation(50,350);

        password_DBt.setSize(200,25);
        password_DBt.setLocation(300,350);

        valider.setText("Valider");
        valider.setSize(100,25);
        valider.setLocation(500,500);

        message1.setText("");
        message1.setSize(100,25);
        message1.setLocation(0,500);

        //Test_ConnexLocal();


    }

    public JPanel affichLocal(){

        this.add(nom_DB);
        this.add(nom_DBt);
        this.add(login_DB);
        this.add(login_DBt);
        this.add(password_DB);
        this.add(password_DBt);
        this.add(valider);
        this.add(message1);
        this.add(fauxtruc);
        fauxtruc.setVisible(false);
        Test_ConnexLocal();

        this.setVisible(true);

        return pan;
    }

    public void Test_ConnexLocal(){

        //Utiliser l'action du boutton valider

        valider.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                nom_BDs=nom_DBt.getText();
                login_BDs=login_DBt.getText();
                password_BDS=password_DBt.getText();

                try {
                    conxLocal= new Connexion(nom_BDs,login_BDs,password_BDS);

                } catch (Exception ex) {

                    System.out.println(ex.getMessage());
                    message1.setText(ex.getMessage());
                    pan.add(message1);
                    pan.add(fauxtruc);
                    //fauxtruc.setVisible(false);
                   pan.setVisible(true);


                }

            }
        });


    }

}
