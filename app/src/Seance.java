import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Seance {
    private String nom_jour;
    private int numero_Semaine;
    private Time debut;
    private Time fin ;
    private Date date;
    private Classe classe;
    private int numeroSalle;
    private String nomCours;
    private Administration administration;


    public Seance(String nom_jour, int numero_Semaine, Time debut, Time fin, Classe classe, int numeroSalle, String nomCours, Administration administration, Date date) {
        this.nom_jour = nom_jour;
        this.numero_Semaine = numero_Semaine;
        this.debut = debut;
        this.fin = fin;
        this.classe = classe;
        this.numeroSalle = numeroSalle;
        this.nomCours = nomCours;
        this.administration = administration;
        this.date=date;

    }

    public String getNom_jour() {
        return nom_jour;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setNom_jour(String nom_jour) {
        this.nom_jour = nom_jour;
    }

    public int getNumero_Semaine() {
        return numero_Semaine;
    }

    public void setNumero_Semaine(int numero_Semaine) {
        this.numero_Semaine = numero_Semaine;
    }

    public Time getDebut() {
        return debut;
    }

    public void setDebut(Time debut) {
        this.debut = debut;
    }

    public Time getFin() {
        return fin;
    }

    public void setFin(Time fin) {
        this.fin = fin;
    }

}
