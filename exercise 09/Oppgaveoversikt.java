import java.util.Arrays;

public class Oppgaveoversikt {
    private Student[] studenter = new Student[0];
    private int antStud = 0;

    public int getAntStud(){
        return antStud;
    }

    public String getNavn(int student){
        return studenter[student].getNavn();
    }

    public int antallOppg(int student){
        return studenter[student].getAntOppg();
    }

    private void utvidArray(){
        Student[] midlertidig = new Student[antStud + 1];
        for(int i = 0; i < antStud; i++){
            midlertidig[i] = studenter[i];
        }
        studenter = midlertidig;
    }

    public void nyStudent(String navn){
        utvidArray();
        studenter[studenter.length-1] = new Student(navn);
        antStud++;
    }

    public void økOppg(int student, int antall){
        studenter[student].økAntOppg(antall);
    }

    @Override
    public String toString() {
        return "Oppgaveoversikt{" + "studenter=" + Arrays.toString(studenter) + ", antStud=" + antStud + '}';
    }
}
