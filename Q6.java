import javax.swing.*;

public class MarcosQ6 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello");

        int firstNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Give me a number: "));
        int secondNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Give me a number: "));

        if (firstNumber > secondNumber){
            JOptionPane.showMessageDialog(null, secondNumber + ", " + firstNumber + ".");
        } else if (secondNumber > firstNumber){
            JOptionPane.showMessageDialog(null, firstNumber + ", " + secondNumber + ".");
        }
    }
}