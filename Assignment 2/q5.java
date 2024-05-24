import javax.swing.*;
import java.awt.*;

public class q5 {
    public static void main(String[] args) {
       
        JFrame frame = new JFrame("Flow Layout Window");
        
        frame.setSize(500, 200); 
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        
        JPanel row1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("This is a button");
        JButton button3 = new JButton("Button 2");
        row1.add(button1);
        row1.add(button2);
        row1.add(button3);
        
        JPanel row2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton button4 = new JButton("Execute");
        row2.add(button4);
        
        mainPanel.add(row1);
        mainPanel.add(row2);
        
        frame.add(mainPanel);
        
        frame.setVisible(true);
    }
}
