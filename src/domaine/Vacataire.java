package domaine;

public class Vacataire extends Enseignant{

    private int nh; // (nombre d'heures)
    private int tauxh; // (taux horaire)

    public Vacataire(int mart, String nom, String prenom, String grade, int nh, int tauxh) {
        super(mart, nom, prenom, grade);
        this.nh = nh;
        this.tauxh = tauxh;
    }

    public int getNh() {
        return nh;
    }

    public int getTauxh() {
        return tauxh;
    }

    public void setTauxh(int tauxh) {
        this.tauxh = tauxh;
    }

    public void setNh(int nh) {
        this.nh = nh;
    }

    // Implementation d'une methode abstraite
    @Override
    public double salaireNette() {
        double brut=tauxh*nh;
        double impot=0.05*brut;
        double net=brut-impot;
        return net;
    }
}
