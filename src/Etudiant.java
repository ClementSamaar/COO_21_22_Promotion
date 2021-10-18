public class Etudiant{
    private int Id;
    private String Nom;
    private String Prenom;

    public Etudiant(int id, String nom, String prenom){
        Id = id;
        Nom = nom;
        Prenom = prenom;
    }
    public String getNom(){ return this.Nom; }
    public String getPrenom(){ return this.Prenom; }
    public int getId(){ return this.Id; }

    public boolean equals(Object obj){
        if(obj == null) return false;
        if(obj == this) return true;
        if(!(obj instanceof Etudiant))return false;

        if (((Etudiant)obj).getId() == this.Id) {
            if (this.Nom.equals(((Etudiant)obj).getNom())) {
                if (this.Prenom.equals(((Etudiant)obj).getPrenom())) {
                    System.out.println("Étudiants identiques");
                    return true;
                }
                else {
                    System.out.println("Étudiants différents, prénoms différents");
                    return false;
                }
            }
            else {
                System.out.println("Étudiants différents, noms différents");
                return false;
            }
        }
        else{
            System.out.println("Étudiants différents, Id différents");
            return false;
        }
    }
}
