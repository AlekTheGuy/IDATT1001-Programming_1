import java.util.Scanner;

public class Klient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv inn en tekst for behandling: ");
        Tekstbehandler tekstbehandler = new Tekstbehandler(scanner.nextLine());
        System.out.println("Skriv inn et ord du vil bytte ut i teksten: ");
        String gammeltOrd = scanner.nextLine();
        System.out.println("Skriv hva ordet skal byttes til: ");
        String nyttOrd = scanner.nextLine();

        System.out.println("antall ord: " + tekstbehandler.antallOrd());
        System.out.println("gjennomsnittlig ordlengde: " + tekstbehandler.ordLengde());
        System.out.println("gjennomsnittlig ordlengde per periode: " + tekstbehandler.periodeLengde());
        tekstbehandler.byttOrd(gammeltOrd, nyttOrd);
        System.out.println("teksten etter ordbytte: " + tekstbehandler.getTekst());
        System.out.println("teksten : " + tekstbehandler.getTekst());
        System.out.println("teksten i store bokstaver: " + tekstbehandler.getCapitalTekst());

    }
}