import javax.swing.JOptionPane;

public class Øving1_1 {
    
    public static void main(String[] args) {

        String tommer = JOptionPane.showInputDialog("Skriv antall tommer: ");
        Float tommerFloat = Float.parseFloat(tommer);
        JOptionPane.showMessageDialog(null, tommer + " Tommer er " + tommerFloat*2.54 + " centimeter.");
    }
}