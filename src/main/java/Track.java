import java.util.Date;

public class Track extends DAO {

    private int id;
    private String nom;
    private int d;

    public Track(int id, String nom, int d) {
        this.id = id;
        this.nom = nom;
        this.d = d;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getD() {
        return d;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setD(int d) {
        this.d = d;
    }
}
