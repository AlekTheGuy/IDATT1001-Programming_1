import java.util.Random;

public class tilfeldiggenerator {

    public static void main(String[] args) {
        Random random = new Random();
        int tall;
        int[] antall = new int[10];

        for(int i = 0; i < 100000; i++) {
            tall = random.nextInt(10);
            antall[tall]++;
        }

        for(int i = 0; i<10; i++) {
            System.out.println("antall " + i + " : " + antall[i]);
        }
    }
}