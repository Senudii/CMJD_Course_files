import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class q24 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Date Selection");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel(new FlowLayout());
        
        // Month ComboBox
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        JComboBox<String> monthComboBox = new JComboBox<>(months);
        monthComboBox.setMaximumRowCount(4);
        
        // Year Spinner
        SpinnerNumberModel yearModel = new SpinnerNumberModel(2013, 1900, 2100, 1);
        JSpinner yearSpinner = new JSpinner(yearModel);
        JSpinner.DefaultEditor yearEditor = (JSpinner.DefaultEditor) yearSpinner.getEditor();
        yearEditor.getTextField().setEditable(false);
        
        // Day ComboBox
        JComboBox<Integer> dayComboBox = new JComboBox<>();
        updateDayComboBox(dayComboBox, 4);
        
        // Set the default selected date
        monthComboBox.setSelectedItem("April");
        yearSpinner.setValue(2013);
        dayComboBox.setSelectedItem(6);
        
        panel.add(yearSpinner);
        panel.add(new JLabel(" "));
        panel.add(monthComboBox);
        panel.add(new JLabel(" "));
        panel.add(dayComboBox);
        
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
    
    private static void updateDayComboBox(JComboBox<Integer> dayComboBox, int maxRowCount) {
        int daysInMonth = getDaysInMonth("April", 2013);
        dayComboBox.removeAllItems();
        
        for (int i = 1; i <= daysInMonth; i++) {
            dayComboBox.addItem(i);
        }
        
        dayComboBox.setMaximumRowCount(maxRowCount);
    }
    
    private static int getDaysInMonth(String month, int year) {
        int monthIndex = getMonthIndex(month);
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, monthIndex);
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }
    
    private static int getMonthIndex(String monthName) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        for (int i = 0; i < months.length; i++) {
            if (months[i].equalsIgnoreCase(monthName)) {
                return i;
            }
        }
        return -1;
    }
}
