package Dental_Office;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ItemPanel extends JPanel {
    
    private JLabel itemLbl;
    
    public ItemPanel(String il, int y) {
        
        setLayout(null);
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        setBounds(0, y, 400, 50);
        
        itemLbl = new JLabel(il);
        itemLbl.setBounds(10, 25, 100, 20);
        add(itemLbl);
    }
}
