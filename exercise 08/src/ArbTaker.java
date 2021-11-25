public class ArbTaker {
    private Person personalia;
    private int arbTakerNr;
    private int ansettelsesÅr;
    private int månedsLønn;
    private float skatteProsent;

    public ArbTaker(Person personalia, int arbTakerNr, int ansettelsesÅr, int månedsLønn, float skatteProsent){
        this.personalia = personalia;
        this.arbTakerNr = arbTakerNr;
        this.ansettelsesÅr = ansettelsesÅr;
        this.månedsLønn = månedsLønn;
        this.skatteProsent = skatteProsent;
    }

    public int getArbTakerNr() {
        return arbTakerNr;
    }

    public int getAnsettelsesÅr() {
        return ansettelsesÅr;
    }

    public int getMånedsLønn() {
        return månedsLønn;
    }

    public float getSkatteProsent() {
        return skatteProsent;
    }

    public void setMånedsLønn(int månedsLønn) {
        this.månedsLønn = månedsLønn;
    }

    public void setSkatteProsent(float skatteProsent) {
        this.skatteProsent = skatteProsent;
    }

    public float skattPerMåned(){
        return månedsLønn * skatteProsent;
    }

    public int årligBrutto(){
        return månedsLønn * 12;
    }

    public float årligSkatt(){
        return månedsLønn * 10 * skatteProsent + månedsLønn * skatteProsent / 2;
    }

    public String fulltNavn(){
        return new String(personalia.getEtternavn() + ", " + personalia.getFornavn());
    }

    public int alder(int foreløpigÅr){
        return foreløpigÅr - personalia.getFødselsÅr();
    }

    public int antallÅrAnsatt(int foreløpigÅr){
        return foreløpigÅr - getAnsettelsesÅr();
    }

    public Boolean ANSATTI(int foreløpigÅr, int år){
        return (år- getAnsettelsesÅr() < foreløpigÅr);
    }
}