package Dental_Office;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AppointmentWindow extends JFrame implements ActionListener {
    
    private JPanel mainPanel;
    private JButton createAppoint;
    private JButton changeAppoint;
    private JButton cancelAppoint;
    
    public AppointmentWindow() {
        
        super("Appointments");
        
        setSize(800, 600);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        
        mainPanel = new JPanel();
        mainPanel.setBounds(0, 0, 800, 600);
        mainPanel.setLayout(null);
        add(mainPanel);
        
        createAppoint = new JButton("Create Appointment");
        createAppoint.setBounds(10, 530, 140, 30);
        mainPanel.add(createAppoint);
        
        changeAppoint = new JButton("Change Appointment");
        changeAppoint.setBounds(160, 530, 150, 30);
        mainPanel.add(changeAppoint);
        
        cancelAppoint = new JButton("Cancel Appointment");
        cancelAppoint.setBounds(320, 530, 150, 30);
        mainPanel.add(cancelAppoint);
        
        createAppoint.addActionListener(this);
        changeAppoint.addActionListener(this);
        cancelAppoint.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        JButton source = (JButton)ae.getSource();
        
        if(source == createAppoint) {
            
            new MakeAppointment().setVisible(true);
        }
        
        else if(source == changeAppoint) {
            
            new ChangeAppointment().setVisible(true);
        }
        
        else if(source == cancelAppoint) {
            
        }
    }
}
