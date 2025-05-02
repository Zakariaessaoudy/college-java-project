import java.util.ArrayList;
import java.util.List;

public class Salle {
    private int Numero;
    private String type;
    //private boolean disponible;
    Seance seanceActuel;
    List<Materiel> materielDeSalle;

    
    public Salle(int numero, String type) {
        Numero = numero;
        this.type = type;
        seanceActuel = null;
        materielDeSalle = new ArrayList<Materiel>();
    }

    public void affecterSeance(Seance seance){
        seanceActuel = seance;
    }
    public void retirerSeance(){
        if(seanceActuel != null){
            seanceActuel = null;
        }else{
            System.out.println("pas de seance trouver dans ce classe");
        }
    }

    public void affecterMateriel(Materiel materiel){
        materielDeSalle.add(materiel);
    }

    public void retirerMateriel(Materiel materiel){
        
        if(materielDeSalle.contains(materiel)){
            for(int i = 0;i < materielDeSalle.size();i++){
                if (materielDeSalle.get(i).equals(materiel)) {
                    materielDeSalle.remove(i);
                    return;
                }
            }
        }else{
            System.out.println("materiel not found");
        }
        
    }
}
