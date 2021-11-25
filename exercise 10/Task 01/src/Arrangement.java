import java.util.Objects;

public class Arrangement{
    private int id;
    private long tidspunkt;
    private String navn;
    private String lokasjon;
    private String arrangør;
    private String type;

    public Arrangement(int id, long tidspunkt, String navn, String lokasjon, String arrangør, String type){
        this.id = id;
        this.tidspunkt = tidspunkt;
        this.navn = navn;
        this.lokasjon = lokasjon;
        this.arrangør = arrangør;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public long getTidspunkt() {
        return tidspunkt;
    }

    public String getNavn() {
        return navn;
    }

    public String getLokasjon() {
        return lokasjon;
    }

    public String getArrangør() {
        return arrangør;
    }

    public String getType() {
        return type;
    }

    public String info(){
        return "\nID: " + id + "\n Navn: " + navn + "\n Tidspunkt: " + tidspunkt + "\n Lokasjon: " + lokasjon + "\n Arrangør: " + arrangør + "\n type: " + type;
    }



    @Override
    public String toString() {
        return "Arrangement{" +
                "id=" + id +
                ", tidspunkt=" + tidspunkt +
                ", navn='" + navn + '\'' +
                ", lokasjon='" + lokasjon + '\'' +
                ", arrangør='" + arrangør + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}