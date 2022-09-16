import javax.swing.*;

public class MarcosQ2 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello");

        int inputNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Give me a number: "));

        if(inputNumber % 2 == 0){
            JOptionPane.showMessageDialog(null, "Is odd!");
        } else {
            JOptionPane.showMessageDialog(null, "Is even!");
        }
    }
}