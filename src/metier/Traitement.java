package metier;

import dao.BD;
import domaine.*;
import java.util.ArrayList;

public class Traitement {

    // private BD bd=new BD();
    private BD bd;

    public Traitement(BD bd) {
        this.bd = bd;
    }

    // Gérer les calculs
    public void statistiques(){
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
        int total =ctp+ctv;

        if (total==0){
            System.out.println("Aucun enseignant dans la base.");
        }else {
            System.out.println("Nombre de vacataires : "+ ctv );
            System.out.println("Nombre de permanents : " +ctp);
            System.out.println("Pourcentage de vacataires : " +((ctv)/(total))*100+"%");
            System.out.println("Pourcentage de permanents : " +((ctp)/(total))*100+"%");
        }

    }
}
