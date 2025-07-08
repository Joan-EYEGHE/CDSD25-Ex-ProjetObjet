package domaine;

public abstract class Enseignant {
    // Attributs propres
    private int matr;
    private String nom;
    private String prenom;
    private String grade;
    // Attributs d'association
    private Departement affectation;

    public Enseignant(int matr, String nom, String prenom, String grade) {
        this.matr = matr;
        this.nom = nom;
        this.prenom = prenom;
        this.grade = grade;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setAffectation(Departement affectation) {
        this.affectation = affectation;
    }

    public int getMatr() {
        return matr;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getGrade() {
        return grade;
    }

    public Departement getAffectation() {
        return affectation;
    }

    // Ajout d'une methode abstraite
    public abstract double salaire_Net();
}
