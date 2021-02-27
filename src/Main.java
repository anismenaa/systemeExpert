import chainages.Chainage_avant;
import classes.*;

public class Main {
    public static void main(String[] args) {
        // here we check chainage avant
        Initialisation init = new Initialisation(5,2);
        init.start();
        Chainage_avant chainage_avant = new Chainage_avant(init,"c");
        chainage_avant.start();

        for (Regle r: chainage_avant.getReglesResultat()){
            System.out.println(r.getFait_resultant());
        }
        // here we check chainage arriere

    }
}
