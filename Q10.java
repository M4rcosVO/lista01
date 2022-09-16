import javax.swing.*;

public class MarcosQ10 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello");

        int inchesInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Give me a value in inches: "));
        double convertCm = inchesInput * 2.54;

        JOptionPane.showMessageDialog(null, "1 inch == 2.54 cm \n Your input: " + inchesInput + " == " + convertCm);
    }
}