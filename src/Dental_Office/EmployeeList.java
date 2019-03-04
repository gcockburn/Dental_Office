package Dental_Office;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EmployeeList extends JPanel implements ActionListener {
    
    private JLabel listLbl;
    public ArrayList<EmpPanel> empItem = new ArrayList<EmpPanel>();
    
    public EmployeeList() {
        
        setLayout(null);
        setBounds(0, 0, 250, 500);
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        updateList();
    }
    
    public void updateList() {
        
        int length = Main.employees.size();
        
        for(int i = 0; i < length; i++) {
            empItem.add(new EmpPanel(Main.employees.get(i), 57 * i));
            empItem.get(i).fireBtn.addActionListener(this);
            add(empItem.get(i));
            repaint();
            Main.saveEmployeeFile("Employee List.txt", Main.employees);
        }
    }
    
    public void refreshEmps() {
        
        removeAll();
        
        empItem.clear();
        
        repaint();
        
        updateList();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        JButton source = (JButton)ae.getSource();
        
        for(int i = 0; i < empItem.size(); i++) {
            
            if(source == empItem.get(i).fireBtn) {
                Main.employees.remove(i);
                refreshEmps();
            }
        }
    }
}
