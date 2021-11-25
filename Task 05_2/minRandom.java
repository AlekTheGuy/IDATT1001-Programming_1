import java.util.Random;

public class minRandom {
    Random rng = new Random();

    public int nesteHeltall(int nedre, int ovre){
        return rng.nextInt(ovre-nedre+1) + nedre;
    }

    public double nesteDesimaltall(double nedre, double ovre){
        double tall;
        do{
            tall = rng.nextDouble();
       } while(tall < nedre || tall > ovre);
        return tall;
    }

    public String toString(){
        return "test";
    }
}