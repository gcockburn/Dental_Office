package Dental_Office;

import java.awt.Color;
import javax.swing.JPanel;

public class AppointPanel extends JPanel {
    
    private int y;
    
    public AppointPanel(int y) {
        
        setLayout(null);
        setBounds(0, y, 250, 60);
        setBackground(Color.BLACK);
    }
}
