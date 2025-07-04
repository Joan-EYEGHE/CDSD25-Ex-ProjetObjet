package domaine;

public abstract class Enseignant {
    // Attributs propres
    private int mart;
    private String nom;
    private String prenom;
    private String grade;
    // Attributs d'association
    private Departement affectation;

    public Enseignant(int mart, String nom, String prenom, String grade) {
        this.mart = mart;
        this.nom = nom;
        this.prenom = prenom;
        this.grade = grade;
    }

    public void setMart(int mart) {
        this.mart = mart;
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

    public int getMart() {
        return mart;
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
