/**
 * @author Aleksander H Holthe
 * @version  09.11.20
 * Eiendom klassen representerer en eiendom, spesifikt en gård. Det er ingen mutator klasser her ettersom det er sjeldent
 * at en av paramenterne endrer seg, hvis noe på gården skulle endre seg eller hvis det blir byttet eier kan gården bli
 * lagt inn i systemet på nytt.
 */



public class Eiendom {
    private int kommuneNummer;
    private String kommuneNavn;
    private int gårdsNummer;
    private int bruksNummer;
    private String bruksNavn;
    private float areal;
    private String navnPåEier;

    /**
     * Konstruktør med alle parametere.
     * @param kommuneNummer
     * @param kommuneNavn
     * @param gårdsNummer
     * @param bruksNummer
     * @param bruksNavn
     * @param areal
     * @param navnPåEier
     */

    public Eiendom(int kommuneNummer, String kommuneNavn, int gårdsNummer, int bruksNummer, String bruksNavn,
                   float areal, String navnPåEier) {
        if(kommuneNummer>=101 && kommuneNummer<=5054){
            this.kommuneNummer = kommuneNummer;
            this.kommuneNavn = kommuneNavn;
            this.gårdsNummer = gårdsNummer;
            this.bruksNummer = bruksNummer;
            this.bruksNavn = bruksNavn;
            this.areal = areal;
            this.navnPåEier = navnPåEier;
        }
    }

    /**
     * Konstruktør uten gårdsnavn.
     * @param kommuneNummer
     * @param kommuneNavn
     * @param gårdsNummer
     * @param bruksNummer
     * @param areal
     * @param navnPåEier
     */

    public Eiendom(int kommuneNummer, String kommuneNavn, int gårdsNummer, int bruksNummer,
                   float areal, String navnPåEier){
            this.kommuneNummer = kommuneNummer;
            this.kommuneNavn = kommuneNavn;
            this.gårdsNummer = gårdsNummer;
            this.bruksNummer = bruksNummer;
            this.areal = areal;
            this.navnPåEier = navnPåEier;
    }

    /**
     * @return returnerer gårdsnummer
     */
    public int getGårdsNummer() {
        return gårdsNummer;
    }

    /**
     * @return returnerer areal
     */
    public float getAreal() {
        return areal;
    }

    /**
     * @return en unik ID på formen kommunenr-gnr/bnr
     */

    public String getUnikId(){
        return kommuneNummer + "-" + gårdsNummer + "/" + bruksNummer;
    }

    @Override
    public String toString() {
        return "\n\nkommunenummer=" + kommuneNummer +
                ", \nkommunenavn='" + kommuneNavn + '\'' +
                ", \ngårdsnummer=" + gårdsNummer +
                ", \nbruksnummer=" + bruksNummer +
                ", \nbruksnavn='" + bruksNavn + '\'' +
                ", \nareal=" + areal +
                ", \nnavnpåeier='" + navnPåEier + '\'' +
                '}';
    }
}