/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.realestateappclient.gui;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;

/**
 *
 * Agent GUI 
 * @author Manasseh Barnes- 218009615
 */
public class agentGUI extends JFrame implements ActionListener {
    
    //Panels 
    private JPanel WindowAgentPanel; //Main Border Layout 
    private JPanel HeadingPanel; //North in Main Border Layout //Also a GridLayout with 2 extra padding
    private JPanel MenuPanel; // West in Main Border Layout //Also a Boxlayout with buttons
    private JPanel WelcomeagentPanel; // Center in Border Grid Layout //Also a GridLayout 
    
    private JPanel addCustomerPanel; //Main Customer Panel -- border Layout
    private JPanel customerHeading; //Flow layout in Main border layout
    private JPanel customerDetails; //Grid LAyout in Main Border Layout
    private JPanel customerButtons; // Grid Layout in Main Border Layout
    
    
    //Labels
    private JLabel lblHeading, lblMenu;
    private JLabel lblPadding1, lblPadding2, lblPadding3, lblPadding4, lblPadding5, lblPadding6, lblPadding7, lblPadding8, lblPadding9, lblPadding10;
    private JLabel lblPadding11,lblPadding12, lblPadding13, lblPadding14, lblPadding15, lblPadding16, lblPadding17, lblPadding18, lblPadding19, lblPadding20, lblPadding21, lblPadding22,
                    lblPadding23,lblPadding24,lblPadding25,lblPadding26;
    
    private JLabel lblCustomer, lblCustomerDetails, lblName, lblSurname, lblMobile, lblEmail, lblMarital, lblIdNum;
    private JLabel lblHouseDetails, lblhousenum, lblnumRooms, lblStreetName, lblRentPrice;
    
    //TextFields
    private JTextField txtName, txtSurname, txtMobileNum, txtEmail, txtIDnum;
    private JTextField txtHouseNum, txtRooms, txtStreetName, txtRentPrice;
    
    //Buttons
    private JButton btnAdd, btnView, btnReport, btnLogout;
    private JButton btnSave, btnClear, btnBack;
    
    //ComboBoxes
    private JComboBox cboMaritalStatus;
    private JComboBox cboLocation;
    private JComboBox cboAvailable;
    
    
    //Fonts
    private Font ft1, ft2, ft3, ft4;
    
    agentGUI(){
        //1st view
        //Panels
        WindowAgentPanel = new JPanel();
            WindowAgentPanel.setBackground(new Color(86, 105, 104));
        HeadingPanel = new JPanel();
            HeadingPanel.setBackground(new Color(77, 132, 129));
        MenuPanel = new JPanel();
            MenuPanel.setBackground(new Color(77, 132, 129));
        WelcomeagentPanel = new JPanel();    
        
        //Labels
        lblHeading = new JLabel("Haven Group Real Estate");
        lblMenu = new JLabel("MENU");
        
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
        btnAdd = new JButton("Add New Customer");
        btnView = new JButton("View All Customers");
        btnReport = new JButton("Report Totals");
        btnLogout = new JButton("LOG OUT");
            btnLogout.setForeground(Color.white);
            btnLogout.setFont(ft1);
            btnLogout.setBackground(new Color(77, 132, 129)); 
            
        //2nd view
        //Panels
        addCustomerPanel = new JPanel();
            
        customerHeading = new JPanel();
            customerHeading.setBackground(new Color(75,124,78));
        customerDetails = new JPanel();
            customerHeading.setBackground(new Color(81,99,125));
        customerButtons = new JPanel();
        
        //Labels
        lblCustomer = new JLabel("Add New Customer");
        lblCustomerDetails = new JLabel("Customer Details");
        lblName = new JLabel("Name");
        lblSurname = new JLabel("Surname");
        lblMobile = new JLabel("Mobile Number");
        lblEmail = new JLabel("Email Address");
        lblMarital = new JLabel("Marital Status");
        lblIdNum = new JLabel("ID Number");
        
        lblHouseDetails = new JLabel("Rent Details: "); 
        lblhousenum = new JLabel("House Number: "); 
        lblnumRooms = new JLabel("Number of Rooms: ");
        lblStreetName = new JLabel("Street Name: ");
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
           
        //TextFields
        txtName = new JTextField();
        txtSurname = new JTextField(); 
        txtMobileNum = new JTextField();
        txtEmail = new JTextField();
        txtIDnum = new JTextField();
        
        txtHouseNum = new JTextField(); 
        txtRooms = new JTextField(); 
        txtStreetName = new JTextField(); 
        txtRentPrice = new JTextField();
        
        //Buttons
        btnSave = new JButton("SAVE");
        btnClear = new JButton("CLEAR");
        btnBack = new JButton("Back");
        //ComboBoxes
        cboMaritalStatus = new JComboBox(new String[]{"Single", "Married", "Divorced", "Widowed"});
        cboLocation = new JComboBox();
        cboAvailable = new JComboBox();
        
        //Fonts
        ft1 = new Font("Arial", Font.BOLD, 36);
        ft2 = new Font("Arial", Font.PLAIN, 28);
        ft3 = new Font("Arial", Font.PLAIN, 24);
        ft4 = new Font("Arial", Font.ITALIC, 16);
        
    }
    
    public void SetGUI(){
        //Layouts for Panels
        //1st view
        WindowAgentPanel.setLayout(new BorderLayout());
        HeadingPanel.setLayout(new GridLayout(1,3));
        MenuPanel.setLayout(new GridLayout(5,1));
          
        HeadingPanel.add(lblPadding1);
            HeadingPanel.add(lblHeading);
            lblHeading.setFont(ft1);
            lblHeading.setHorizontalAlignment(JLabel.CENTER);
        HeadingPanel.add(lblPadding2);
        
        MenuPanel.add(lblMenu);
            lblMenu.setFont(ft1);
            lblMenu.setHorizontalAlignment(JLabel.CENTER);
        MenuPanel.add(btnAdd);
        MenuPanel.add(btnView);
        MenuPanel.add(btnReport);
        MenuPanel.add(btnLogout);
        
        
        //2nd view in WindowAgentPanel
        addCustomerPanel.setLayout(new BorderLayout());
        customerHeading.setLayout(new FlowLayout());
        customerDetails.setLayout(new GridLayout(8,5));
        customerButtons.setLayout(new GridLayout(1,3));
            
        customerHeading.add(lblCustomer); 
            lblCustomer.setHorizontalAlignment(JLabel.CENTER);
            lblCustomer.setFont(ft1);
        
        customerDetails.add(lblCustomerDetails);
            lblCustomerDetails.setHorizontalAlignment(JLabel.LEFT);
            lblCustomerDetails.setFont(ft2);
                customerDetails.add(lblPadding11);
                customerDetails.add(lblPadding12);
                customerDetails.add(lblPadding13);
                customerDetails.add(lblPadding14);
        customerDetails.add(lblName);
            lblName.setHorizontalAlignment(JLabel.CENTER);
        customerDetails.add(txtName);
        customerDetails.add(lblSurname);
            lblSurname.setHorizontalAlignment(JLabel.CENTER);
        customerDetails.add(txtSurname);
                customerDetails.add(lblPadding15);
        customerDetails.add(lblMobile);
            lblMobile.setHorizontalAlignment(JLabel.CENTER);
        customerDetails.add(txtMobileNum);
        customerDetails.add(lblEmail);
            lblEmail.setHorizontalAlignment(JLabel.CENTER);
        customerDetails.add(txtEmail);
                customerDetails.add(lblPadding16);
        customerDetails.add(lblMarital);
            lblMarital.setHorizontalAlignment(JLabel.CENTER);
        customerDetails.add(cboMaritalStatus);
        customerDetails.add(lblIdNum);
            lblIdNum.setHorizontalAlignment(JLabel.CENTER);
        customerDetails.add(txtIDnum);
                customerDetails.add(lblPadding17);
                customerDetails.add(lblPadding18);
                customerDetails.add(lblPadding19);
                customerDetails.add(lblPadding20);
                customerDetails.add(lblPadding21);
                customerDetails.add(lblPadding22);
        customerDetails.add(lblHouseDetails);
            lblHouseDetails.setFont(ft2);
                customerDetails.add(lblPadding23);
                customerDetails.add(lblPadding24);
                customerDetails.add(lblPadding25);
                customerDetails.add(lblPadding26);
        customerDetails.add(cboLocation);
        customerDetails.add(lblhousenum);
            lblhousenum.setHorizontalAlignment(JLabel.CENTER);
        customerDetails.add(txtHouseNum);
        customerDetails.add(lblnumRooms);
            lblnumRooms.setHorizontalAlignment(JLabel.CENTER);
        customerDetails.add(txtRooms);
        customerDetails.add(cboAvailable);
        customerDetails.add(lblStreetName);
            lblStreetName.setHorizontalAlignment(JLabel.CENTER);
        customerDetails.add(txtStreetName);
        customerDetails.add(lblRentPrice);
            lblRentPrice.setHorizontalAlignment(JLabel.CENTER);
        customerDetails.add(txtRentPrice);
        
        customerButtons.add(btnBack);
            btnBack.setFont(ft3);
        customerButtons.add(btnSave);
            btnSave.setFont(ft3);
        customerButtons.add(btnClear);
            btnClear.setFont(ft3);
            
        //1st Window    
        WindowAgentPanel.add(HeadingPanel, BorderLayout.NORTH);
        WindowAgentPanel.add(MenuPanel, BorderLayout.WEST);
        WindowAgentPanel.add(WelcomeagentPanel, BorderLayout.CENTER);
        
        //2nd Window
        addCustomerPanel.add(customerHeading, BorderLayout.NORTH);
        addCustomerPanel.add(customerDetails, BorderLayout.CENTER);
        addCustomerPanel.add(customerButtons, BorderLayout.SOUTH);
        
       
        btnBack.addActionListener(this);
        btnAdd.addActionListener(this);
        
        this.add(WindowAgentPanel);
        
        this.setPreferredSize(new Dimension(1300, 600));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new agentGUI().SetGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Add New Customer")) {
            WelcomeagentPanel.setVisible(false);
            WindowAgentPanel.add(addCustomerPanel, BorderLayout.CENTER);
            addCustomerPanel.setVisible(true);
        }
        else if(e.getActionCommand().equals("Back")) {
            addCustomerPanel.setVisible(false);
            WindowAgentPanel.add(WelcomeagentPanel, BorderLayout.CENTER);
            WelcomeagentPanel.setVisible(true);
        }
    }
}
