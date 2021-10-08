/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.realestateappclient.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * Login GUI for authentication
 * @author Manasseh Barnes- 218009615
 */
public class loginGUI extends JFrame implements ActionListener{
    
    //Panels
    private JPanel WindowLoginPanel; //Main Grid Layout 
    private JPanel HeadingPanel; //North in Main Grid Layout //Also a GridLayout with 2 extra padding
    private JPanel WelcomeTextPanel; // Center in Main Grid Layout //Also a GridLayout with 2 extra padding
    private JPanel LoginCredsPanel; // South in Main Grid Layout //Also a GridLayout with 6 extra padding
    
    //Labels
    private JLabel lblHeading, lblWelcome, lblLogin, lblUsername, lblPassword;
    private JLabel lblPadding1, lblPadding2, lblPadding3, lblPadding4, lblPadding5, lblPadding6, lblPadding7, lblPadding8, lblPadding9, lblPadding10;
    
    //TextFields
    private JTextField txtUsername, txtPassword;
    
    //Buttons
    private JButton btnSubmit;
    
    //Fonts
    private Font ft1, ft2, ft3, ft4;
    
    public loginGUI() {
        WindowLoginPanel = new JPanel();
        WindowLoginPanel.setBackground(new Color(86, 105, 104));
        
        HeadingPanel = new JPanel();
        HeadingPanel.setBackground(new Color(77, 132, 129));
        
        WelcomeTextPanel = new JPanel();
        //WelcomeTextPanel.setBackground(new Color(77, 132, 129));

        LoginCredsPanel = new JPanel();
        //LoginCredsPanel.setBackground(new Color(255, 250, 0));
        
        //Labels
        lblHeading = new JLabel("Haven Group Real Estate");
        lblWelcome = new JLabel("Welcome");
        lblLogin = new JLabel("Login");
        
        lblUsername = new JLabel("Username: ");
        lblPassword = new JLabel("Password: ");
        
        lblPadding1 = new JLabel("");
        lblPadding2 = new JLabel("");
        lblPadding3 = new JLabel("");
        lblPadding4 = new JLabel("");
        lblPadding5 = new JLabel("");
        lblPadding6 = new JLabel("");
        lblPadding7 = new JLabel("");
        lblPadding8 = new JLabel("");
        lblPadding9 = new JLabel("");
        lblPadding10 = new JLabel("");
        
        //Textfields
        txtUsername = new JTextField();
        txtPassword = new JPasswordField();
        
        //Buttons
        btnSubmit = new JButton("SUBMIT");
        
        //Fonts
        ft1 = new Font("Arial", Font.BOLD, 36);
        ft2 = new Font("Arial", Font.PLAIN, 28);
        ft3 = new Font("Arial", Font.PLAIN, 24);
        ft4 = new Font("Arial", Font.ITALIC, 16);
    }
    
    public void SetGUI(){
        //Layouts for Panels
        WindowLoginPanel.setLayout(new GridLayout(3,1));
        HeadingPanel.setLayout(new GridLayout(1,3));
        WelcomeTextPanel.setLayout(new GridLayout(1,3));
        LoginCredsPanel.setLayout(new GridLayout(4,3));
        
        //Heading Panel populated
        HeadingPanel.add(lblPadding7);
        HeadingPanel.add(lblHeading);
            lblHeading.setFont(ft1);
            lblHeading.setHorizontalAlignment(JLabel.CENTER);
        HeadingPanel.add(lblPadding8);
        
        //WelcomeText Panel populated
        WelcomeTextPanel.add(lblPadding9);
        WelcomeTextPanel.add(lblWelcome);
            lblWelcome.setFont(ft1);
            lblWelcome.setHorizontalAlignment(JLabel.CENTER);
        WelcomeTextPanel.add(lblPadding10);
        
        //LoginCred Panel populated
        LoginCredsPanel.add(lblPadding1);
        LoginCredsPanel.add(lblLogin);
            lblLogin.setFont(ft1);
            lblLogin.setHorizontalAlignment(JLabel.CENTER);
        LoginCredsPanel.add(lblPadding2);
        LoginCredsPanel.add(lblUsername);
            lblUsername.setFont(ft2);
            lblUsername.setHorizontalAlignment(JLabel.CENTER);
        LoginCredsPanel.add(txtUsername);
            txtUsername.setFont(ft3);
            txtUsername.setHorizontalAlignment(JTextField.CENTER);
        LoginCredsPanel.add(lblPadding3);
        LoginCredsPanel.add(lblPassword);
            lblPassword.setFont(ft2);
            lblPassword.setHorizontalAlignment(JLabel.CENTER);
        LoginCredsPanel.add(txtPassword);
            lblPassword.setFont(ft3);
            txtPassword.setHorizontalAlignment(JTextField.CENTER);
        LoginCredsPanel.add(lblPadding4);
        LoginCredsPanel.add(lblPadding5);
        LoginCredsPanel.add(btnSubmit);
            btnSubmit.setFont(ft3);
            btnSubmit.setHorizontalAlignment(JLabel.CENTER);
        LoginCredsPanel.add(lblPadding6);
        
        //WindowLogin Panel populated
        WindowLoginPanel.add(HeadingPanel);
        WindowLoginPanel.add(WelcomeTextPanel);
        WindowLoginPanel.add(LoginCredsPanel);
        
        btnSubmit.addActionListener(this);
        
        this.add(WindowLoginPanel);
        
        
        this.setPreferredSize(new Dimension(1600, 800));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    //Validation should be method in DAO but Good Job
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("SUBMIT")) {
            String Username = txtUsername.getText();
            String Password = txtPassword.getText();
            
            if(Username.equals("Agent") && Password.equals("agent")){
                new agentGUI().SetGUI();
                this.setVisible(false); 
            }
            else if(Username.equals("Admin") && Password.equals("admin")){
                new adminGUI().SetGUI();
                this.setVisible(false); 
            }
            else{
                JOptionPane.showMessageDialog(null,"Login Unsuccessful. Try Again");
                txtUsername.setText("");
                txtPassword.setText("");
            }
        }
    }
    
    public static void main(String[] args) {
        new loginGUI().SetGUI();
    }

}
