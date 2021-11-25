public class Person {
    private final String fornavn;
    private final String etternavn;
    private int fødselsÅr;

    public Person(String fornavn, String etternavn, int fødselsÅr){
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.fødselsÅr = fødselsÅr;
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public int getFødselsÅr() {
        return fødselsÅr;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fornavn='" + fornavn + '\'' +
                ", etternavn='" + etternavn + '\'' +
                ", fodselsår=" + fødselsÅr +
                '}';
    }
}