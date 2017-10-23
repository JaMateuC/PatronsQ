import java.util.Date;

public class Track {

    private int id;
    private String nom;
    private Date d;

    public Track(int id, String nom, Date d) {
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

    public Date getD() {
        return d;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setD(Date d) {
        this.d = d;
    }
}
