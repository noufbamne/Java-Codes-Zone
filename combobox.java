import javax.swing.*;
import java.awt.*;
public class combobox extends Frame {
    combobox() {
        setSize(300, 300);
        setLayout(new FlowLayout());
        String[] items = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
        JComboBox comboBox = new JComboBox(items);
        add(comboBox);

        setVisible(true);
    }
    public static void main(String[] args) {    
        new combobox();
    }
}