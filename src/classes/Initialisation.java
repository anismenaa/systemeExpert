package classes;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Initialisation {
    // on initialise la base de regles et la base de faits ( on aura besoin du nbRegles et nbFaits)
    private int nb_regles;
    private int nb_faits;
    private BaseRegles bR = new BaseRegles(); //la base de regles
    private BaseFaits bF = new BaseFaits(); //la base de faits

    public Initialisation(int nb_regles, int nb_faits){
        this.nb_regles = nb_regles;
        this.nb_faits = nb_faits;
    }

    public void start(){
        Scanner sc = new Scanner(System.in);
        //on initialise la base de regles
        System.out.println("***************** INITIALISATION DE BASE DE REGLES ***************\n");
        for (int i=1; i<=this.nb_regles; i++){
            Regle newRegle = new Regle();
            System.out.print("* la règle "+i+" : \n");
            System.out.print("- le nombre de condition : "); // on introduit le nombre de condition
            newRegle.setNb_conditions(sc.nextInt());
            for (int k=1; k<=newRegle.getNb_conditions(); k++){
                System.out.print("-- condition "+k+" : ");
                newRegle.getCondition_list().add(sc.next());
            }
            System.out.print("- le nombre de faits resultants : ");
            newRegle.setNb_resultantes(sc.nextInt());
            for (int k=1; k<=newRegle.getNb_resultantes(); k++){
                System.out.print("-- resultante "+k+" : ");
                newRegle.getFait_resultant().add(sc.next());
            }
            newRegle.setDesactive(false);
            bR.addRegle(newRegle); //on ajoute la regle à la base de regles
            //ajout de conditions
        }

        System.out.println("***************** INITIALISATION DE BASE DE fait ***************\n");
        //on initialise la base de faits
        for (int j=1; j<=this.nb_faits; j++){
            System.out.print("le fait "+j+" : ");
            bF.getFait().add(sc.next());
        }
        sc.close();
    }

    public int getNb_regles() {
        return nb_regles;
    }

    public int getNb_faits() {
        return nb_faits;
    }

    public BaseRegles getbR() {
        return bR;
    }

    public BaseFaits getbF() {
        return bF;
    }
}
