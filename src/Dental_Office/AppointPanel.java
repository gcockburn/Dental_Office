package Dental_Office;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AppointPanel extends JPanel {
    
    private int y;
    private JLabel nameLbl;
    private JLabel dentLbl;
    private JLabel timeLbl;
    private JLabel dateLbl;
    private JLabel procedLbl;
    
    public AppointPanel(Appointment a, int y) {
        
        nameLbl = new JLabel(a.getPName());
        nameLbl.setBounds(10, 10, 100, 20);
        add(nameLbl);
        dentLbl = new JLabel(Main.dentists.get(a.getDName()).getName() + "");
        dentLbl.setBounds(10, 30, 150, 20);
        add(dentLbl);
        timeLbl = new JLabel(a.getTime());
        timeLbl.setBounds(130, 10, 100, 20);
        add(timeLbl);
        dateLbl = new JLabel(a.getDay() + "/" + (a.getMonth() + 1) + "/" + a.getYear());
        dateLbl.setBounds(130, 30, 100, 20);
        add(dateLbl);
        
        setLayout(null);
        setBounds(0, y, 250, 60);
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
    }
}
