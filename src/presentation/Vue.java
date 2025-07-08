package presentation;
import dao.BD;
import domaine.*;
import metier.Traitement;

import java.lang.reflect.GenericSignatureFormatError;
import java.util.Scanner;
// import dao.BD;

public class Vue {

    public static void main(String [] args){
        int choix=0;
        Scanner sc=new Scanner(System.in);
        BD bd=new BD();
        Traitement tr=new Traitement(bd);

        int matr, nh, tauxh;
        double prime, salbase;
        String nom, prenom, grade, codeDep, nomDep;
        do {
            System.out.println("1. Créer Département");
            System.out.println("2. Lister les départements");
            System.out.println("3. Créer Vacataire");
            System.out.println("4. Créer Permanent");
            System.out.println("5. Rattacher un vacataire à un Département");
            System.out.println("6. Rattacher un permanent à un Département");
            System.out.println("7. Lister les vacataires");
            System.out.println("8. Lister les permanents");
            System.out.println("9. Lister les statistiques");
            System.out.println("10. Sortie");
            System.out.println("Faîtes votre choix");
            choix=sc.nextInt();
            sc.nextLine();
            switch (choix)
            {
                case 1:
                    System.out.println("Code : ");
                    codeDep = sc.nextLine();
                    System.out.println("Nom : ");
                    nomDep = sc.nextLine();
                    Departement dept =new Departement(codeDep, nomDep);
                    bd.ajouterDepartement(dept);
                    break;

                case 2:
                    bd.afficherDepartements();
                    break;

                case 3:
                    System.out.println("Matricule : ");
                    matr=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nom : ");
                    nom = sc.nextLine();
                    System.out.println("Prénom : ");
                    prenom = sc.nextLine();
                    System.out.println("Nombre d'heures : ");
                    nh=sc.nextInt();
                    System.out.println("Taux horaire : ");
                    tauxh=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Grade : ");
                    grade=sc.nextLine();
                    Vacataire v = new Vacataire(matr, nom, prenom, grade, nh, tauxh);
                    bd.ajouterVacataire(v);
                    break;

                case 4:
                    System.out.println("Matricule : ");
                    matr=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nom : ");
                    nom = sc.nextLine();
                    System.out.println("Prénom : ");
                    prenom = sc.nextLine();
                    System.out.println("Salaire de base : ");
                    salbase=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Prime : ");
                    prime=sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Grade : ");
                    grade=sc.nextLine();
                    Permanent p = new Permanent(matr, nom, prenom, grade, salbase, prime);
                    bd.ajouterPermanent(p);
                    break;

                case 5:

                    System.out.println("Donner le code du département recherché : ");
                    codeDep= sc.nextLine();
                    Departement dp= bd.rechercherDepartement(codeDep);
                    if (dp==null){
                        System.out.println("le département n'existe pas !!!");
                        break;
                    }else {
                        System.out.println("Donner le matricule de l'enseignant recherché : ");
                        matr= sc.nextInt();
                        sc.nextLine();
                        Enseignant ens = bd.rechercherEnseignant(matr);
                        if (ens==null){
                            System.out.println("l'enseignant n'existe pas !!!");
                        }else{
                            bd.liaisonsEnseignantDepartement(dp, ens);
                        }
                    }

                    break;

                case 6:

                    System.out.println("Donner le code du département recherché : ");
                    codeDep= sc.nextLine();
                    Departement de= bd.rechercherDepartement(codeDep);
                    if (de==null){
                        System.out.println("le département n'existe pas !!!");
                        break;
                    }else {
                        System.out.println("Donner le matricule de l'enseignant recherché : ");
                        matr= sc.nextInt();
                        sc.nextLine();
                        Enseignant ens=bd.rechercherEnseignant(matr);
                        if (ens==null){
                            System.out.println("l'enseignant n'existe pas !!!");
                        }else{
                            bd.liaisonsEnseignantDepartement(de, ens);
                        }
                    }
                    break;

                case 7:
                    bd.afficherVacataires();
                    break;

                case 8:
                    bd.afficherPermanents();
                    break;

                case 9:
                    tr.statistiques();
                    break;
            }
        } while (choix!=10);
            System.out.println("Fin Application");

    }
}
