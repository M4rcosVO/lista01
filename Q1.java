import javax.swing.*;

public class MarcosQ1 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello");

        int inputNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Give me a number: "));

        if(inputNumber > 0){
            JOptionPane.showMessageDialog(null, "Is positive!");
        } else if (inputNumber < 0) {
            JOptionPane.showMessageDialog(null, "Is negative!");
        } else {
            JOptionPane.showMessageDialog(null, "Is null!");
        }
    }
}