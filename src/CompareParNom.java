import java.util.ArrayList;
import java.util.Comparator;

public class CompareParNom implements StrategieCompare{
    public int compare(Etudiant et1, Etudiant et2) {
        return et1.getNom().compareToIgnoreCase(et2.getNom());
    }
}
