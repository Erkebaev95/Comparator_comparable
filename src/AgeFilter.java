import java.util.Comparator;

public class AgeFilter implements Comparator<MilitaryPerson> {
    @Override
    public int compare(MilitaryPerson o1, MilitaryPerson o2) {
        return (o1.getAge() > o2.getAge() ? 1 : -1);
    }
}
