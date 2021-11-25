import javax.swing.JOptionPane;

public class Øving1_2 {

    public static void main(String[] args) {

        String timer = JOptionPane.showInputDialog(null, "Skriv antall timer: ");
        String minutter = JOptionPane.showInputDialog(null, "Skriv antall minutter: ");
        String sekunder = JOptionPane.showInputDialog(null, "Skriv antall sekunder: ");

        int timerInt = Integer.parseInt(timer);
        int minutterInt = Integer.parseInt(minutter);
        int sekunderInt = Integer.parseInt(sekunder);

        int totalTid = timerInt*3600 + minutterInt*60 + sekunderInt;
        JOptionPane.showMessageDialog(null, timer + " timer " + minutter + " minutter og " + sekunder + " sekunder er: " + totalTid + " sekunder.");
    }
}