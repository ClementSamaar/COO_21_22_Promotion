import java.util.ArrayList;
import java.util.Comparator;

public interface StrategieCompare extends Comparator<Etudiant>{
    int compare(Etudiant et1, Etudiant et2);
}
