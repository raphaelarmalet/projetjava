import java.io.File;
import java.sql.SQLException;


public class Main {
    private String userECE;
    private String passwECE;
    private String userData;
    private String passwData;


    private String nomdatab;
    private String logindatab;
    private String passwdatab;


   static ModeConsole console;
   static ModeGraphique graph;

  static  Connexion ece;
  static Connexion datab;

  static SSHGraph obsshgraph;







    public void validerECE(){

    System.out.println("Entrez votre useraname ECE");
    userECE = console.toString();

    System.out.println("Entrez votre password ECE");
    passwECE = console.toString();

    System.out.println("Entrez votre useraname DataBase");
    userData = console.toString();

    System.out.println("Entrez votre password Database");
    passwData = console.toString();

        try {
            ece = new Connexion(userECE,passwECE,userData,passwData);
           // ece.affichBDD();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


    }
    public void validerDatabase()  {
        System.out.println("Entrez nom DataBase");
        nomdatab = console.toString();

        System.out.println("Entrez votre login Database");
        logindatab = console.toString();

        System.out.println("Entrez votre password Databse");
        passwdatab = console.toString();


        try {
            datab= new Connexion(nomdatab,logindatab,passwdatab);
            datab.affichBDD();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {


         Main object =new Main();  // object du main

        console = new ModeConsole(); //  instancier la console
        graph =new ModeGraphique();//instancier le mode graphique
        obsshgraph = new SSHGraph();


        graph.afficheMenu(); // aficher mode graphique
        graph.SSHacces();
        graph.Localaccess();
      //  ece.affichBDD();





        char choix = console.menu();

        switch (choix) {
            case '1':


                    object.validerDatabase();

                break;
            case '2':
                object.validerECE();
                break;
            case '0':
                System.exit(0);
                break;
            default:
                System.out.println("Erreur de choix");
        }


    }


}
