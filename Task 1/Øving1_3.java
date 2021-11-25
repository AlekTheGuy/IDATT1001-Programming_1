import javax.swing.JOptionPane;

public class Øving1_3 {

    public static void main(String[] args) {
        
        String sekunderString = JOptionPane.showInputDialog(null, "Skriv antall sekunder: ");
        int sekunderInt = Integer.parseInt(sekunderString);
        int timer = sekunderInt / 3600;
        int minutter = (sekunderInt % 3600) / 60;
        int sekunder = sekunderInt % 60;
        JOptionPane.showMessageDialog(null, sekunderString + " sekunder er lik " + timer + " timer " + minutter + " minutter og " + sekunder + " sekunder.");
    }
}