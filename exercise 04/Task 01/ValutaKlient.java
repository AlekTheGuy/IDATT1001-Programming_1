import java.util.Scanner;

public class ValutaKlient {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        Valuta usd = new Valuta(0.11);
        Valuta sek = new Valuta(0.98);
        Valuta eur = new Valuta(0.095);

        do{
            System.out.println("Velg hvilken valuta du vil konvertere fra: \n 1. Dollar\n 2. Euro\n 3. Svenske kroner\n 4. avbryt");
            int userinput = scanner.nextInt();
            if (userinput != 4){
                System.out.println("Skriv antall: ");
                double amount = scanner.nextDouble();
                switch(userinput){
                    case 1:
                    System.out.println(amount + String.format(" usd er lik %.1f nok", usd.toNok(amount)));
                    break;
                    case 2:
                    System.out.println(amount + String.format(" eur er lik %.1f nok", eur.toNok(amount)));
                    break;
                    case 3:
                    System.out.println(amount + String.format(" sek er lik %.1f nok", sek.toNok(amount)));
                    break;
                    case 4:
                    break;
                    default:
                    System.out.println("feil input");
                } 
            }else{
                loop = false;
            }

        }while(loop);
        scanner.close();
    }
}
