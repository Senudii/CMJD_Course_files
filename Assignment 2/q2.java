import javax.swing.*;
import java.awt.*;

public class q2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Layout Window");
       
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button1 = new JButton("North");
        JButton button2 = new JButton("South");
        JButton button3 = new JButton("West");
        JButton button4 = new JButton("East");
        JButton button5 = new JButton("Center");
        
        frame.add(button1, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.SOUTH);
        frame.add(button3, BorderLayout.WEST);
        frame.add(button4, BorderLayout.EAST);
        frame.add(button5, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
