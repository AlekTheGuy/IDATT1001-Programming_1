import java.util.ArrayList;

public class Klient {

    public static void main(String[] args) {
        MenyRegister menyregister = new MenyRegister();
        menyregister.nyRett("Wok", "Hovedrett", 100f, "grønnsaker, saus og kjøtt");
        menyregister.nyRett("Pasta", "Hovedrett", 90f, "Pasta, saus og kjøtt");
        menyregister.nyRett("Chili con carne", "Hovedrett", 70f, "Chilli, con og carne");
        menyregister.nyRett("Biff", "Hovedrett", 150f, "Biff, potetbåter og kjøttsaus");
        menyregister.nyRett("Avocado Toast", "Forrett", 140f, "Avocado og toast");
        menyregister.nyRett("Nachos", "Forrett", 140f, "Nachos og ost");
        menyregister.nyRett("banansplitt", "Dessert", 80f, "Banan, is og sjokoladesaus");
        menyregister.nyRett("Oreo kake", "Dessert", 70f, "Kake av oreo");

        System.out.println("Liste over alle hovedretter: " + menyregister.finnRettType("Hovedrett"));

        ArrayList<Rett> retterTilMeny = new ArrayList<>();
        retterTilMeny.add(menyregister.finnRettNavn("Wok"));
        retterTilMeny.add(menyregister.finnRettNavn("Avocado Toast"));
        retterTilMeny.add(menyregister.finnRettNavn("banansplitt"));
        menyregister.nyMeny(retterTilMeny);

        System.out.println("\nAlle menyer i prisklassen: " + menyregister.finnMenyIPrisklasse(200, 350));
    }
}