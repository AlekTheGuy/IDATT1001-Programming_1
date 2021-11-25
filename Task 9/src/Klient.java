import java.util.Scanner;

public class Klient {
    public static void main(String[] args) {
        Student Aleksander = new Student("Aleksander");
        Aleksander.økAntOppg(20);
        Aleksander.økAntOppg(3);
        System.out.println(Aleksander.getAntOppg());
        System.out.println(Aleksander.getNavn() + "\n\n");

        Oppgaveoversikt oppgaveoversikt = new Oppgaveoversikt();
        oppgaveoversikt.nyStudent("Tor-Øyvind");
        oppgaveoversikt.nyStudent("Henrik");
        oppgaveoversikt.økOppg( 0, 23);
        oppgaveoversikt.økOppg( 0, 2);
        oppgaveoversikt.økOppg(1, 16);

        System.out.println("Antall studenter: " + oppgaveoversikt.getAntStud());
        System.out.println("Antall oppgaver for student 0: " + oppgaveoversikt.antallOppg(0));
        System.out.println("Antall oppgaver for student 1: " + oppgaveoversikt.antallOppg(1));

        System.out.println(oppgaveoversikt.toString());
    }
}