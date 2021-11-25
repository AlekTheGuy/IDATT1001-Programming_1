import java.util.Scanner;

/**
 * @author Aleksander H Holthe
 * @version  09.11.20
 * klientklassen
 */

public class Klient {


    public static void main(String[] args) {

        /**
         * Legger inn testdata av eiendommer.
         */
        EiendomRegister register = new EiendomRegister();
        int brukervalg;
        register.nyEiendom(1445, "Gloppen", 77, 631, "", 1017.6f, "Jens Olsen");
        register.nyEiendom(1445, "Gloppen", 77, 131, "Syningon", 661.3f, "Nicolay Madsen");
        register.nyEiendom(1445, "Gloppen", 75, 19, "Fugletun", 650.6f, "Evilyn Jensen");
        register.nyEiendom(1445, "Gloppen", 74, 188, "", 1457.2f, "Karl Ove Bråten");
        register.nyEiendom(1445, "Gloppen", 69, 47, "", 1339.4f, "Elsa Indregård");

        /**
         * Main loop med brukervalg og program.
         */
        do{
            brukervalg = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n1. Legg til eiendom");
            System.out.println("2. Fjern eiendom");
            System.out.println("3. Skriv ut alle eiendommer");
            System.out.println("4. Søk på eiendom etter unik ID");
            System.out.println("5. Finn gjennomsnittsareal");
            System.out.println("6. Søk på eiendommer etter gårdsnummer");
            System.out.println("9. Avslutt program");

            if(scanner.hasNextInt()){
                brukervalg = scanner.nextInt();
            } else {
                System.out.println("Feil inndata, skriv inn et tall");
            }

            switch (brukervalg){
                case 1:
                    System.out.println("Skriv inn kommune nummer: ");
                    int kommuneNummer = scanner.nextInt();
                    System.out.println("skriv inn kommune navn: ");
                    String kommuneNavn = scanner.next();
                    System.out.println("skriv inn gårdsnummer: ");
                    int gårdsNummer = scanner.nextInt();
                    System.out.println("skriv inn bruksnummer: ");
                    int bruksNummer = scanner.nextInt();
                    System.out.println("Skriv inn bruksnavn (valgfri): ");
                    String bruksnavn = scanner.next();
                    System.out.println("skriv inn areal: ");
                    float areal = scanner.nextFloat();
                    System.out.println("Skriv inn navn på eier: ");
                    String navnPåEier = scanner.next();
                    register.nyEiendom(kommuneNummer, kommuneNavn, gårdsNummer, bruksNummer, bruksnavn, areal, navnPåEier);
                    break;
                case 2:
                    System.out.println("Skriv inn kommunenr:");
                    kommuneNummer = scanner.nextInt();
                    System.out.println("Skriv inn gårdsNummer:");
                    gårdsNummer = scanner.nextInt();
                    System.out.println("Skriv inn bruksnummer:");
                    bruksNummer = scanner.nextInt();
                    if(register.fjernEiendom(kommuneNummer, gårdsNummer, bruksNummer)){
                        System.out.println("Gård fjernet fra register");
                        break;
                    }
                    System.out.println("Fant ikke gård");
                    break;
                case 3:
                    System.out.println(register.lesEiendommer());
                    break;
                case 4:
                    System.out.println("Skriv inn kommunenr: ");
                    kommuneNummer = scanner.nextInt();
                    System.out.println("Skriv inn gårdsnummer: ");
                    gårdsNummer = scanner.nextInt();
                    System.out.println("Skriv inn bruksnummer: ");
                    bruksNummer = scanner.nextInt();
                    System.out.println(register.søkEiendom(kommuneNummer, gårdsNummer, bruksNummer));
                    break;
                case 5:
                    System.out.println(String.format("Gjennomsnittsarealet er: %.1f m^2", register.gjennomsnittligEiendomStørrelse()));
                    break;
                case 6:
                    System.out.println("Skriv inn gårdsnummer: ");
                    gårdsNummer = scanner.nextInt();
                    System.out.println(register.søkGnr(gårdsNummer));
                default:
                    break;
            }
        }while(brukervalg != 9);
    }
}