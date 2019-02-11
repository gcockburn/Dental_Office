package Dental_Office;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AppointmentList extends JPanel {
    
    private JLabel listLbl;
    
    public AppointmentList() {
        
        setLayout(null);
        setBounds(0, 0, 250, 500);
    }
    
    public void paintComponent(Graphics g) {
        
        g.setColor(Color.BLACK);
        g.drawRect(0, 0, 249, 499);
    }
}
