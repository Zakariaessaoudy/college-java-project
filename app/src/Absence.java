import java.time.DayOfWeek;
import java.util.List;
import java.util.Map;

public class Absence {
    private DayOfWeek jour;
    private int numeroSemaine;
    private Classe classe;
    private Map<Eleve, List <StatusPresence>> listeAbscence ;

    public DayOfWeek getJour() {
        return jour;
    }

    public void setJour(DayOfWeek jour) {
        this.jour = jour;
    }

    public int getNumeroSemaine() {
        return numeroSemaine;
    }

    public void setNumeroSemaine(int numeroSemaine) {
        this.numeroSemaine = numeroSemaine;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Map<Eleve, List<StatusPresence>> getListeAbscence() {
        return listeAbscence;
    }

    public void setListeAbscence(Map<Eleve, List<StatusPresence>> listeAbscence) {
        this.listeAbscence = listeAbscence;
    }

    //methode pour faire l'appel aux eleves et marquer leurs abscense


}
