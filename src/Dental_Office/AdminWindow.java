package Dental_Office;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AdminWindow extends JFrame implements ActionListener {
    
    private JPanel mainPanel;
    public EmployeeList empList;
    private JButton hireEmpBtn;
    private HireFrame hf;
    private EquipPanel ep;
    private JButton orderBtn;
    private JButton cancelOrderBtn;
 
    public AdminWindow() {
    
        super("Admin Window");
        
        setSize(800, 600);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        
        mainPanel = new JPanel();
        mainPanel.setBounds(0, 0, 800, 600);
        mainPanel.setLayout(null);
        add(mainPanel);
        
        empList = new EmployeeList();
        empList.setBounds(510, 30, 250, 500);
        mainPanel.add(empList);
        
        ep = new EquipPanel();
        ep.setBounds(50, 30, 400, 379);
        mainPanel.add(ep);
        
        orderBtn = new JButton("Order");
        orderBtn.setBounds(50, 415, 100, 30);
        mainPanel.add(orderBtn);
        
        cancelOrderBtn = new JButton("Cancel Order");
        cancelOrderBtn.setBounds(160, 415, 120, 30);
        mainPanel.add(cancelOrderBtn);
        
        hireEmpBtn = new JButton("Hire Employee");
        hireEmpBtn.setBounds(10, 530, 140, 30);
        mainPanel.add(hireEmpBtn);
        
        hireEmpBtn.addActionListener(this);
        orderBtn.addActionListener(this);
        cancelOrderBtn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        JButton source = (JButton)ae.getSource();
        
        if(source == hireEmpBtn) {
            hf = new HireFrame();
        }
        else if(source == orderBtn) {
            
        }
        else if(source == cancelOrderBtn) {
            
            for(int i =0; i < 8; i++) {
                ep.ips.get(i).clearOrder();
            }
        }
    }
}
