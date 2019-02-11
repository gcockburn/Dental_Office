package Dental_Office;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AppointmentList extends JPanel {
    
    private JLabel listLbl;
    private ArrayList<JPanel> appointItem = new ArrayList<JPanel>();
    
    public AppointmentList() {
        
        setLayout(null);
        setBounds(0, 0, 250, 500);
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        updateList();
    }
    
    public void updateList() {
        
        int length = Main.appointments.size();
        
        for(int i = 0; i < length; i++) {
            add(new AppointPanel(60 * i));
        }
    }
}
