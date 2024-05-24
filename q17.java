import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class q17 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Details Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);
        
        JLabel ageLabel = new JLabel("Age:");
        JTextField ageField = new JTextField(5);
        
        JLabel addressLabel = new JLabel("Address:");
        JTextField addressField = new JTextField(20);
        
        JLabel phoneLabel = new JLabel("Phone No:");
        JTextField phoneField = new JTextField(10);
        
        JButton submitButton = new JButton("Add Student");
        JButton cancelButton = new JButton("Cancel");
        
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        
        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(nameLabel, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 0;
        formPanel.add(nameField, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(ageLabel, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 1;
        formPanel.add(ageField, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        formPanel.add(addressLabel, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 2;
        formPanel.add(addressField, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 3;
        formPanel.add(phoneLabel, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 3;
        formPanel.add(phoneField, gbc);
       
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(submitButton);
        buttonPanel.add(cancelButton);
        
        frame.add(formPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
