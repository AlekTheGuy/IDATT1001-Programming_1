import java.util.Scanner;

public class Øving3_1 {
    public static void main(String[] args) {
        int tall, tall2, teller;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv et tall: ");
        tall = scanner.nextInt();
        System.out.println("Skriv enda et tall: ");
        tall2 = scanner.nextInt();

        if (tall > tall2){
            int temp = tall;
            tall2 = tall;
            tall = temp;
        }

        teller = tall2 - tall;
        scanner.close();

        do{
            System.out.println((tall2-teller) + "-gangen:");
            for(int i = 1; i<11; i++) {
                System.out.println((tall2-teller) + " x " + i + " = " + (tall2-teller)*i);
            }
            teller--;
        }while(teller >= 0);
    }
}