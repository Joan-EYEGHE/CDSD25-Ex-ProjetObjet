package domaine;

public class Permanent extends Enseignant{
    private double salbase;
    private double prime;

    public Permanent(int mart, String nom, String prenom, String grade, double salbase, double prime) {
        super(mart, nom, prenom, grade);
        this.salbase = salbase;
        this.prime = prime;
    }

    public void setSalbase(double salbase) {
        this.salbase = salbase;
    }

    public void setPrime(double prime) {
        this.prime = prime;
    }

    public double getSalbase() {
        return salbase;
    }

    public double getPrime() {
        return prime;
    }

    // Implementation d'une methode abstraite
    @Override
    public double salaireNette() {
        double brut=salbase+prime;
        double impot=0.1*brut;
        double net=brut-impot;
        return net;
    }
}

