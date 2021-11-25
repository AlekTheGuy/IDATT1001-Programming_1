import javax.swing.JOptionPane;

public class Øving2_1 {
    public static void main(String[] args) {
        String årstallString = JOptionPane.showInputDialog(null, "Skriv inn årstall:");
        int årstall = Integer.parseInt(årstallString);

        if((årstall%100) == 0 && (årstall%400) == 0){
            JOptionPane.showMessageDialog(null, "år " + årstall + " er et skuddår");
        }else if((årstall%100) != 0 && (årstall%4) == 0){
            JOptionPane.showMessageDialog(null, "år " + årstall + " er et skuddår");
        }else {
            JOptionPane.showMessageDialog(null, "år " + årstall + " er ikke et skuddår");
        }
    }
}