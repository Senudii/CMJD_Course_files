import javax.swing.*;
import java.awt.*;

public class q3 {
    public static void main(String[] args) {
      
        JFrame frame = new JFrame("Border Layout Window");
       
        frame.setSize(400, 200);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel labelNorth = new JLabel("This is North Border");
        JLabel labelSouth = new JLabel("This is South Border");
       
        labelNorth.setHorizontalAlignment(JLabel.CENTER);
        labelSouth.setHorizontalAlignment(JLabel.CENTER);
       
        frame.add(labelNorth, BorderLayout.NORTH);
        frame.add(labelSouth, BorderLayout.SOUTH);
        
        frame.setVisible(true);
    }
}
