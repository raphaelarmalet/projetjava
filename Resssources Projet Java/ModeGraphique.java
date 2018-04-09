import javax.swing.*;
import java.awt.*;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.imageio.ImageIO;


public class ModeGraphique extends JFrame  {

    private JButton sShb = new JButton();
    private JButton localhostb = new JButton();
    private JButton fauxtruc=new JButton();
    private JPanel pangraph;

    private SSHGraph accesSSH = new SSHGraph();
    private LocalGraph accessLocal = new LocalGraph();



    ImageIcon imgssh = new ImageIcon("ssh.png");
    ImageIcon imglocal = new ImageIcon("local.png");



    public ModeGraphique(){

        pangraph=new JPanel();

        this.setTitle("Acceuil");
        this.setSize(800, 600);

        //getContentPane().add(pangraph);


        //sShb.setText("SSH");
        sShb.setSize(50,50);
        sShb.setLocation(50,500);
        sShb.setIcon(imgssh);



        //localhostb.setText("Localhost");
        localhostb.setSize(50,50);
        localhostb.setLocation(300,500);
        localhostb.setIcon(imglocal);




        fauxtruc.setText("cc");





    }

    public void afficheMenu(){

        // rendre la fenetre visible

        this.add(sShb);
        this.add(localhostb);



        this.add(fauxtruc);




        fauxtruc.setVisible(false);
        this.setVisible(true);

        //SSHacces();

    }



    public void SSHacces() {

        sShb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            pangraph.add(accesSSH.afficherSSH());




            }
        });

        pangraph.add(accesSSH.Test_ConnexSSH());





}
public void Localaccess(){

        localhostb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pangraph.add(accessLocal.affichLocal());
            }
        });

        //accessLocal.Test_ConnexLocal();

}
}
