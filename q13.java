import javax.swing.*;
import java.awt.*;

public class q13 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JTextField answerField = new JTextField();
        answerField.setEditable(false);
        frame.add(answerField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        String[] buttonTexts = {
            "7", "8", "9", "*",
            "4", "5", "6", "/",
            "1", "2", "3", "+",
            "0", ".", "=", "-"      
        };

        for (int i = 0; i < 16; i++) {
            JButton button = new JButton(buttonTexts[i]);
            buttonPanel.add(button);
        }

        frame.add(buttonPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
