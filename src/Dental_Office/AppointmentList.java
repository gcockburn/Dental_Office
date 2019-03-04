package Dental_Office;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class AppointmentList extends JPanel implements ActionListener {
    
    public ArrayList<AppointPanel> appointItem = new ArrayList<AppointPanel>();
    
    
    public AppointmentList() {
        
        setLayout(null);
        setBounds(0, 0, 250, 500);
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        updateList();
    }
    
    public void updateList() {
        
        int length = Main.appointments.size();
        
        for(int i = 0; i < length; i++) {
            appointItem.add(new AppointPanel(Main.appointments.get(i), 57 * i));
            appointItem.get(i).cancelBtn.addActionListener(this);
            add(appointItem.get(i));
            repaint();
            Main.saveAppointFile("Current Appointment List.txt", Main.appointments);
        }
    }
    
    public void removeAppoint() {
        
        removeAll();
        
        appointItem.clear();
        
        repaint();
        
        updateList();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        JButton source = (JButton)ae.getSource();
        
        for(int i = 0; i < appointItem.size(); i++) {
            
            if(source == appointItem.get(i).cancelBtn) {
                Main.appointments.remove(i);
                removeAppoint();
                
            }
        }
    }
}