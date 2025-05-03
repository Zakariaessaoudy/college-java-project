import java.util.ArrayList;
import java.util.List;

public class Administration {
    /*private int Numero;
    private String type;*/
    College actualCollege;
    List<Seance> lesSeancesActuel;
    List<Seance> historiqueDesSeances;
    List<Classe> lesClasses;

    public Administration(College actualCollege) {
        this.actualCollege = actualCollege;
        lesSeancesActuel = new ArrayList<Seance>();
        historiqueDesSeances = new ArrayList<Seance>();
        lesClasses  = new ArrayList<Classe>();
    }

}
