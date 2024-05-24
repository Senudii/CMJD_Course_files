import javax.swing.*;
import java.awt.*;

public class q5 {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Flow Layout Window");
        
        // Set the size of the window
        frame.setSize(500, 200);  // Adjust the size to fit all buttons
        
        // Set the default close operation to shut down the JVM
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create the main panel with BoxLayout on the Y_AXIS
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        
        // Create first row panel with FlowLayout
        JPanel row1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("This is a button");
        JButton button3 = new JButton("Button 2");
        row1.add(button1);
        row1.add(button2);
        row1.add(button3);
        
        // Create second row panel with FlowLayout for the single button
        JPanel row2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton button4 = new JButton("Execute");
        row2.add(button4);
        
        // Add the row panels to the main panel
        mainPanel.add(row1);
        mainPanel.add(row2);
        
        // Add the main panel to the frame
        frame.add(mainPanel);
        
        // Make the window visible
        frame.setVisible(true);
    }
}
