package Dental_Office;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AppointmentWindow extends JFrame {
    
    private JPanel mainPanel;
    private JButton createAppoint;
    private JButton changeAppoint;
    private JButton cancelAppoint;
    
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
        
        createAppoint = new JButton("Create Appointment");
        createAppoint.setBounds(50, 300, 80, 20);
        mainPanel.add(createAppoint);
    }
}
