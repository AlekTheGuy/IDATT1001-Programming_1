public class Rett {
    private String navn;
    private String type;
    private float pris;
    private String oppskrift;

    public Rett(String navn, String type, float pris, String oppskrift){
        this.navn = navn;
        this.type = type;
        this.pris = pris;
        this.oppskrift = oppskrift;
    }

    public String getNavn() {
        return navn;
    }

    public String getType() {
        return type;
    }

    public float getPris() {
        return pris;
    }

    public String getOppskrift() {
        return oppskrift;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPris(float pris) {
        this.pris = pris;
    }

    public void setOppskrift(String oppskrift) {
        this.oppskrift = oppskrift;
    }

    @Override
    public String toString() {
        return "\n\nRett{" +
                "\nnavn='" + navn + '\'' +
                "\ntype='" + type + '\'' +
                "\npris=" + pris +
                "\noppskrift='" + oppskrift + '\'' +
                '}';
    }
}
