package Dental_Office;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AppointmentWindow extends JFrame {
    
    private JPanel mainPanel;
    
    public AppointmentWindow() {
        
        super("Appointments");
        
        setSize(380, 350);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        
        mainPanel = new JPanel();
        mainPanel.setBounds(0, 0, 350, 300);
        mainPanel.setLayout(null);
        add(mainPanel);
        
    }
}
