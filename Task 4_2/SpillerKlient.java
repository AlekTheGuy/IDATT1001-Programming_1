public class SpillerKlient {
    public static void main(String[] args) {
        int runde = 1;
        Spiller a = new Spiller();
        Spiller b = new Spiller();

        while(!a.erFerdig() && !b.erFerdig()){
            a.kastTerningen();
            b.kastTerningen();
            System.out.println("terninkast nr: " + runde);
            runde++;
            System.out.println("Spiller A har: " + a.getSumPoeng() + " Poeng.");
            System.out.println("Spiller B har: " + b.getSumPoeng() + " Poeng.");

        }
    }
}