import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChangerGUI_RandomColor {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Changer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);

        frame.getContentPane().add(panel);

        JButton button = new JButton("Change Color");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(getRandomColor());
            }
        });

        panel.add(button);

        frame.setVisible(true);
    }

    private static Color getRandomColor() {
        float r = (float) Math.random();
        float g = (float) Math.random();
        float b = (float) Math.random();
        return new Color(r, g, b);
    }
}