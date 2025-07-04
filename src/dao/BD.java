package dao;
import domaine.Departement;
import domaine.Enseignant;
import domaine.Permanent;
import domaine.Vacataire;
import java.util.ArrayList;

public class BD {
    // Listes
    private ArrayList<Enseignant> listeprof=new ArrayList<Enseignant>();
    private ArrayList<Departement> listedep=new ArrayList<Departement>();

    public void ajouterDepartement(Departement departement){
        listedep.add(departement);
    }

    public void afficherDepartements(){

        for ( Departement d : listedep) {
            System.out.println("Code departement : "+ d.getCode());
            System.out.println("Nom departement : "+ d.getNomdep());
        }
    }

    public Departement rechercherDepartement(String code){
        Departement dept =null;
        for (Departement de : listedep){
            if (de.getCode().equals(code)){
                dept=de;
                break;
            }
        }
        return dept;
    }

    public void ajouterVacataire(Vacataire vacataire){
        listeprof.add(vacataire);
    }

    public void ajouterPermanent(Permanent permanent){
        listeprof.add(permanent);
    }

    public void afficherPermanents() {
        for (Enseignant x : listeprof) {
            if (x instanceof Permanent) {
                // Subcasting <=> Conversion
                Permanent p = (Permanent) x;
                System.out.println("Matricule : " + p.getMart());
                System.out.println("Nom : " + p.getNom());
                System.out.println("Prénom : " + p.getPrenom());
                System.out.println("Grade : " + p.getGrade());
                System.out.println("Prime : " + p.getPrime());
                System.out.println("Salaire brut : " + p.getSalbase());
                System.out.println("Salaire net : " + p.salaire_Net());
            }
        }
    }

    public void afficherVacataires () {
        for (Enseignant x : listeprof) {
            if (x instanceof Vacataire) {
                // Subcasting <=> Conversion
                Vacataire v = (Vacataire) x;
                System.out.println("Matricule : " + v.getMart());
                System.out.println("Nom : " + v.getNom());
                System.out.println("Prénom : " + v.getPrenom());
                System.out.println("Grade : " + v.getGrade());
                System.out.println("Taux horaire : " + v.getTauxh());
                System.out.println("Nombre d'heures : " + v.getNh());
                System.out.println("Salaire net : " + v.salaire_Net());
            }
        }
    }

    public ArrayList<Enseignant> obtenirEnseignants(){
        return listeprof;
    }

    // Gérer l'association bidirectionnelle
    public void liaisonsEnseignantDepartement(Departement dept, Enseignant ens){
        ens.setAffectation(dept);
        dept.getListeens().add(ens);
    }
}