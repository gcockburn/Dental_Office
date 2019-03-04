package Dental_Office;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ItemPanel extends JPanel {
    
    private JLabel itemLbl;
    private JLabel stockLbl;
    private JLabel priceLbl;
    
    public ItemPanel(String il, int sl, double pl, int y) {
        
        setLayout(null);
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        setBounds(0, y, 400, 50);
        
        itemLbl = new JLabel(il);
        itemLbl.setBounds(10, 15, 100, 20);
        add(itemLbl);
        
        stockLbl = new JLabel("In Stock: " + sl);
        stockLbl.setBounds(140, 15, 100, 20);
        add(stockLbl);
        
        priceLbl = new JLabel("Price: $" + pl);
        priceLbl.setBounds(250, 15, 100, 20);
        add(priceLbl);
    }
}
