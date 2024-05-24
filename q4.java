
import javax.swing.*;
import java.awt.*;

public class q4 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Border Layout Window");

        frame.setSize(400, 200);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelNorth = new JLabel("This is North Border");
        JLabel labelSouth = new JLabel("This is South Border");

        labelNorth.setHorizontalAlignment(JLabel.CENTER);
        labelSouth.setHorizontalAlignment(JLabel.CENTER);

        labelNorth.setFont(new Font("", Font.BOLD, 30));
        labelSouth.setFont(new Font("", Font.BOLD, 30));

        frame.add(labelNorth, BorderLayout.NORTH);
        frame.add(labelSouth, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
