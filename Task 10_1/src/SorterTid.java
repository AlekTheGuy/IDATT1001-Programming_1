import java.util.Comparator;

public class SorterTid implements Comparator<Arrangement> {
    @Override
    public int compare(Arrangement o1, Arrangement o2) {
        long tid1 = o1.getTidspunkt();
        long tid2 = o2.getTidspunkt();
        return Long.compare(tid1, tid2);
    }
}