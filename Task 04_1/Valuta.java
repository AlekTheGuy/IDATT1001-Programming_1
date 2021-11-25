public class Valuta {

    private double kurs;

    public Valuta(Double kurs) {
        this.kurs = kurs;
    }

	public double toNok(double mengde){
        return mengde/kurs;
    }

    public double fromNok(double mengde){
        return mengde*kurs;
    }
}
