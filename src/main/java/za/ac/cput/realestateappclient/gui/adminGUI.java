/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.realestateappclient.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Admin GUI 
 * @author Manasseh Barnes- 218009615
 */

public class adminGUI extends JFrame implements ActionListener {
    
    //Panels 
    private JPanel WindowAdminPanel; //Main Border Layout 
    private JPanel HeadingPanel; //North in Main Border Layout //Also a GridLayout with 2 extra padding
    private JPanel MenuPanel; // West in Main Border Layout //Also a Boxlayout with buttons
    private JPanel WelcomeAdminPanel; // Center in Border Grid Layout //Also a GridLayout 
    
    private JPanel addHousePanel; //Main Customer Panel -- border Layout
    private JPanel houseHeading; //Flow layout in Main border layout
    private JPanel houseDetails; //Grid LAyout in Main Border Layout
    private JPanel houseButtons; // Grid Layout in Main Border Layout
    
    private JPanel addAgentPanel; //Main Panel -- Border Layout
    private JPanel agentHeading; //North in Main Border Layout Panel
    private JPanel agentDetails; // Center in Main Border Layout Panel
    private JPanel agentButtons; // South in Main Border Layout Panel
    
    //Labels
    private JLabel lblHeading, lblMenu, lblWelcome;
    private JLabel lblPadding1, lblPadding2, lblPadding3, lblPadding4, lblPadding5, lblPadding6, lblPadding7, lblPadding8, lblPadding9, lblPadding10;
    private JLabel lblPadding11,lblPadding12, lblPadding13, lblPadding14, lblPadding15, lblPadding16, lblPadding17, lblPadding18, lblPadding19, lblPadding20, lblPadding21, lblPadding22,
                    lblPadding23,lblPadding24,lblPadding25,lblPadding26, lblPadding27,lblPadding28,lblPadding29,lblPadding30, lblPadding31;

    private JLabel lblAddHouseHeading,lblhouseDetails, lblhousenum, lblnumRooms, lblStreetName, lblRentPrice, lblCity, lblArea, lblProvince, lblPostalCode;
    
    private JLabel lblAddAgentHeading, lblagentDetails, lblEmployeeID, lblIDnum, lblagentName, lblagentSurname, lblMobileNum, lblemail;
    //TextFields
    private JTextField txtHouseNum, txtRooms, txtStreetName, txtRentPrice, txtArea, txtPostalCode;
    
    private JTextField txtEmployeeID, txtID, txtName, txtSurname, txtMobileNum, txtEmail;
    
    //Buttons
    private JButton btnAdd, btnView, btnLogout;
    private JButton btnSaveHouse, btnBackHouse;
    private JButton btnSaveAgent, btnBackAgent;
    
    //ComboBoxes
    private JComboBox cboCity;
    private JComboBox cboProvince;

    //Fonts
    private Font ft1, ft2, ft3, ft4;
    
    
    adminGUI(){
        //1st view
        //Panels
        WindowAdminPanel = new JPanel();
            WindowAdminPanel.setBackground(new Color(86, 105, 104));
        HeadingPanel = new JPanel();
            HeadingPanel.setBackground(new Color(77, 132, 129));
        MenuPanel = new JPanel();
            MenuPanel.setBackground(new Color(77, 132, 129));
        WelcomeAdminPanel = new JPanel();    
        
        //Labels
        lblHeading = new JLabel("Haven Group Real Estate");
        lblMenu = new JLabel("MENU");
        lblWelcome = new JLabel("Welcome Admin");
        
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
        
        //buttons
        btnAdd = new JButton("Add New House");
        btnView = new JButton("Add new Agent");
        btnLogout = new JButton("LOG OUT");
            btnLogout.setForeground(Color.white);
            btnLogout.setFont(ft1);
            btnLogout.setBackground(new Color(77, 132, 129)); 
        //End 1st VIEW
        
        //2nd view
        //Panels
        addHousePanel = new JPanel();
        houseHeading = new JPanel();
            houseHeading.setBackground(new Color(75,124,78));
        houseDetails = new JPanel();
        houseButtons = new JPanel();
        
        //Labels
        lblAddHouseHeading = new JLabel("Add New House");
        lblhouseDetails = new JLabel("House Details: "); 
        lblhousenum = new JLabel("House Number: "); 
        lblStreetName = new JLabel("Street Name: ");
        lblCity = new JLabel("City: ");
        lblArea = new JLabel("Area: ");
        lblProvince = new JLabel("Province: ");
        lblPostalCode = new JLabel("Postal Code: ");
        lblnumRooms = new JLabel("Number of Rooms: ");
        lblRentPrice = new JLabel("Rental Price(p/m): ");
        
        lblPadding11 = new JLabel("");
        lblPadding12 = new JLabel("");
        lblPadding13 = new JLabel("");
        lblPadding14 = new JLabel("");
        lblPadding15 = new JLabel("");
        lblPadding16 = new JLabel("");
        lblPadding17 = new JLabel("");
        lblPadding18 = new JLabel("");
        lblPadding19 = new JLabel("");
        lblPadding20 = new JLabel("");
        lblPadding21 = new JLabel("");
        lblPadding22 = new JLabel("");
        lblPadding23 = new JLabel("");
        lblPadding24 = new JLabel("");
        lblPadding25 = new JLabel("");
        lblPadding26 = new JLabel("");
        lblPadding27 = new JLabel("");
        lblPadding28 = new JLabel("");
        lblPadding29 = new JLabel("");
        lblPadding30 = new JLabel("");
        lblPadding31 = new JLabel("");
           
        //TextFields
        txtHouseNum = new JTextField(); 
        txtRooms = new JTextField(); 
        txtStreetName = new JTextField(); 
        txtRentPrice = new JTextField();
        txtArea = new JTextField();
        txtPostalCode = new JTextField();
        
        //Buttons
        btnSaveHouse = new JButton("SAVE");
        btnBackHouse = new JButton("Back");
        
        //ComboBoxes
        cboCity = new JComboBox();
        cboProvince = new JComboBox();
        //End 2nd VIEW
        
        //3rd VIEW
        //Panels
        addAgentPanel = new JPanel();
        agentHeading = new JPanel();
            agentHeading.setBackground(new Color(75,124,78));
        agentDetails = new JPanel();
            //agentDetails.setBackground(new Color(75,200,78));
        agentButtons = new JPanel();
            //agentButtons.setBackground(new Color(75,200,255));    

        //Labels
        lblAddAgentHeading = new JLabel("Add New Agent");
        lblagentDetails =  new JLabel("Agent Details: "); 
        lblEmployeeID =  new JLabel("Employee ID: ");
        lblIDnum = new JLabel("ID Number: ");
        lblagentName = new JLabel("Name: ");
        lblagentSurname = new JLabel("Surname: ");
        lblMobileNum = new JLabel("Mobile Number: ");
        lblemail = new JLabel("Email Address: ");
        
        //TextFields
        txtEmployeeID = new JTextField(); 
        txtID = new JTextField(); 
        txtName = new JTextField(); 
        txtSurname = new JTextField();
        txtMobileNum = new JTextField();
        txtEmail = new JTextField();
        
        //Buttons
        btnSaveAgent = new JButton("SAVE");
        btnBackAgent = new JButton("Back");
        
        //Fonts
        ft1 = new Font("Arial", Font.BOLD, 36);
        ft2 = new Font("Arial", Font.PLAIN, 28);
        ft3 = new Font("Arial", Font.PLAIN, 24);
        ft4 = new Font("Arial", Font.ITALIC, 16);
        //End Fonts
        
    }
    
    public void SetGUI(){
        //Layouts for Panels
        //1st view
        WindowAdminPanel.setLayout(new BorderLayout());
        HeadingPanel.setLayout(new GridLayout(1,3));
        MenuPanel.setLayout(new GridLayout(4,1));
          
        HeadingPanel.add(lblPadding1);
            HeadingPanel.add(lblHeading);
            lblHeading.setFont(ft1);
            lblHeading.setHorizontalAlignment(JLabel.CENTER);
        HeadingPanel.add(lblPadding2);
        
        WelcomeAdminPanel.add(lblWelcome);
            lblWelcome.setFont(ft1);
        MenuPanel.add(lblMenu);
            lblMenu.setFont(ft1);
            lblMenu.setHorizontalAlignment(JLabel.CENTER);
        MenuPanel.add(btnAdd);
        MenuPanel.add(btnView);
        MenuPanel.add(btnLogout);
        //End 1st VIEW
        
        //2nd view in WindowAdminPanel
        addHousePanel.setLayout(new BorderLayout());
        houseHeading.setLayout(new FlowLayout());
        houseDetails.setLayout(new GridLayout(10,2));
        houseButtons.setLayout(new GridLayout(1,2));
            
        houseHeading.add(lblAddHouseHeading); 
            lblAddHouseHeading.setHorizontalAlignment(JLabel.CENTER);
            lblAddHouseHeading.setFont(ft1);
        
        houseDetails.add(lblhouseDetails);
            lblhouseDetails.setHorizontalAlignment(JLabel.CENTER);
            lblhouseDetails.setFont(ft2);
                houseDetails.add(lblPadding11);
        houseDetails.add(lblhousenum);
            lblhousenum.setHorizontalAlignment(JLabel.CENTER);
        houseDetails.add(txtHouseNum);
            txtHouseNum.setHorizontalAlignment(JLabel.CENTER);
        houseDetails.add(lblStreetName);
            lblStreetName.setHorizontalAlignment(JLabel.CENTER);
        houseDetails.add(txtStreetName);
            txtStreetName.setHorizontalAlignment(JLabel.CENTER);
        houseDetails.add(lblCity);
            lblCity.setHorizontalAlignment(JLabel.CENTER);
        houseDetails.add(cboCity);
            //cboCity.setHorizontalAlignment(JLabel.CENTER);
        houseDetails.add(lblArea);
            lblArea.setHorizontalAlignment(JLabel.CENTER);
        houseDetails.add(txtArea);
            txtArea.setHorizontalAlignment(JLabel.CENTER);
        houseDetails.add(lblProvince);
            lblProvince.setHorizontalAlignment(JLabel.CENTER);
        houseDetails.add(cboProvince);
        houseDetails.add(lblPostalCode);
            lblPostalCode.setHorizontalAlignment(JLabel.CENTER);
        houseDetails.add(txtPostalCode);
            txtPostalCode.setHorizontalAlignment(JLabel.CENTER);
            
        houseDetails.add(lblnumRooms);
            lblnumRooms.setHorizontalAlignment(JLabel.CENTER);
        houseDetails.add(txtRooms);    
            txtRooms.setHorizontalAlignment(JLabel.CENTER);
        houseDetails.add(lblRentPrice);
            lblRentPrice.setHorizontalAlignment(JLabel.CENTER);
        houseDetails.add(txtRentPrice);
            txtRentPrice.setHorizontalAlignment(JLabel.CENTER);    
            
        houseButtons.add(btnBackHouse);
            btnBackHouse.setFont(ft3);
        houseButtons.add(btnSaveHouse);
            btnSaveHouse.setFont(ft3);
        //END 2nd VIEW
        
        //3rd View
        addAgentPanel.setLayout(new BorderLayout());
        agentHeading.setLayout(new FlowLayout());
        agentDetails.setLayout(new GridLayout(8,2));
        agentButtons.setLayout(new GridLayout(1,2));
        
        agentHeading.add(lblAddAgentHeading);
            lblAddAgentHeading.setHorizontalAlignment(JLabel.CENTER);
            lblAddAgentHeading.setFont(ft1);
        
        agentDetails.add(lblagentDetails);
            lblagentDetails.setHorizontalAlignment(JLabel.CENTER);
            lblagentDetails.setFont(ft2);
                agentDetails.add(lblPadding31);
                
        agentDetails.add(lblEmployeeID);
            lblEmployeeID.setHorizontalAlignment(JLabel.CENTER);
        agentDetails.add(txtEmployeeID);
            txtEmployeeID.setHorizontalAlignment(JLabel.CENTER);   
            
        agentDetails.add(lblIDnum);
            lblIDnum.setHorizontalAlignment(JLabel.CENTER);
        agentDetails.add(txtID);
            txtID.setHorizontalAlignment(JLabel.CENTER);
             
        agentDetails.add(lblagentName);
            lblagentName.setHorizontalAlignment(JLabel.CENTER);  
        agentDetails.add(txtName);
            txtName.setHorizontalAlignment(JLabel.CENTER);
            
        agentDetails.add(lblagentSurname);
            lblagentSurname.setHorizontalAlignment(JLabel.CENTER);
        agentDetails.add(txtSurname);
            txtSurname.setHorizontalAlignment(JLabel.CENTER);  
            
        agentDetails.add(lblMobileNum);
            lblMobileNum.setHorizontalAlignment(JLabel.CENTER);
        agentDetails.add(txtMobileNum);
            txtMobileNum.setHorizontalAlignment(JLabel.CENTER);  
            
        agentDetails.add(lblemail);
            lblemail.setHorizontalAlignment(JLabel.CENTER);
        agentDetails.add(txtEmail);
            txtEmail.setHorizontalAlignment(JLabel.CENTER);    
        
        //Buttons
        agentButtons.add(btnBackAgent);
            btnBackAgent.setFont(ft3);
        agentButtons.add(btnSaveAgent);
            btnSaveAgent.setFont(ft3);    
        //END 3rd VIEW    
        
        
        //1st Window    
        WindowAdminPanel.add(HeadingPanel, BorderLayout.NORTH);
        WindowAdminPanel.add(MenuPanel, BorderLayout.WEST);
        WindowAdminPanel.add(WelcomeAdminPanel, BorderLayout.CENTER);
        
        //2nd Window
        addHousePanel.add(houseHeading, BorderLayout.NORTH);
        addHousePanel.add(houseDetails, BorderLayout.CENTER);
        addHousePanel.add(houseButtons, BorderLayout.SOUTH);
        
        //3rd Window
        addAgentPanel.add(agentHeading, BorderLayout.NORTH);
        addAgentPanel.add(agentDetails, BorderLayout.CENTER);
        addAgentPanel.add(agentButtons, BorderLayout.SOUTH);
        
        
        btnLogout.addActionListener(this);
        btnBackHouse.addActionListener(this);
        btnBackAgent.addActionListener(this);
        btnAdd.addActionListener(this);
        btnView.addActionListener(this);
                
        this.add(WindowAdminPanel);
        this.setPreferredSize(new Dimension(1300, 600));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new adminGUI().SetGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Add New House")) {
            WelcomeAdminPanel.setVisible(false);
            addAgentPanel.setVisible(false);
            WindowAdminPanel.add(addHousePanel, BorderLayout.CENTER);
            addHousePanel.setVisible(true);
        }
        else if(e.getActionCommand().equals("Add new Agent")) {
            WelcomeAdminPanel.setVisible(false);
            addHousePanel.setVisible(false);
            WindowAdminPanel.add(addAgentPanel, BorderLayout.CENTER);
            addAgentPanel.setVisible(true);
        }
        else if(e.getActionCommand().equals("Back")) {
            addHousePanel.setVisible(false);
            addAgentPanel.setVisible(false);
            WindowAdminPanel.add(WelcomeAdminPanel, BorderLayout.CENTER);
            WelcomeAdminPanel.setVisible(true);
        }
        else if(e.getActionCommand().equals("LOG OUT")) {
            new loginGUI().SetGUI();
            this.setVisible(false);
        }
    }
}
