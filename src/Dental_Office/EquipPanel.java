package Dental_Office;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class EquipPanel extends JPanel {
    
    //mask, gloves, molding clay, dental wires, floss, brushes, toothpaste, dental elastics, cotton balls
    
    private JPanel item1;
    private JPanel item2;
    private JPanel item3;
    private JPanel item4;
    private JPanel item5;
    private JPanel item6;
    private JPanel item7;
    private JPanel item8;
    
    public EquipPanel() {
        
        setLayout(null);
        setBounds(0, 0, 400, 379);
        
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        
        for(int i = 0; i < 8; i++) {
            add(new ItemPanel("Item Name", 47 * i));
        }
        
//        item1 = new JPanel();
//        item1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
//        item1.setBounds(0, 0, 400, 50);
//        add(item1);
//        
//        item2 = new JPanel();
//        item2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
//        item2.setBounds(0, 43, 400, 50);
//        add(item2);
//        
//        item3 = new JPanel();
//        item3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
//        item3.setBounds(0, 90, 400, 50);
//        add(item3);
//        
//        item4 = new JPanel();
//        item4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
//        item4.setBounds(0, 137, 400, 50);
//        add(item4);
//        
//        item5 = new JPanel();
//        item5.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
//        item5.setBounds(0, 184, 400, 50);
//        add(item5);
//        
//        item6 = new JPanel();
//        item6.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
//        item6.setBounds(0, 231, 400, 50);
//        add(item6);
//        
//        item7 = new JPanel();
//        item7.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
//        item7.setBounds(0, 277, 400, 50);
//        add(item7);
//        
//        item8 = new JPanel();
//        item8.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
//        item8.setBounds(0, 324, 400, 50);
//        add(item8);item1 = new JPanel();
//        item1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
//        item1.setBounds(0, 0, 400, 50);
//        add(item1);
//        
//        item2 = new JPanel();
//        item2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
//        item2.setBounds(0, 43, 400, 50);
//        add(item2);
//        
//        item3 = new JPanel();
//        item3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
//        item3.setBounds(0, 90, 400, 50);
//        add(item3);
//        
//        item4 = new JPanel();
//        item4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
//        item4.setBounds(0, 137, 400, 50);
//        add(item4);
//        
//        item5 = new JPanel();
//        item5.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
//        item5.setBounds(0, 184, 400, 50);
//        add(item5);
//        
//        item6 = new JPanel();
//        item6.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
//        item6.setBounds(0, 231, 400, 50);
//        add(item6);
//        
//        item7 = new JPanel();
//        item7.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
//        item7.setBounds(0, 277, 400, 50);
//        add(item7);
//        
//        item8 = new JPanel();
//        item8.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
//        item8.setBounds(0, 324, 400, 50);
//        add(item8);
    }
}
