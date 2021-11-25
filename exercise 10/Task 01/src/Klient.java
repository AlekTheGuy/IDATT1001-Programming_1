import java.util.Scanner;

public class Klient {
    public static void main(String[] args){
        boolean avsluttProgram = false;
        ArrangementRegister arrangementer = new ArrangementRegister();
        arrangementer.nyttArrangement(0, 202012211800L, "Bursdag", "Lillehammer", "Aleksander", "Bursdag");
        arrangementer.nyttArrangement(1, 202102101330L, "olsmaking", "Trondheim", "Tihlde", "olsmaking");
        arrangementer.nyttArrangement(2, 201921121800L, "Bursdag", "Lillehammer", "Aleksander", "Bursdag");
        arrangementer.nyttArrangement(3, 202010181230L, "Fest", "Trondheim", "Tihlde", "Fest");
        arrangementer.nyttArrangement(4, 199912012000L, "Fest", "Trondheim", "Tihlde", "Fest");

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Menyvalg: \n1. Registrer nytt arrangement. \n" +
                    "2. Finn arrangementer etter lokasjon. \n" +
                    "3. Finn arrangementer etter dato. \n" +
                    "4. Finn arrangementer mellom to datoer. \n" +
                    "5. Se arrangementer sortert etter sted. \n" +
                    "6. Se arrangementer sortert etter type. \n" +
                    "7. Se arrangementer sortert etter tidspunkt \n" +
                    "8. Avslutt programmet.");
            int brukerIn = scanner.nextInt();
            switch (brukerIn) {
                case 1:
                    System.out.println("Skriv inn ett tidspunk med formatet ÅÅÅÅMMDDTTMM: ");
                    long tidspunkt = scanner.nextLong();
                    System.out.println("Skriv inn ett navn: ");
                    String navn = scanner.next();
                    System.out.println("Skriv inn en lokasjon: ");
                    String lokasjon = scanner.next();
                    System.out.println("Skriv inn en arrangør: ");
                    String arrangør = scanner.next();
                    System.out.println("Skriv inn typen arrangement: ");
                    String type = scanner.next();
                    if(arrangementer.nyttArrangement(arrangementer.antallArrangementer(), tidspunkt, navn, lokasjon, arrangør, type)){
                        System.out.println("Arrangement lagt til.");
                        break;
                    }
                    System.out.println("Arrangement ble ikke lagt til.");
                    break;
                case 2:
                    System.out.println("Skriv lokasjonen du ønsker å søke etter: ");
                    String lokasjonsSøk = scanner.next();
                    System.out.println(arrangementer.påLokasjon(lokasjonsSøk));
                    break;
                case 3:
                    System.out.println("Skriv datoen du ønsker å søke etter i format ÅÅÅÅMMDD: ");
                    int datoSøk = scanner.nextInt();
                    System.out.println(arrangementer.påDato(datoSøk));
                    break;
                case 4:
                    arrangementer.sorterArrangementDato();
                    System.out.println("Skriv inn datoen du ønsker å søke fra: ");
                    int datoFra = scanner.nextInt();
                    System.out.println("Skriv inn datoen du ønsker å søke til: ");
                    int datoTil = scanner.nextInt();
                    System.out.println(arrangementer.iTidsområde(datoFra, datoTil));
                    break;
                case 5:
                    arrangementer.sorterArrangementLokasjon();
                    System.out.println(arrangementer.info());
                    break;
                case 6:
                    arrangementer.sorterArrangementType();
                    System.out.println(arrangementer.info());
                    break;
                case 7:
                    arrangementer.sorterArrangementDato();
                    System.out.println(arrangementer.info());
                    break;
                case 8:
                    avsluttProgram = true;
                    break;
            }
        }while(!avsluttProgram);
    }
}