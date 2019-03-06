package Dental_Office;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class EquipPanel extends JPanel {
    
    public ArrayList<ItemPanel> ips = new ArrayList<>();
    
    public EquipPanel() {
        
        setLayout(null);
        setBounds(0, 0, 400, 379);
        
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        
        for(int i = 0; i < 8; i++) {
            ips.add(new ItemPanel(Main.inventory[i], Main.stocks[i], Main.prices[i], 47 * i));
            add(ips.get(i));
        }
    }
}
