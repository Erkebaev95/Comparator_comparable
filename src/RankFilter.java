import java.util.Comparator;

public class RankFilter implements Comparator<MilitaryPerson> {
    @Override
    public int compare(MilitaryPerson o1, MilitaryPerson o2) {
        return o1.getRank().compareTo(o2.getRank());
    }
}