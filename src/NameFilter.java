import java.util.Comparator;

public class NameFilter implements Comparator<MilitaryPerson> {
    @Override
    public int compare(MilitaryPerson o1, MilitaryPerson o2) {
        return o1.getName().compareTo(o2.getName());
    }
}