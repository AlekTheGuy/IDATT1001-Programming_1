import java.util.Comparator;

public class SorterLokasjon implements Comparator<Arrangement> {
    @Override
    public int compare(Arrangement o1, Arrangement o2) {
        String sted1 = o1.getLokasjon().toLowerCase();
        String sted2 = o2.getLokasjon().toLowerCase();
        return sted1.compareTo(sted2);
    }
}