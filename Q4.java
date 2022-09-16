import javax.swing.*;

public class MarcosQ4 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello");

        int inputNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Give me a number: "));

        if(inputNumber % 5 == 0){
            JOptionPane.showMessageDialog(null, "Is divisible by 5!");
        } else {
            JOptionPane.showMessageDialog(null, "Isn't divisible by 5.");
        }
    }
}