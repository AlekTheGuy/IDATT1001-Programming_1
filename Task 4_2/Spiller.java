import java.util.Random;

public class Spiller {
    private int sumPoeng;
    
    public Spiller(){
        this.sumPoeng = 0;
    }

    public void kastTerningen(){
        Random terning = new Random();
        int nummer = terning.nextInt(6) + 1;
        if(nummer == 1){
            sumPoeng = 0;
        }else{
            sumPoeng += nummer;
        }
    }

    public int getSumPoeng(){
        return sumPoeng;
    }

    public boolean erFerdig(){
        if (sumPoeng >= 100){
            return true;
        }else{
            return false;
        }
    }
}
