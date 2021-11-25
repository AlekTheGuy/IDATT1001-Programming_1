import java.util.Scanner;

public class Øving3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tall;
        do{
            System.out.println("Skriv ett tall, trykk 0 for å avslutte: ");
            tall = scanner.nextInt();
            int teller = 2;
            boolean erPrimtall = true;
            if(tall > 0){
                while (teller <= tall/2 && erPrimtall == true){
                    if(tall%teller == 0){
                        erPrimtall = false;
                    }
                    ++teller;
                }
                if(erPrimtall == true){
                    System.out.println(tall + " er ett primtall.");
                } else{
                    System.out.println(tall + " er ikke ett primtall.");
                }
            }
        } while(tall != 0);
        scanner.close();
    }
}