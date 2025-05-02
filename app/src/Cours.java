public class Cours {

    private String nom ;
    private String type ;
    private Enseignant enseignant ; 
    
    public Cours(String nom, String type , Enseignant enseignant) {
        this.nom = nom;
        this.type = type;
        this.enseignant = enseignant ;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Enseignant getEnseignant() {
        return enseignant;
    }
    public void setEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
    }
    
    
    

}
 