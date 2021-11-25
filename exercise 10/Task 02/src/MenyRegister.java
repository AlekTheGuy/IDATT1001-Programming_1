import java.util.ArrayList;

public class MenyRegister {
    private ArrayList<Meny> menyer = new ArrayList<Meny>();
    private ArrayList<Rett> retter = new ArrayList<Rett>();

    public MenyRegister(){
    }

    public boolean nyRett(String navn, String type, float pris, String oppskrift){
        for(int i = 0; i<retter.size(); i++){
            if (retter.get(i).getNavn().equals(navn)){
                return false;
            }
        }
        return retter.add(new Rett(navn, type, pris, oppskrift));
    }

    public Rett finnRettNavn(String navn){
        for(int i = 0; i<retter.size(); i++){
            if(retter.get(i).getNavn().toLowerCase().equals(navn.toLowerCase())){
                return retter.get(i);
            }
        }
        return null;
    }

    public ArrayList<Rett> finnRettType(String type){
        ArrayList<Rett> midlertidig = new ArrayList<Rett>();
        for(int i = 0; i<retter.size(); i++){
            if(retter.get(i).getType().toLowerCase().equals(type.toLowerCase())){
                midlertidig.add(retter.get(i));
            }
        }
        return midlertidig;
    }

    public ArrayList<Meny> finnMenyIPrisklasse(float prisFra, float prisTil){
        ArrayList<Meny> midlertidig = new ArrayList<>();
        for(int i = 0; i < menyer.size(); i++){
            if(menyer.get(i).totalPris() < prisTil && menyer.get(i).totalPris() > prisFra){
                midlertidig.add(menyer.get(i));
            }
        }
        return midlertidig;
    }

    public void nyMeny(ArrayList<Rett> tilMeny){
        menyer.add(new Meny(tilMeny));
    }

    @Override
    public String toString() {
        return "MenyRegister{" +
                "menyer=" + menyer +
                ", retter=" + retter +
                '}';
    }
}
