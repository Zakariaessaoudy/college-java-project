public class College {

    private String Nom;
    private String Adresse;
    private Administration admin;
    public College(String nom, String adresse) {
        Nom = nom;
        Adresse = adresse;
        admin = new Administration(this);
    }
    

}
