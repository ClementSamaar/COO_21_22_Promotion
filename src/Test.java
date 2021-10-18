public class Test {
    public static void main(String[] args){
        Etudiant Etu1 = new Etudiant(2, "Sam", "Karl");
        Etudiant Etu5 = new Etudiant(2, "Sam", "Karl");
        Etudiant Etu2 = new Etudiant(4, "Dieuzaide", "Shone");
        Etudiant Etu3 = new Etudiant(1, "Smith", "Asama");
        Etudiant Etu4 = new Etudiant(3, "Longen", "Angus");
        Etu1.equals(Etu3);
        Etu1.equals(Etu5);
        Promotion promo = new Promotion();
        promo.m_Etudiants.add(Etu1);
        promo.m_Etudiants.add(Etu2);
        promo.m_Etudiants.add(Etu3);
        promo.m_Etudiants.add(Etu4);
        promo.m_Etudiants.add(Etu5);

    }
}
