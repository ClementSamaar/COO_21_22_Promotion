import java.util.ArrayList;

public class CompareParId implements StrategieCompare {
    public int compare(Etudiant et1, Etudiant et2) {

        return et1.getId() - et2.getId();
    }
}
