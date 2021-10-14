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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import za.ac.cput.realestateapp.domain.house;
import za.ac.cput.realestateapp.domain.agent;
import za.ac.cput.realestateappclient.client.client;

/**
 * Admin GUI 
 * @author Manasseh Barnes- 218009615
 */

public class adminGUI extends JFrame implements ActionListener, ItemListener{
    private client client;
    
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
    
    private JPanel editPanel; //GridLayout
    private JPanel editHousePanel, editAgentPanel; //Grid Layouts
    
    //Labels
    private JLabel lblHeading, lblMenu, lblWelcome;
    private JLabel lblPadding1, lblPadding2, lblPadding3, lblPadding4, lblPadding5, lblPadding6, lblPadding7, lblPadding8, lblPadding9, lblPadding10;
    private JLabel lblPadding11,lblPadding12, lblPadding13, lblPadding14, lblPadding15, lblPadding16, lblPadding17, lblPadding18, lblPadding19, lblPadding20, lblPadding21, lblPadding22,
                    lblPadding23,lblPadding24,lblPadding25,lblPadding26, lblPadding27,lblPadding28,lblPadding29,lblPadding30, lblPadding31;
    
    private JLabel lblPadding40, lblPadding41, lblPadding42, lblPadding43, lblPadding44, lblPadding45, lblPadding46, lblPadding47, lblPadding48, lblPadding49, lblPadding50;
    
    private JLabel lblPadding51, lblPadding52, lblPadding53, lblPadding54, lblPadding55, lblPadding56, lblPadding57, lblPadding58, lblPadding59, lblPadding60, lblPadding61,lblPadding62, lblPadding63,lblPadding64, lblPadding65;
    
    private JLabel lblAddHouseHeading,lblhouseDetails, lblhouseID,lblhousenum, lblnumRooms, lblStreetName, lblRentPrice, lblType, lblArea;
    
    private JLabel lblAddAgentHeading, lblagentDetails, lblEmployeeID, lblagentName, lblagentSurname, lblMobileNum, lblemail;
    
    private JLabel lblEdithouseDetails, lblEdithouseID, lblEdithousenum, lblEditnumRooms, lblEditStreetName, lblEditRentPrice, lblisAvailable, lblEditArea, lblisActive;
    
    private JLabel lblEditagentDetails, lblEditagentEmployeeID, lblEditagentName, lblEditagentSurname, lblEditagentMobileNum, lblEditagentemail;
    //TextFields
    private JTextField txthouseID, txtHouseNum, txtRooms, txtStreetName, txtRentPrice, txtArea, txtPostalCode;
    
    private JTextField txtEmployeeID, txtName, txtSurname, txtMobileNum, txtEmail;
    
    private JTextField txtEditHouseID, txtEditHouseNum, txtEditRooms, txtEditCity, txtEditStreetName, txtEditRentPrice, txtEditArea, txtEditPostalCode; 
    
    private JTextField txtEditagentName, txtEditagentSurname, txtEditagentMobileNum, txtEditagentemail;
    
    //Buttons
    private JButton btnAdd, btnView, btnLogout, btnEdit;
    private JButton btnSaveHouse, btnBackHouse;
    private JButton btnSaveAgent, btnBackAgent;
    private JButton btnEditHouseBack, btnEditHouseUpdate;
    private JButton btnEditAgentBack, btnEditAgentUpdate;
    
    //ComboBoxes
    private JComboBox cboEdithouseID;
    private JComboBox cboEditagentEmployeeID;
    private JComboBox cboType;
    private JComboBox cboEditAvailable;
    private JComboBox cboEditActive;
    
    
    private DefaultListCellRenderer listRenderer;

    //Fonts
    private Font ft1, ft2, ft3, ft4;
    
                                                    
    adminGUI(){
        client = new client();
        
        //1st view - Welcome Page
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
        btnEdit = new JButton("Edit House/Agent Details");
        btnLogout = new JButton("LOG OUT");
            btnLogout.setForeground(Color.white);
            btnLogout.setFont(ft1);
            btnLogout.setBackground(new Color(77, 132, 129)); 
        //End 1st VIEW
        
        //2nd view - Add House
        //Panels
        addHousePanel = new JPanel();
        houseHeading = new JPanel();
            houseHeading.setBackground(new Color(75,124,78));
        houseDetails = new JPanel();
        houseButtons = new JPanel();
        
        //Labels
        lblAddHouseHeading = new JLabel("Add New House");
        lblhouseDetails = new JLabel("House Details: "); 
        lblhouseID = new JLabel("House ID: ");
        lblhousenum = new JLabel("House Number: "); 
        lblStreetName = new JLabel("Street Name: ");
        
        String listOfTypes[] = {"Free Standing House", "Condo", "Flat", "Mansion"};
        cboType = new JComboBox(listOfTypes);
        
        lblArea = new JLabel("Area: ");
        lblnumRooms = new JLabel("Number of Rooms: ");
        lblRentPrice = new JLabel("Rental Price(p/m): ");
        lblType = new JLabel("Type of Rental: ");
        
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
        txthouseID = new JTextField();
        txtHouseNum = new JTextField(); 
        txtRooms = new JTextField(); 
        txtStreetName = new JTextField(); 
        txtRentPrice = new JTextField();
        txtArea = new JTextField();
        txtPostalCode = new JTextField();
        
        //Buttons
        btnSaveHouse = new JButton("Save new House");
        btnBackHouse = new JButton("Back");
        
        //End 2nd VIEW
        
        //3rd VIEW - Add Agent
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
        lblagentName = new JLabel("Name: ");
        lblagentSurname = new JLabel("Surname: ");
        lblMobileNum = new JLabel("Mobile Number: ");
        lblemail = new JLabel("Email Address: ");
        
        //TextFields
        txtEmployeeID = new JTextField(); 
        txtName = new JTextField(); 
        txtSurname = new JTextField();
        txtMobileNum = new JTextField();
        txtEmail = new JTextField();
        
        //Buttons
        btnSaveAgent = new JButton("Save new Agent");
        btnBackAgent = new JButton("Back");
        //END 3rd View
        
        //4th View - Edit Panel house and agent
        //Panels
        editPanel = new JPanel();
        editHousePanel = new JPanel();
            //editHousePanel.setBackground(new Color(50, 105, 104));
        editAgentPanel = new JPanel();
            //editAgentPanel.setBackground(new Color(80, 105, 104));
        
        //Labels
        lblEdithouseID = new JLabel("House ID");
        lblEdithouseDetails = new JLabel("Edit House Details");
        lblEdithousenum = new JLabel("House Number: ");
        lblEditStreetName = new JLabel("Street Name: ");
        lblEditArea = new JLabel("Area: ");
        lblEditnumRooms = new JLabel("Number of Rooms: ");
        lblEditRentPrice = new JLabel("Rental Price(p/m): ");
        lblisAvailable = new JLabel("Is the Rental Available? ");
        
        lblEditagentDetails = new JLabel("Edit Agent Details");
        lblEditagentEmployeeID = new JLabel("Employee ID: ");
        lblEditagentName = new JLabel("Name: ");
        lblEditagentSurname = new JLabel("Surname: ");
        lblEditagentMobileNum = new JLabel("Mobile Number: ");
        lblEditagentemail = new JLabel("Email Address: ");
        lblisActive = new JLabel("Is this employee active? ");
        
        lblPadding40 = new JLabel("");
        lblPadding41 = new JLabel("");
        lblPadding42 = new JLabel("");
        lblPadding43 = new JLabel("");
        lblPadding44 = new JLabel("");
        lblPadding45 = new JLabel("");
        lblPadding46 = new JLabel("");
        lblPadding47 = new JLabel("");
        lblPadding48 = new JLabel("");
        lblPadding49 = new JLabel("");
        lblPadding50 = new JLabel("");
        
        lblPadding51 = new JLabel("");
        lblPadding52 = new JLabel("");
        lblPadding53 = new JLabel("");
        lblPadding54 = new JLabel("");
        lblPadding55 = new JLabel("");
        lblPadding56 = new JLabel("");
        lblPadding57 = new JLabel("");
        lblPadding58 = new JLabel("");
        lblPadding59 = new JLabel("");
        lblPadding60 = new JLabel("");
        lblPadding61 = new JLabel("");
        lblPadding62 = new JLabel("");
        lblPadding63 = new JLabel("");
        lblPadding64 = new JLabel("");
        lblPadding65 = new JLabel("");
        
        //TextFields
        txtEditHouseID = new JTextField();
        txtEditHouseNum = new JTextField();
        txtEditStreetName = new JTextField();
        txtEditArea = new JTextField();
        txtEditPostalCode = new JTextField();
        txtEditRooms = new JTextField();
        txtEditRentPrice = new JTextField(); 
        
        txtEditagentName = new JTextField();
        txtEditagentSurname = new JTextField();
        txtEditagentMobileNum = new JTextField();
        txtEditagentemail = new JTextField();
        
        //ComboBox
        String house_idCBO[] = {"No Selection made"};
        cboEdithouseID = new JComboBox(house_idCBO);
        
        String agent_idCBO[] = {"No Selection made"};
        cboEditagentEmployeeID = new JComboBox(agent_idCBO);
        
        String Available[] = {"No Selection made","YES", "NO"};
        cboEditAvailable = new JComboBox(Available);
        
        String Active[] = {"No Selection made","YES", "NO"};
        cboEditActive = new JComboBox(Active);
        
        //Buttons
        btnEditHouseBack = new JButton("Back");
        btnEditHouseUpdate = new JButton("Update House");
        btnEditAgentBack = new JButton("Back");
        btnEditAgentUpdate = new JButton("Update Agent");
        //End 4th View - Edit details
        
        
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
        MenuPanel.setLayout(new GridLayout(5,1));
          
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
        MenuPanel.add(btnEdit);
        MenuPanel.add(btnLogout);
        //End 1st VIEW
        
        //2nd view in WindowAdminPanel
        addHousePanel.setLayout(new BorderLayout());
        houseHeading.setLayout(new FlowLayout());
        houseDetails.setLayout(new GridLayout(9,2));
        houseButtons.setLayout(new GridLayout(1,2));
            
        houseHeading.add(lblAddHouseHeading); 
            lblAddHouseHeading.setHorizontalAlignment(JLabel.CENTER);
            lblAddHouseHeading.setFont(ft1);
        
        houseDetails.add(lblhouseDetails);
            lblhouseDetails.setHorizontalAlignment(JLabel.CENTER);
            lblhouseDetails.setFont(ft2);
                houseDetails.add(lblPadding11);
        houseDetails.add(lblhouseID);
            lblhouseID.setHorizontalAlignment(JLabel.CENTER);
        houseDetails.add(txthouseID);
            txthouseID.setHorizontalAlignment(JLabel.CENTER);
        houseDetails.add(lblhousenum);
            lblhousenum.setHorizontalAlignment(JLabel.CENTER);
        houseDetails.add(txtHouseNum);
            txtHouseNum.setHorizontalAlignment(JLabel.CENTER);
        houseDetails.add(lblStreetName);
            lblStreetName.setHorizontalAlignment(JLabel.CENTER);
        houseDetails.add(txtStreetName);
            txtStreetName.setHorizontalAlignment(JLabel.CENTER);
        
        houseDetails.add(lblArea);
            lblArea.setHorizontalAlignment(JLabel.CENTER);
        houseDetails.add(txtArea);
            txtArea.setHorizontalAlignment(JLabel.CENTER);
            
        houseDetails.add(lblnumRooms);
            lblnumRooms.setHorizontalAlignment(JLabel.CENTER);
        houseDetails.add(txtRooms);    
            txtRooms.setHorizontalAlignment(JLabel.CENTER);
        houseDetails.add(lblRentPrice);
            lblRentPrice.setHorizontalAlignment(JLabel.CENTER);
        houseDetails.add(txtRentPrice);
            txtRentPrice.setHorizontalAlignment(JLabel.CENTER);   
            
        houseDetails.add(lblType);
            lblType.setHorizontalAlignment(JLabel.CENTER);
        houseDetails.add(cboType);    
            listRenderer = new DefaultListCellRenderer();
            listRenderer.setHorizontalAlignment(DefaultListCellRenderer.CENTER); // center-aligned items
            cboType.setRenderer(listRenderer);
            
        houseButtons.add(btnBackHouse);
            btnBackHouse.setFont(ft3);
        houseButtons.add(btnSaveHouse);
            btnSaveHouse.setFont(ft3);
        //END 2nd VIEW
        
        //3rd View
        addAgentPanel.setLayout(new BorderLayout());
        agentHeading.setLayout(new FlowLayout());
        agentDetails.setLayout(new GridLayout(7,2));
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
        
        //4th View - Edit Panel
        editPanel.setLayout(new GridLayout(2,1));
        editHousePanel.setLayout(new GridLayout(9,3));
        editAgentPanel.setLayout(new GridLayout(8,3));
        
        editHousePanel.add(lblEdithouseDetails);
            lblEdithouseDetails.setFont(ft2);
            lblEdithouseDetails.setHorizontalAlignment(JLabel.CENTER);
        editHousePanel.add(lblEdithouseID);
            lblEdithouseID.setHorizontalAlignment(JLabel.CENTER);
        editHousePanel.add(cboEdithouseID);
            listRenderer = new DefaultListCellRenderer();
            listRenderer.setHorizontalAlignment(DefaultListCellRenderer.CENTER); // center-aligned items
            cboEdithouseID.setRenderer(listRenderer);
                editHousePanel.add(lblPadding40);
                editHousePanel.add(lblPadding41);
                editHousePanel.add(lblPadding42);
          
        editHousePanel.add(lblEdithousenum);
            lblEdithousenum.setHorizontalAlignment(JLabel.CENTER);
        editHousePanel.add(txtEditHouseNum);
            txtEditHouseNum.setHorizontalAlignment(JLabel.CENTER);
        
        editHousePanel.add(btnEditHouseBack);

        editHousePanel.add(lblEditStreetName);
            lblEditStreetName.setHorizontalAlignment(JLabel.CENTER);
        editHousePanel.add(txtEditStreetName);
            txtEditStreetName.setHorizontalAlignment(JLabel.CENTER);
        
        editHousePanel.add(lblPadding49);  
        
        editHousePanel.add(lblEditArea);
            lblEditArea.setHorizontalAlignment(JLabel.CENTER);
        editHousePanel.add(txtEditArea);
            txtEditArea.setHorizontalAlignment(JLabel.CENTER);
        
        editHousePanel.add(lblPadding46);
        
        editHousePanel.add(lblEditnumRooms);
            lblEditnumRooms.setHorizontalAlignment(JLabel.CENTER);
        editHousePanel.add(txtEditRooms);
            txtEditRooms.setHorizontalAlignment(JLabel.CENTER);
        
        editHousePanel.add(lblPadding48);
        
        editHousePanel.add(lblEditRentPrice);
            lblEditRentPrice.setHorizontalAlignment(JLabel.CENTER);
        editHousePanel.add(txtEditRentPrice);
            txtEditRentPrice.setHorizontalAlignment(JLabel.CENTER);
               
        editHousePanel.add(lblPadding64);
        
        editHousePanel.add(lblisAvailable);
            lblisAvailable.setHorizontalAlignment(JLabel.CENTER);
        editHousePanel.add(cboEditAvailable);
            listRenderer = new DefaultListCellRenderer();
            listRenderer.setHorizontalAlignment(DefaultListCellRenderer.CENTER); // center-aligned items
            cboEditAvailable.setRenderer(listRenderer);
            
        editHousePanel.add(btnEditHouseUpdate);
        //end house panel edit
        
        //Agent Panel Edit
        editAgentPanel.add(lblEditagentDetails);
            lblEditagentDetails.setFont(ft2);
            lblEditagentDetails.setHorizontalAlignment(JLabel.CENTER);
        editAgentPanel.add(lblEditagentEmployeeID);
            lblEditagentEmployeeID.setHorizontalAlignment(JLabel.CENTER);
        editAgentPanel.add(cboEditagentEmployeeID);
            listRenderer = new DefaultListCellRenderer();
            listRenderer.setHorizontalAlignment(DefaultListCellRenderer.CENTER); // center-aligned items
            cboEditagentEmployeeID.setRenderer(listRenderer);
                editAgentPanel.add(lblPadding51);
                editAgentPanel.add(lblPadding52);
                editAgentPanel.add(lblPadding53);
        
        editAgentPanel.add(lblEditagentName);
            lblEditagentName.setHorizontalAlignment(JLabel.CENTER);
        editAgentPanel.add(txtEditagentName);
            txtEditagentName.setHorizontalAlignment(JLabel.CENTER);
            
            editAgentPanel.add(btnEditAgentBack);
        
        editAgentPanel.add(lblEditagentSurname);
            lblEditagentSurname.setHorizontalAlignment(JLabel.CENTER);
        editAgentPanel.add(txtEditagentSurname);
            txtEditagentSurname.setHorizontalAlignment(JLabel.CENTER);
            
            editAgentPanel.add(lblPadding56);
        
        editAgentPanel.add(lblEditagentMobileNum);
            lblEditagentMobileNum.setHorizontalAlignment(JLabel.CENTER);
        editAgentPanel.add(txtEditagentMobileNum);
            txtEditagentMobileNum.setHorizontalAlignment(JLabel.CENTER);
        
            editAgentPanel.add(lblPadding57);
        
        editAgentPanel.add(lblEditagentemail);
            lblEditagentemail.setHorizontalAlignment(JLabel.CENTER);
        editAgentPanel.add(txtEditagentemail);
            txtEditagentemail.setHorizontalAlignment(JLabel.CENTER);
        
            editAgentPanel.add(lblPadding65);
            
        editAgentPanel.add(lblisActive);
            lblisActive.setHorizontalAlignment(JLabel.CENTER);
        editAgentPanel.add(cboEditActive);    
            listRenderer = new DefaultListCellRenderer();
            listRenderer.setHorizontalAlignment(DefaultListCellRenderer.CENTER); // center-aligned items
            cboEditActive.setRenderer(listRenderer);
        
        editAgentPanel.add(btnEditAgentUpdate);  
   
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
        
        //4th Window - Edit 
        editPanel.add(editHousePanel);
        editPanel.add(editAgentPanel);
 
        btnLogout.addActionListener(this);
        btnBackHouse.addActionListener(this);
        btnBackAgent.addActionListener(this);
        btnAdd.addActionListener(this);
        btnView.addActionListener(this);
        btnEdit.addActionListener(this);
        
        btnEditHouseBack.addActionListener(this);
        btnEditHouseUpdate.addActionListener(this);
        btnEditAgentBack.addActionListener(this);
        btnEditAgentUpdate.addActionListener(this);
        
        btnSaveHouse.addActionListener(this);
        btnSaveAgent.addActionListener(this);
        
        cboEdithouseID.addActionListener(this);
        cboEdithouseID.addItemListener(this);
        
        cboEditAvailable.addActionListener(this);
        
        cboEditagentEmployeeID.addActionListener(this);
        cboEditagentEmployeeID.addItemListener(this);
        
        cboEditActive.addActionListener(this);
        
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
    
    public void ClearFields(){
        txtEmployeeID.setText(null);
        txtName.setText(null);
        txtSurname.setText(null);
        txtMobileNum.setText(null);
        txtEmail.setText(null);
        
        txthouseID.setText(null);
        txtHouseNum.setText(null);
        txtStreetName.setText(null);
        txtArea.setText(null);
        txtRooms.setText(null);
        txtRentPrice.setText(null);
        
        txtEditHouseNum.setText(null);
        txtEditStreetName.setText(null);
        txtEditArea.setText(null);
        txtEditRooms.setText(null);
        txtEditRentPrice.setText(null);
        cboEditAvailable.setSelectedIndex(0);
        
        txtEditagentName.setText(null);
        txtEditagentSurname.setText(null);
        txtEditagentMobileNum.setText(null);
        txtEditagentemail.setText(null);
        cboEditActive.setSelectedIndex(0);
    }
    
    public void fillHouseID_CBO(){
        List<String> houseID_list = new ArrayList<>();

        houseID_list = client.populateEditHouseID_CBO();
        
        for(int i = 0; i < houseID_list.size(); i++) {
            String houseid_list = houseID_list.get(i);
            cboEdithouseID.addItem(houseid_list);
        }     
    }
    
    public void fillAgentID_CBO(){
        List<String> agentID_list = new ArrayList<>();

        agentID_list = client.populateEditAgentID_CBO();
        
        for(int i = 0; i < agentID_list.size(); i++) {
            String agentid_list = agentID_list.get(i);
            cboEditagentEmployeeID.addItem(agentid_list);
        }
    }
    
    //populateEditAgentFields
    public void fillFields_agent(){
        String agent_id = (String)cboEditagentEmployeeID.getSelectedItem();
        
        List<String> allAgent_list = new ArrayList<>();
        
        allAgent_list = client.populateEditAgentFields(agent_id);
        
        System.out.println("\nTHIS IS THE OUTPUT from DATABASE>> " + allAgent_list + "\n");
        for(int i = 0; i < allAgent_list.size(); i++) {
            String all_agentList = allAgent_list.get(0);
            txtEditagentName.setText(all_agentList); 
        }
        for(int i = 0; i < allAgent_list.size(); i++) {
            String all_agentList = allAgent_list.get(1);
            txtEditagentSurname.setText(all_agentList); 
        }
        for(int i = 0; i < allAgent_list.size(); i++) {
            String all_agentList = allAgent_list.get(2);
            txtEditagentMobileNum.setText(all_agentList); 
        }
        for(int i = 0; i < allAgent_list.size(); i++) {
            String all_agentList = allAgent_list.get(3);
            txtEditagentemail.setText(all_agentList); 
        }
        for(int i = 0; i < allAgent_list.size(); i++){
            String all_agentList = allAgent_list.get(4);
            if("true".equals(all_agentList)){
                cboEditActive.setSelectedIndex(1);
            }
            else{
                cboEditActive.setSelectedIndex(2);
            }
        }
    }
    
    public void fillFields_houses(){
        String rental = (String)cboEdithouseID.getSelectedItem();
        
        List<String> allRental_list = new ArrayList<>();
        
        allRental_list = client.populateEditHouseFields(rental);
        
        System.out.println("\nTHIS IS THE OUTPUT from DATABASE>> " + allRental_list + "\n");
        for(int i = 0; i < allRental_list.size(); i++) {
            String all_houseList = allRental_list.get(0);
            txtEditHouseNum.setText(all_houseList); 
        }
        for(int i = 0; i < allRental_list.size(); i++) {
            String all_houseList = allRental_list.get(1);
            txtEditStreetName.setText(all_houseList); 
        }
        for(int i = 0; i < allRental_list.size(); i++) {
            String all_houseList = allRental_list.get(2);
            txtEditArea.setText(all_houseList); 
        }
        for(int i = 0; i < allRental_list.size(); i++) {
            String all_houseList = allRental_list.get(3);
            txtEditRooms.setText(all_houseList); 
        }
        for(int i = 0; i < allRental_list.size(); i++) {
            String all_houseList = allRental_list.get(4);
            txtEditRentPrice.setText(all_houseList); 
        }
        for(int i = 0; i < allRental_list.size(); i++){
            String all_houseList = allRental_list.get(5);
            if("true".equals(all_houseList)){
                cboEditAvailable.setSelectedIndex(1);
            }
            else{
                cboEditAvailable.setSelectedIndex(2);
            }
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Add New House")) {
            WelcomeAdminPanel.setVisible(false);
            addAgentPanel.setVisible(false);
            editPanel.setVisible(false);
            WindowAdminPanel.add(addHousePanel, BorderLayout.CENTER);
            addHousePanel.setVisible(true);
            
            ClearFields();
        }
        else if(e.getActionCommand().equals("Add new Agent")) {
            WelcomeAdminPanel.setVisible(false);
            addHousePanel.setVisible(false);
            editPanel.setVisible(false);
            WindowAdminPanel.add(addAgentPanel, BorderLayout.CENTER);
            addAgentPanel.setVisible(true);
            
            ClearFields();
        }
        else if(e.getActionCommand().equals("Back")) {
            addHousePanel.setVisible(false);
            addAgentPanel.setVisible(false);
            editPanel.setVisible(false);
            WindowAdminPanel.add(WelcomeAdminPanel, BorderLayout.CENTER);
            WelcomeAdminPanel.setVisible(true);
            
            ClearFields();
        }
        else if(e.getActionCommand().equals("Edit House/Agent Details")) {
            WelcomeAdminPanel.setVisible(false);
            addAgentPanel.setVisible(false);
            addHousePanel.setVisible(false);
            WindowAdminPanel.add(editPanel, BorderLayout.CENTER);
            editPanel.setVisible(true);
            
            fillHouseID_CBO();
            fillAgentID_CBO();
        }
        else if(e.getActionCommand().equals("LOG OUT")) {
            client.logOUT();
            new loginGUI().SetGUI();
            this.setVisible(false);
        }
        
        //Database Interaction
        else if(e.getActionCommand().equals("Save new House")) {
            //get Values
            int houseID = Integer.valueOf(txthouseID.getText());
            int houseNum = Integer.valueOf(txtHouseNum.getText());
            String streetName = txtStreetName.getText();
            String area = txtArea.getText();
            int numOfRooms = Integer.valueOf(txtRooms.getText());
            int rent = Integer.valueOf(txtRentPrice.getText());
            String type = (String)cboType.getSelectedItem();
            
            //new Object
            house house = new house(houseID,houseNum,streetName,area,numOfRooms,rent, type, true);
            
            //Check if house is added
            boolean success = client.addHouse(house);
                System.out.println("Client returns " + success);
            if(success) {
                JOptionPane.showMessageDialog(this, "Customer has been successfully added!");
                ClearFields();
            }
            else {
                JOptionPane.showMessageDialog(this, "Customer could not be added due to technical issues");
            }
        }
        else if(e.getActionCommand().equals("Save new Agent")) {
            //get Values
            int employee_id = Integer.valueOf(txtEmployeeID.getText());
            String name = txtName.getText();
            String surname = txtSurname.getText();
            int mobile_number = Integer.valueOf(txtMobileNum.getText());
            String email = txtEmail.getText();
            
            agent agent = new agent(employee_id, name, surname, mobile_number, email, true);
            
            boolean success = client.addAgent(agent);
                System.out.println("Client returns " + success);
            if(success) {
                JOptionPane.showMessageDialog(this, "Agent has been successfully added");
                ClearFields();
            }
            else {
                JOptionPane.showMessageDialog(this, "Agent could not be added due to technical issues");
            }
        }
        //Update House
        else if(e.getActionCommand().equals("Update House")) {
            //get Values
            int cboSelection = Integer.parseInt(cboEdithouseID.getSelectedItem().toString());
            int houseNum = Integer.valueOf(txtEditHouseNum.getText());
            String streetName = txtEditStreetName.getText();
            String area = txtEditArea.getText();
            int numOfRooms = Integer.valueOf(txtEditRooms.getText());
            int rent = Integer.valueOf(txtEditRentPrice.getText());
            String type = "";
            boolean available = false;
            
            if(cboEditActive.getSelectedItem() == "YES"){
                available = true;
            }
            else{
                available = false;
            }
            
            //new Object
            house house = new house(cboSelection,houseNum,streetName,area,numOfRooms,rent, type, available);
            
            //Check if house is added
            boolean success = client.updateHouse(house);
                System.out.println("Client returns " + success);
            if(success) {
                JOptionPane.showMessageDialog(this, "House has been successfully updated!");
                ClearFields();
            }
            else {
                JOptionPane.showMessageDialog(this, "House could not be updated due to technical issues");
            }
        }
        //updateAgent
        else if(e.getActionCommand().equals("Update Agent")) {
            //get Values
            int cboSelection = Integer.parseInt(cboEditagentEmployeeID.getSelectedItem().toString());
            String name = txtEditagentName.getText();
            String surname = txtEditagentSurname.getText();
            int mobile_number = Integer.valueOf(txtEditagentMobileNum.getText());    
            String email = txtEditagentemail.getText();
            boolean active = false;
            
            if(cboEditActive.getSelectedItem() == "YES"){
                active = true;
            }
            else{
                active = false;
            }
            
            //new Object
            agent agent = new agent(cboSelection,name,surname,mobile_number,email,active);
            
            //Check if house is added
            boolean success = client.updateAgent(agent);
                System.out.println("Client returns " + success);
            if(success) {
                JOptionPane.showMessageDialog(this, "Agent has been successfully updated!");
                ClearFields();
            }
            else {
                JOptionPane.showMessageDialog(this, "Agent could not be updated due to technical issues");
            }
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource().equals(cboEdithouseID)){
            if(e.getStateChange() == ItemEvent.SELECTED) {
                fillFields_houses();
            } 
        }  
        else if(e.getSource().equals(cboEditagentEmployeeID)){
            if(e.getStateChange() == ItemEvent.SELECTED){
               fillFields_agent();
            }
        }
    } 
}
