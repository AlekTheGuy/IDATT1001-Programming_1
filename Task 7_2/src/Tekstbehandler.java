public class Tekstbehandler {

    private String tekst;

    public Tekstbehandler(String input){
        tekst = input;
    }

    public String getTekst(){
        return tekst;
    }

    public String getCapitalTekst(){
        return tekst.toUpperCase();
    }

    public int antallOrd(){
        return tekst.split(" ").length;
    }

    public float ordLengde(){
        String[] split = tekst.split(" ");
        float lengde = 0;
        for(int i = 0; i<split.length; i++){
            split[i] = split[i].replaceAll("[^a-zA-Zå-æÅ-Æ0-9]", "");
            lengde += split[i].length();
        }
        return lengde/split.length;
    }

    public float periodeLengde(){
        String[] split = tekst.split("[.!:?]");
        float lengde = 0;
        for(int i = 0; i<split.length; i++){
            split[i] = split[i].replaceAll("[^a-zA-Zå-æÅ-Æ0-9]", "");
            lengde += split[i].length();
        }
        return lengde/split.length;
    }

    public void byttOrd(String ord, String nyttOrd){
        tekst = tekst.replace(ord, nyttOrd);
    }

    public String toString() {
        return "Tekstbehandler{" + "tekst='" + tekst + '\'' + '}';
    }
}