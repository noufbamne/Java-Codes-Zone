import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChangerGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Changer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE); // Initial background color is white

        frame.getContentPane().add(panel);

        JButton button = new JButton("Click here"); // Button label is "Click here"
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); // Set cursor to hand cursor
        button.setFont(new Font("Arial", Font.BOLD, 24)); // Increase font size
        button.setPreferredSize(new Dimension(200, 50)); // Increase button size

        panel.setLayout(new GridBagLayout()); // Use GridBagLayout to center the button
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.CENTER; // Center the button
        panel.add(button, gbc);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.PINK); // Change to Pink on click
            }
        });

        frame.setVisible(true);
    }
}