package Dental_Office;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class EquipPanel extends JPanel {
    
    //mask, gloves, molding clay, dental wires, floss, brushes, toothpaste, dental elastics, cotton balls
    private String[] itemLbls = {"Surgical Masks", "Nitrile Gloves", "Molding Clay", "Dental Wire", "Dental Elastics", "Cotton Balls", "Floss", "Filling Metal"};
    
    public EquipPanel() {
        
        setLayout(null);
        setBounds(0, 0, 400, 379);
        
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        
        for(int i = 0; i < 8; i++) {
            add(new ItemPanel(itemLbls[i], 4, 120, 47 * i));
        }
    }
}
