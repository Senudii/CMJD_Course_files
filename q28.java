import javax.swing.*;
import java.awt.*;

public class q28 extends JFrame {
    public q28() {
        setTitle("Slider Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel valueLabel = new JLabel("Value:");

        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        slider.setMinorTickSpacing(5);
        slider.setMajorTickSpacing(20);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        slider.addChangeListener(e -> {
            int value = slider.getValue();
            valueLabel.setText("Value: " + value);
        });

        panel.add(slider);
        panel.add(valueLabel);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(q28::new);
    }
}
