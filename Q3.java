import javax.swing.*;
import java.lang.Math;

public class MarcosQ3 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello");

        int inputNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Give me a number: "));

        if(inputNumber > 0){
            JOptionPane.showMessageDialog(null, Math.sqrt(inputNumber));
        } else {
            JOptionPane.showMessageDialog(null, inputNumber * inputNumber);
        }
    }
}