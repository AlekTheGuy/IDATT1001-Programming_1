import javax.swing.JOptionPane;

public class Øving2_2 {

    public static void main(String[] args) {

        String prisAString = JOptionPane.showInputDialog(null, "Skriv prisen på vare A:");
        String vektAString = JOptionPane.showInputDialog(null, "Skriv vekten på vare A i gram:");
        String prisBString = JOptionPane.showInputDialog(null, "Skriv prisen på vare B:");
        String vektBString = JOptionPane.showInputDialog(null, "Skriv vekten på vare B i gram:");

        Float kgPrisA = Float.parseFloat(prisAString)/Float.parseFloat(vektAString)*1000;
        Float kgPrisB = Float.parseFloat(prisBString)/Float.parseFloat(vektBString)*1000;

        if(kgPrisA>kgPrisB){
            JOptionPane.showMessageDialog(null, String.format("Vare A: %.1f", kgPrisA) + " kr/kg" + String.format("\nVare B: %.1f", kgPrisB) + " kr/kg" + "\nVare B er billigst.");
        } else if(kgPrisB>kgPrisA){
            JOptionPane.showMessageDialog(null, String.format("Vare A: %.1f", kgPrisA) + " kr/kg" + String.format("\nVare B: %.1f", kgPrisB) + " kr/kg" + "\nVare A er billigst.");
        } else {
            JOptionPane.showMessageDialog(null, String.format("Vare A: %.1f", kgPrisA) + " kr/kg" + String.format("\nVare B: %.1f", kgPrisB) + " kr/kg" + "\nVarene er like dyre.");
        }
    }
}
