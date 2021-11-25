public class Student {
    private String navn;
    private int antOppg;

    public Student(String navn){
        this.navn = navn;
        antOppg = 0;
    }

    public String getNavn() {
        return navn;
    }

    public int getAntOppg() {
        return antOppg;
    }

    public void økAntOppg(int økning){
        antOppg += økning;
    }

    @Override
    public String toString() {
        return "Student{" + "navn='" + navn + '\'' + ", antOppg=" + antOppg + '}';
    }
}
