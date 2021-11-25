import java.util.ArrayList;

/**
 * @author Aleksander H Holthe
 * @version  09.11.20
 * Klassen sin hensikt er å gjøre oppgaver rundt et register av objekter fra Eiendom klassen.
 * Jeg bruker en ArrayList her fordi den er veldig lett å jobbe med, da slipper jeg å f.eks utvide
 * en array hver gang jeg skal legge til en ny eiendom.
 */

public class EiendomRegister {
    private ArrayList<Eiendom> eiendommer;

    public EiendomRegister(){
        this.eiendommer = new ArrayList<>();
    }

    /**
     * Metoden legger en ny eiendom til i arraylisten eiendommer
     * @param kommuneNummer
     * @param kommuneNavn
     * @param gårdsNummer
     * @param bruksNummer
     * @param bruksNavn
     * @param areal
     * @param navnPåEier
     */

    public boolean nyEiendom(int kommuneNummer, String kommuneNavn, int gårdsNummer, int bruksNummer, String bruksNavn, float areal, String navnPåEier){
        if(kommuneNummer>=101 && kommuneNummer<=5054) {
            for (Eiendom eiendom : eiendommer) {
                if ((kommuneNummer + "-" + gårdsNummer + "/" + bruksNummer).equals(eiendom.getUnikId())) {
                    return false;
                }
            }
        }else{
            return false;
        }
        return eiendommer.add(new Eiendom(kommuneNummer, kommuneNavn, gårdsNummer, bruksNummer, bruksNavn, areal, navnPåEier));
    }


    /**
     * Fjerner en eiendom basert på unik ID
     * @param kommuneNummer
     * @param gårdsNummer
     * @param bruksNummer
     * @return
     */
    public boolean fjernEiendom(int kommuneNummer, int gårdsNummer, int bruksNummer){
        for(Eiendom eiendom:eiendommer){
            if(new String(kommuneNummer + "-" + gårdsNummer + "/" + bruksNummer).equals(eiendom.getUnikId())){
                return eiendommer.remove(eiendom);
            }
        }
        return false;
    }

    /**
     * @return en ny liste over alle eiendommer
     */

    public ArrayList<Eiendom> lesEiendommer(){
        return new ArrayList<Eiendom>(eiendommer);
    }

    /**
     * Søker gjennom alle eiendommer og legger de alle til i listen <code>midlertidig</code>, den returnerer så denne listen.
     * @param kommuneNummer
     * @param gårdsNummer
     * @param bruksNummer
     * @return arraylist med alle eiendommer som passet søket
     */

    public Eiendom søkEiendom(int kommuneNummer, int gårdsNummer, int bruksNummer){
            for(Eiendom eiendom:eiendommer){
                if(new String(kommuneNummer + "-" + gårdsNummer + "/" + bruksNummer).equals(eiendom.getUnikId())){
                    return eiendom; // komposisjonsfeil
                }
            }
            return null;
        }

    /**
     * Leser ut det gjennomsnittlige arealet på eiendommene
     * @return alle eiendommene sitt areal delt på antall eiendommer
     */

    public double gjennomsnittligEiendomStørrelse(){
        double sammenlagtStørrelse = 0;
        for(Eiendom eiendom:eiendommer){
            sammenlagtStørrelse+=eiendom.getAreal();
        }
        return sammenlagtStørrelse/eiendommer.size();
    }

    /**
     * @return antall eiendommer
     */
    
    public int antallEiendommer(){
        return eiendommer.size();
    }

    /**
     * Denne metoden finner alle eiendommer med et gitt gårdsnummer
     * @param gårdsNummer sender inn gnr
     * @return en arraylist med alle gårdene som har det gitte gårdsnummeret
     */

    public ArrayList<Eiendom> søkGnr(int gårdsNummer){
        ArrayList<Eiendom> midlertidig = new ArrayList<>();
        for(Eiendom eiendom:eiendommer){
            if(eiendom.getGårdsNummer() == gårdsNummer){  //komposisjonsfeil?
                midlertidig.add(eiendom);
            }
        }
        return midlertidig;
    }
}