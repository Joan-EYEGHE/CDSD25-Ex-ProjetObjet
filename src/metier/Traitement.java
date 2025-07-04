package metier;

import dao.BD;
import domaine.*;
import java.util.ArrayList;

public class Traitement {

    private BD bd=new BD();

    // Gérer les calculs
    private void statistiques(){
        ArrayList<Enseignant> listeens=bd.obtenirEnseignants();
        int ctv=0; // nombre de vacataires
        int ctp=0; // nombre de Permanents
        for (Enseignant e : listeens){
            if (e instanceof Permanent){
                ctp++;
            }else {
                ctv++;
            }
        }

        System.out.println("Nombre de vacataires : "+ ctv );
        System.out.println("Nombre de permanents : " +ctp);
        System.out.println("Pourcentage de vacataires : " +((ctv)/(ctv+ctp)));
        System.out.println("Pourcentage de permanents : " +((ctp)/(ctv+ctp)));
    }
}
