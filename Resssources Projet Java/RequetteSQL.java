import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RequetteSQL extends JFrame {

    JPanel pan;
    Connexion conx;
    JButton patientmutuel = new JButton();

    private JLabel fauxtruc= new JLabel();

    public RequetteSQL(){
        pan = new JPanel();

        this.setTitle("Requette SQL");
        this.setSize(800, 600);

        patientmutuel.setSize(200, 50);
        patientmutuel.setLocation(300, 500);
        patientmutuel.setText("Patient et Mutuel MAAF");

    }

    public void affichage(){

        this.add(patientmutuel);
        this.add(fauxtruc);
       fauxtruc.setVisible(false);
        this.setVisible(true);


    }

    public void Patientmutuelacces() {

        patientmutuel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                conx.PatientMutuelMAAF();


            }
        });

    }
}
