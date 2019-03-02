package Dental_Office;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class EquipPanel extends JPanel {
    
    private JTable orderTable;
    
    public EquipPanel() {
        
        setLayout(null);
        setBounds(0, 0, 400, 400);
        
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        
        String[] headers = {"Equipment Name", "# in Stock", "Price($)", "# to Order"};
        Object[][] data = { //Be sure to change vaules later, figure out how to get jtextfield into a cell
            {"Gloves", 4, 28, new JTextField()},
            {"Masks", 4, 10, new JTextField()},
            {"", 4, 28, new JTextField()},
            {"", 4, 28, new JTextField()},
            {"", 4, 28, new JTextField()},
            {"", 4, 28, new JTextField()}
        };
        
        orderTable = new JTable(data, headers);
        orderTable.setBounds(0, 0, 400, 400);
        add(orderTable);
    }
}
