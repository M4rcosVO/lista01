import javax.swing.*;

public class MarcosQ8 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello");
        int count = 0;

        for (int i = 0; i < 5; i++) {
            int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Inform your age: "));
            if (idade >= 18){
                count++;
            }
        }
        JOptionPane.showMessageDialog(null, "The number of people with 18+ is: " + count);
    }
}
