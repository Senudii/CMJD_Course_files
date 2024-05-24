import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class q25 extends JFrame {
    private JSlider[] sliders;

    public q25() {
        setTitle("Equalizer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);

        sliders = new JSlider[10];
        for (int i = 0; i < sliders.length; i++) {
            sliders[i] = new JSlider(JSlider.VERTICAL, -10, 10, 0);
            sliders[i].setMajorTickSpacing(5);
            sliders[i].setPaintTicks(true);
            sliders[i].setPaintLabels(true);
            sliders[i].setBorder(BorderFactory.createTitledBorder("Band " + (i + 1)));
        }

        // Set up layout
        JPanel equalizerPanel = new JPanel(new GridLayout(1, sliders.length));
        for (JSlider slider : sliders) {
            equalizerPanel.add(slider);
        }

        // Add change listener to each slider
        for (JSlider slider : sliders) {
            slider.addChangeListener(new SliderChangeListener());
        }

        getContentPane().add(equalizerPanel);
        pack();
        setLocationRelativeTo(null);
    }

    class SliderChangeListener implements ChangeListener {
        public void stateChanged(ChangeEvent e) {
            JSlider source = (JSlider) e.getSource();
            if (!source.getValueIsAdjusting()) {
                int band = -1;
                for (int i = 0; i < sliders.length; i++) {
                    if (source == sliders[i]) {
                        band = i;
                        break;
                    }
                }
                if (band != -1) {
                    System.out.println("Band " + (band + 1) + ": " + source.getValue());
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new q25().setVisible(true));
    }
}
