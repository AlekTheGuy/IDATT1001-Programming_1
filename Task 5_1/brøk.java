import java.util.Scanner;

public class brøk {
    private int teller;
    private int nevner;
    
public brøk(int tellerIn, int nevnerIn){
    this.teller = tellerIn;
    if(nevnerIn != 0){
        this.nevner = nevnerIn;
    } else{
        throw new IllegalArgumentException("Telleren kan ikke være null");
    }
}

public brøk(int tellerIn){
    this.teller = tellerIn;
    this.nevner = 1;
}

public void adder(int tellerIn, int nevnerIn){
    this.teller = (this.teller*nevnerIn) + (tellerIn*this.nevner);
    this.nevner *= nevnerIn;
}

public void subtraher(int tellerIn, int nevnerIn){
    this.teller = (this.teller*nevnerIn) - (this.nevner*tellerIn);
    this.nevner *= nevnerIn;
}

public void multipliser(int tellerIn, int nevnerIn){
    this.teller *= tellerIn;
    this.nevner *= nevnerIn;
}

public void divider(int tellerIn, int nevnerIn){
    this.teller *= nevnerIn;
    this.nevner *= tellerIn;
}

public int getTeller(){
    return this.teller;
}

public int getNevner(){
    return this.nevner;
}

public String toString(){
    return + teller + " / " + nevner;
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Skriv en teller : ");
    int teller = scanner.nextInt();
    System.out.println("Skriv en nevner: ");
    int nevner = scanner.nextInt();

    brøk brøk = new brøk(teller, nevner);

    brøk.adder(2, 4);
    System.out.println("Brøk etter addisjon: " + brøk.toString());
    brøk.subtraher(3, 4);
    System.out.println("Brøk etter subtrahering: " + brøk.toString());
    brøk.divider(3, 2);
    System.out.println("Brøk etter divisjon: " + brøk.toString());
    brøk.multipliser(2, 5);
    System.out.println("Brøk etter multiplikasjon: " + brøk.toString());

    scanner.close();
    
}
}
