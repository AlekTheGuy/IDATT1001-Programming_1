import java.util.ArrayList;
import java.util.Collections;

public class ArrangementRegister {
    private ArrayList<Arrangement> arrangementer = new ArrayList<Arrangement>();

    public ArrangementRegister(){
    }

    public Boolean nyttArrangement(int id, long tidspunkt, String navn, String lokasjon, String arrangør, String type) {
        boolean gyldigId = true;
        for(int i = 0; i < arrangementer.size(); i++){
            if(id == arrangementer.get(i).getId()){
                gyldigId = false;
            }
        }
        if(gyldigId){
            arrangementer.add(new Arrangement (id, tidspunkt, navn, lokasjon, arrangør, type));
            return true;
        }else{
            return false;
        }
    }
    
    public int getId(int id){
        return arrangementer.get(id).getId();
    }

    public long getTidspunkt(int id){
        return arrangementer.get(id).getTidspunkt();
    }

    public String getLokasjon(int id){
        return arrangementer.get(id).getLokasjon();
    }

    public int antallArrangementer(){
        return arrangementer.size();
    }

    public ArrayList påLokasjon(String lokasjon){
        ArrayList midlertidig = new ArrayList<Arrangement>();
        for(int i = 0; i < arrangementer.size(); i++){
            if(arrangementer.get(i).getLokasjon().toLowerCase().equals(lokasjon.toLowerCase())){
                midlertidig.add(arrangementer.get(i));
            }
        }
        return midlertidig;
    }

    public ArrayList påDato(int dato){
        ArrayList midlertidig = new ArrayList<Arrangement>();
        for(int i = 0; i < arrangementer.size(); i++){
            if(arrangementer.get(i).getTidspunkt()/10000 == dato){
                midlertidig.add(arrangementer.get(i));
            }
        }
        return midlertidig;
    }

    public ArrayList<Arrangement> iTidsområde(int tidFra, int tidTil){
        ArrayList<Arrangement> midlertidig = new ArrayList<>();
        tidFra *= 10000;
        tidTil *= 10000;
        for(int i = 0; i < arrangementer.size(); i++){
            if((int)arrangementer.get(i).getTidspunkt() > tidFra && (int)arrangementer.get(i).getTidspunkt() < tidTil){
                midlertidig.add(arrangementer.get(i));
            }
        }
        return midlertidig;
    }

    public String info(){
        String midlertidig = "";
        for(int i = 0; i < arrangementer.size(); i++){
            midlertidig += arrangementer.get(i).info() + "\n";
        }
        return midlertidig;
    }

    public void sorterArrangementDato(){
        Collections.sort(arrangementer, new SorterTid());
    }

    public void sorterArrangementLokasjon(){
        Collections.sort(arrangementer, new SorterLokasjon());
    }

    public void sorterArrangementType(){
        Collections.sort(arrangementer, new SorterType());
    }

    @Override
    public String toString() {
        return "ArrangementRegister{" +
                "arrangementer=" + arrangementer +
                '}';
    }
}