package Dental_Office;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AppointPanel extends JPanel {
    
    private JLabel nameLbl;
    private JLabel dentLbl;
    private JLabel timeLbl;
    private JLabel dateLbl;
    private JLabel procedLbl;
    public JButton cancelBtn;
    private JLabel checkedLbl;
    
    public AppointPanel(Appointment a, int y) {
        
        setLayout(null);
        setBounds(0, y, 250, 60);
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        
        nameLbl = new JLabel(a.getPName());
        nameLbl.setBounds(10, 10, 100, 20);
        add(nameLbl);
        dentLbl = new JLabel("Dr. " + Main.employees.get(a.getDName()).getName() + "");
        dentLbl.setBounds(10, 30, 150, 20);
        add(dentLbl);
        timeLbl = new JLabel(a.getTime());
        timeLbl.setBounds(140, 10, 100, 20);
        add(timeLbl);
        dateLbl = new JLabel(a.getDay() + "/" + (a.getMonth() + 1) + "/" + a.getYear());
        dateLbl.setBounds(150, 30, 100, 20);
        add(dateLbl);
        
        cancelBtn = new JButton("Cancel");
        cancelBtn.setBounds(175, 10, 68, 20);
        add(cancelBtn);
    }
}