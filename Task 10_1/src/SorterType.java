import java.util.Comparator;

public class SorterType implements Comparator<Arrangement> {
    @Override
    public int compare(Arrangement o1, Arrangement o2) {
        String type1 = o1.getType().toLowerCase();
        String type2 = o2.getType().toLowerCase();
        return type1.compareTo(type2);
    }
}