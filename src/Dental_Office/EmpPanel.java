package Dental_Office;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EmpPanel extends JPanel {

    private JLabel nameLbl;
    private JLabel posLbl;
    private JLabel degreesLbl;
    private JLabel expLbl;
    public JButton fireBtn;
    
    public EmpPanel(Employee e, int y) {
        
        setLayout(null);
        setBounds(0, y, 250, 60);
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        
        nameLbl = new JLabel(e.getName());
        nameLbl.setBounds(10, 10, 160, 20);
        add(nameLbl);
        
        posLbl = new JLabel(e.getPosition());
        posLbl.setBounds(190, 30, 100, 20);
        add(posLbl);
        
        if(e instanceof Dentist) {
            degreesLbl = new JLabel("Degrees: " + ((Dentist)e).getDegrees() + " (sat: " + ((Dentist) e).getSatisfaction() + "%)");
            degreesLbl.setBounds(10, 30, 200, 20);
            add(degreesLbl);
        }
        else if(e instanceof Secretary) {
            expLbl = new JLabel("Years Exp: " + ((Secretary)e).getYearsExp());
            expLbl.setBounds(10, 30, 200, 20);
            add(expLbl);
        }
        
        fireBtn = new JButton("Fire");
        fireBtn.setBounds(175, 10, 68, 20);
        add(fireBtn);
    }
}
