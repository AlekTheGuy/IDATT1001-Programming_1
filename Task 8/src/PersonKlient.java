public class PersonKlient {
    public static void main(String[] args) {
        Person aleksander = new Person("Aleksander halvorsen", "Holthe", 1999);
        ArbTaker arbAleksander = new ArbTaker(aleksander, 1, 2015, 30000, 0.3f);

        java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
        int år = kalender.get(java.util.Calendar.YEAR);

        System.out.println("navn: " + arbAleksander.fulltNavn());
        System.out.println("skatt per måned: " + arbAleksander.skattPerMåned());
        System.out.println("bruttolønn per år: " + arbAleksander.årligBrutto());
        System.out.println("skatt per år: " + arbAleksander.årligSkatt());
        System.out.println("alder: " + arbAleksander.alder(år));
        System.out.println("antall år i bedriften: " + arbAleksander.antallÅrAnsatt(år));
        System.out.println("har personen vært ansatt i x antall år?: " + arbAleksander.ANSATTI(år, 5));
    }
}
