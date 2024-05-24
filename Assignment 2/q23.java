import javax.swing.*;
import java.awt.*;

public class q23 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Check Box Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create check boxes
        JCheckBox plainCheckBox = new JCheckBox("Plain");
        plainCheckBox.setSelected(false);
        
        JCheckBox boldCheckBox = new JCheckBox("Bold");
        boldCheckBox.setSelected(false);
        
        JCheckBox italicCheckBox = new JCheckBox("Italic");
        italicCheckBox.setSelected(false);
        
        JCheckBox boldItalicCheckBox = new JCheckBox("Bold/Italic");
        boldItalicCheckBox.setSelected(false);
        
        // Add the check boxes to the frame
        frame.getContentPane().add(plainCheckBox);
        frame.getContentPane().add(boldCheckBox);
        frame.getContentPane().add(italicCheckBox);
        frame.getContentPane().add(boldItalicCheckBox);

        frame.setLayout(new FlowLayout());
        frame.pack();
        frame.setVisible(true);
    }
}
