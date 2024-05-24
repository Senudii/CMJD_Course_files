import javax.swing.*;
import java.awt.*;

public class q9 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("4x4 Grid Layout Window");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 4));
        
        // Array of texts for buttons
        String[] buttonTexts = {
            "7", "8", "9", "*",
            "4", "5", "6", "/",
            "1", "2", "3", "+",
            "0", ".", "=", "-"        };
        
        // Create and add 16 buttons with text from the array
        for (int i = 0; i < 16; i++) {
            JButton button = new JButton(buttonTexts[i]);
            frame.add(button);
        }
        
        frame.setVisible(true);
    }
}
