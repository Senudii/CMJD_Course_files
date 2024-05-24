
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class q30 extends JFrame {
    public q30() {
        setTitle("Time Table");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        // Data for the table (example)
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String[] hours = {"9:00 - 10:00", "10:00 - 11:00", "11:00 - 12:00", "12:00 - 13:00", "13:00 - 14:00"};
        String[][] data = new String[hours.length][days.length];

        // Fill the table with empty strings
        for (int i = 0; i < hours.length; i++) {
            for (int j = 0; j < days.length; j++) {
                data[i][j] = "";
            }
        }

        // Create a DefaultTableModel with the data
        DefaultTableModel model = new DefaultTableModel(data, days);

        // Create a JTable with the model
        JTable table = new JTable(model);
        table.setRowHeight(40); // Set row height

        // Add the table to a JScrollPane
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(q30::new);
    }
}
