import javax.swing.*;
import java.awt.*;

public class q8 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Grid Layout Window");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2, 2));
        
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        
        frame.setVisible(true);
    }
}
