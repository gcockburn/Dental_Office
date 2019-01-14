package Dental_Office;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginWindow extends JFrame implements ActionListener{
    
    private JPanel mainPanel;
    private JLabel loginLbl;
    private JLabel userLbl;
    private JLabel passLbl;
    private JTextField userField;
    private JTextField passField;
    private JButton loginBtn;
    private JButton patientBtn;
    
    public LoginWindow() {
        
        super("Dental Office");
        setSize(350, 300);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        mainPanel = new JPanel();
        mainPanel.setBounds(0, 0, 350, 300);
        mainPanel.setLayout(null);
        add(mainPanel);
        
        loginLbl = new JLabel("Login");
        loginLbl.setFont(new Font("Arial", Font.PLAIN, 30));
        loginLbl.setBounds(15, 10, 80, 50);
        mainPanel.add(loginLbl);
        
        userLbl = new JLabel("Username:");
        userLbl.setBounds(15, 100, 80, 20);
        mainPanel.add(userLbl);
        
        userField = new JTextField();
        userField.setBounds(100, 100, 150, 20);
        mainPanel.add(userField);
        
        passLbl = new JLabel("Password:");
        passLbl.setBounds(15, 150, 80, 20);
        mainPanel.add(passLbl);
        
        passField = new JTextField();
        passField.setBounds(100, 150, 150, 20);
        mainPanel.add(passField);
        
        loginBtn = new JButton("Login");
        loginBtn.setBounds(15, 200, 80, 30);
        mainPanel.add(loginBtn);
        
        patientBtn = new JButton("I am a patient");
        patientBtn.setBounds(120, 200, 150, 30);
        mainPanel.add(patientBtn);
        
        loginBtn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(userField.getText().equalsIgnoreCase("sec")) {
            
            if(passField.getText().equals("ret")) {
                
                new MakeAppointment().setVisible(true);
            }
        }
    }
}
