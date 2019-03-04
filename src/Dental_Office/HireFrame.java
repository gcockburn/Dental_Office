package Dental_Office;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class HireFrame extends JFrame implements ActionListener {
    
    private JLabel nameLbl;
    private JTextField nameFld;
    private JComboBox<String> posComBox;
    private JLabel salaryLbl;
    private JTextField salaryFld;
    private JLabel optionLbl;
    private JTextField optionFld;
    private JButton hireBtn;
    
    public HireFrame() {
        
        super("Hire Employee");
        
        setSize(400, 300);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        
        posComBox = new JComboBox<>();
        posComBox.addItem("~Select Position~");
        posComBox.addItem("Secretary");
        posComBox.addItem("Dentist");
        posComBox.setSelectedIndex(0);
        posComBox.setBounds(220, 10, 150, 25);
        add(posComBox);
        
        nameLbl = new JLabel("Employee Name:");
        nameLbl.setBounds(10, 10, 150, 20);
        add(nameLbl);
        
        nameFld = new JTextField();
        nameFld.setBounds(10, 35, 150, 28);
        add(nameFld);
        
        salaryLbl = new JLabel("Monthly Salary:");
        salaryLbl.setBounds(10, 60, 150, 20);
        add(salaryLbl);
        
        salaryFld = new JTextField();
        salaryFld.setBounds(10, 85, 150, 28);
        add(salaryFld);
        
        optionLbl = new JLabel();
        optionLbl.setBounds(10, 110, 150, 20);
        add(optionLbl);
        
        optionFld = new JTextField();
        optionFld.setBounds(10, 135, 0, 0);
        add(optionFld);
        
        hireBtn = new JButton("Hire");
        hireBtn.setBounds(10, 230, 80, 30);
        add(hireBtn);
        
        hireBtn.addActionListener(this);
        posComBox.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        //JButton source = (JButton)ae.getSource();
        
        if(ae.getSource() == hireBtn) {
            if(posComBox.getSelectedIndex() == 1) {
                Main.employees.add(new Secretary(nameFld.getText(), Integer.parseInt(optionFld.getText()), Integer.parseInt(salaryFld.getText())));
            }
            else if(posComBox.getSelectedIndex() == 2) {
                Main.employees.add(new Dentist(nameFld.getText(), optionFld.getText(), Integer.parseInt(salaryFld.getText())));
            }
            
            Main.sw.lw.adw.empList.refreshEmps();
            this.dispose();
            Main.saveEmployeeFile("Employee List", Main.employees);
        }
        
        if(posComBox.getSelectedIndex() == 1) {
            optionLbl.setText("Years of Experience:");
            optionFld.setBounds(10, 135, 150, 28);
            optionFld.setText("");
        }
        else if(posComBox.getSelectedIndex() == 2) {
            optionLbl.setText("Degrees:");
            optionFld.setBounds(10, 135, 150, 28);
            optionFld.setText("");
        }
        else {
            optionLbl.setText("");
            optionFld.setBounds(10, 135, 0, 0);
            optionFld.setText("");
        }
    }
}