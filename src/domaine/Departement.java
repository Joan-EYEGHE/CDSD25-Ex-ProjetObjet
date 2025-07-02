package domaine;
import java.util.*;
public class Departement {
    // Attributs propres
    private String code;
    private String nomdep;

    // Attributs d'association
    private ArrayList<Enseignant> listeens = new ArrayList<Enseignant>();

    // Constructor
    public Departement(String code, String nomdep) {
        this.code = code;
        this.nomdep = nomdep;
    }

    // Getter

    public String getCode() {
        return code;
    }

    public String getNomdep() {
        return nomdep;
    }

    public ArrayList<Enseignant> getListeens() {
        return listeens;
    }
    // Setter

    public void setCode(String code) {
        this.code = code;
    }

    public void setNomdep(String nomdep) {
        this.nomdep = nomdep;
    }

    public void setListeens(ArrayList<Enseignant> listeens) {
        this.listeens = listeens;
    }
}
