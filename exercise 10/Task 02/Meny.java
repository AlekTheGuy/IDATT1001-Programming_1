import java.util.ArrayList;

public class Meny {
    private ArrayList<Rett> retter;

    public Meny(ArrayList<Rett> tilMeny){
        this.retter = new ArrayList<>();
        for(int i = 0; i< tilMeny.size(); i++){
            retter.add(tilMeny.get(i));
        }
    }

    public ArrayList<Rett> getRetter() {
        return retter;
    }

    public float totalPris(){
        float pris = 0;
        for(int i = 0; i< retter.size(); i++){
            pris += retter.get(i).getPris();
        }
        return pris;
    }

    @Override
    public String toString() {
        return "Meny{" +
                "retter=" + retter +
                '}';
    }
}
