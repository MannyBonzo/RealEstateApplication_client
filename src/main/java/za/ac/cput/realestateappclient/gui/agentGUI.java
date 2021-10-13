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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import za.ac.cput.realestateappclient.client.client;

import za.ac.cput.realestateapp.domain.customer;
import za.ac.cput.realestateapp.domain.agent;
import za.ac.cput.realestateapp.domain.house;
import za.ac.cput.realestateapp.domain.rentTransaction;

import za.ac.cput.realestateappclient.gui.loginGUI;
/**
 * Agent GUI 
 * @author Manasseh Barnes- 218009615
 */
public class agentGUI extends JFrame implements ActionListener, ItemListener {
    private client client;
    
    //Panels 
    private JPanel WindowAgentPanel; //Main Border Layout 
    private JPanel HeadingPanel; //North in Main Border Layout //Also a GridLayout with 2 extra padding
    private JPanel MenuPanel; // West in Main Border Layout //Also a Boxlayout with buttons
    private JPanel WelcomeagentPanel; // Center in Border Grid Layout //Also a GridLayout 
    
    private JPanel addCustomerPanel; //Main Customer Panel -- border Layout
    private JPanel customerHeading; //Flow layout in Main border layout
    private JPanel customerDetails; //Grid LAyout in Main Border Layout
    private JPanel customerButtons; // Grid Layout in Main Border Layout
    
    private JPanel ViewCustomersPanel; //Main Panel -- Border Layout
    private JPanel ViewHeading; //North in Main Border Layout Panel
    private JPanel ViewtablePanel; // Center in Main Border Layout Panel
    private JPanel ViewButtonPanel; // South in Main Border Layout Panel
    
    private JTable CustViewTable; //table in Center Panel
    
    //Labels
    private JLabel lblHeading, lblMenu, lblWelcome;
    private JLabel lblPadding1, lblPadding2, lblPadding3, lblPadding4, lblPadding5, lblPadding6, lblPadding7, lblPadding8, lblPadding9, lblPadding10;
    private JLabel lblPadding11,lblPadding12, lblPadding13, lblPadding14, lblPadding15, lblPadding16, lblPadding17, lblPadding18, lblPadding19, lblPadding20, lblPadding21, lblPadding22,
                    lblPadding23,lblPadding24,lblPadding25,lblPadding26, lblPadding27,lblPadding28,lblPadding29,lblPadding30, lblPadding31, lblPadding32, lblPadding33, lblPadding34, lblPadding35;
    
    private JLabel lblCustomer, lblCustomerDetails, lblName, lblSurname, lblMobile, lblEmail,lblIdNum, lblcustID;
    private JLabel lblHouseDetails, lblhousenum, lblnumRooms, lblStreetName, lblRentPrice;
    
    private JLabel lblViewCustomer;
    //TextFields
    private JTextField txtName, txtSurname, txtMobileNum, txtEmail, txtIDnum, txtCustID;
    private JTextField txtHouseNum, txtRooms, txtStreetName, txtRentPrice;
    
    //Buttons
    private JButton btnAdd, btnView, btnReport, btnLogout;
    private JButton btnSave, btnBack;
    
    //ComboBoxes
    private JComboBox cboType;
    private JComboBox cboAvailable;
    
    private DefaultListCellRenderer listRenderer;
    
    //Fonts
    private Font ft1, ft2, ft3, ft4;
    
    
    agentGUI(){
        client = new client();
        
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
        lblWelcome = new JLabel("Welcome Agent");
        
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
        //End 1st VIEW
        
        //2nd view
        //Panels
        addCustomerPanel = new JPanel();
        customerHeading = new JPanel();
            customerHeading.setBackground(new Color(75,124,78));
        customerDetails = new JPanel();
        customerButtons = new JPanel();
        
        //Labels
        lblCustomer = new JLabel("Add New Customer");
        lblCustomerDetails = new JLabel("Customer Details:");
        lblcustID = new JLabel("Customer ID");
        lblName = new JLabel("Name");
        lblSurname = new JLabel("Surname");
        lblMobile = new JLabel("Mobile Number");
        lblEmail = new JLabel("Email Address");
        
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
        lblPadding27 = new JLabel("");
        lblPadding28 = new JLabel("");
        lblPadding29 = new JLabel("");
        lblPadding30 = new JLabel("");
        lblPadding31 = new JLabel("");
        lblPadding32 = new JLabel("");
        lblPadding33 = new JLabel(""); 
        lblPadding34 = new JLabel(""); 
        lblPadding35 = new JLabel("");
        
        //TextFields
        txtCustID = new JTextField();
        txtName = new JTextField();
        txtSurname = new JTextField(); 
        txtMobileNum = new JTextField();
        txtEmail = new JTextField();
        
        txtHouseNum = new JTextField(); 
        txtRooms = new JTextField(); 
        txtStreetName = new JTextField(); 
        txtRentPrice = new JTextField();
        
        //Buttons
        btnSave = new JButton("SAVE");
        btnBack = new JButton("Back");
        //ComboBoxes
            String listOfTypes[] = {"No selection made","Free Standing House", "Condo", "Flat", "Mansion"};
        cboType = new JComboBox(listOfTypes);
        cboAvailable = new JComboBox();
        //End 2nd VIEW
        
        //3rd VIEW
        //Panels
        ViewCustomersPanel = new JPanel();
        ViewHeading = new JPanel();
            ViewHeading.setBackground(new Color(75,124,78));
        ViewtablePanel = new JPanel();
            //ViewtablePanel.setBackground(new Color(75,200,78));
        ViewButtonPanel = new JPanel();
            //ViewButtonPanel.setBackground(new Color(75,200,255));    
            
        String[][] rec = {
         {null, null, null, null},
         {null, null, null, null},
         {null, null, null, null},
         {null, null, null, null},
        };
        String[] header = {"CustID", "Name", "Surname", "Phone Number"};
        CustViewTable = new JTable();
        
        //Labels
        lblViewCustomer = new JLabel("All Customers");
            
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
        WindowAgentPanel.setLayout(new BorderLayout());
        HeadingPanel.setLayout(new GridLayout(1,3));
        MenuPanel.setLayout(new GridLayout(5,1));
          
        HeadingPanel.add(lblPadding1);
            HeadingPanel.add(lblHeading);
            lblHeading.setFont(ft1);
            lblHeading.setHorizontalAlignment(JLabel.CENTER);
        HeadingPanel.add(lblPadding2);
        
        WelcomeagentPanel.add(lblWelcome);
            lblWelcome.setFont(ft1);
            
        MenuPanel.add(lblMenu);
            lblMenu.setFont(ft1);
            lblMenu.setHorizontalAlignment(JLabel.CENTER);
        MenuPanel.add(btnAdd);
        MenuPanel.add(btnView);
        MenuPanel.add(btnReport);
        MenuPanel.add(btnLogout);
        //End 1st VIEW
        
        //2nd view in WindowAgentPanel
        addCustomerPanel.setLayout(new BorderLayout());
        customerHeading.setLayout(new FlowLayout());
        customerDetails.setLayout(new GridLayout(9,5));
        customerButtons.setLayout(new GridLayout(1,3));
            
        customerHeading.add(lblCustomer); 
            lblCustomer.setHorizontalAlignment(JLabel.CENTER);
            lblCustomer.setFont(ft1);
        
        customerDetails.add(lblCustomerDetails);
            lblCustomerDetails.setHorizontalAlignment(JLabel.CENTER);
            lblCustomerDetails.setFont(ft2);
                customerDetails.add(lblPadding11);
                customerDetails.add(lblPadding12);
                customerDetails.add(lblPadding13);
                customerDetails.add(lblPadding14);  
                
        customerDetails.add(lblcustID);
            lblcustID.setHorizontalAlignment(JLabel.CENTER);
        customerDetails.add(txtCustID);
            txtCustID.setHorizontalAlignment(JLabel.CENTER);     
        customerDetails.add(lblName);
            lblName.setHorizontalAlignment(JLabel.CENTER);
        customerDetails.add(txtName);
            txtName.setHorizontalAlignment(JLabel.CENTER);
                customerDetails.add(lblPadding15);
                
        customerDetails.add(lblSurname);
            lblSurname.setHorizontalAlignment(JLabel.CENTER);
        customerDetails.add(txtSurname);
            txtSurname.setHorizontalAlignment(JLabel.CENTER);          
        customerDetails.add(lblMobile);
            lblMobile.setHorizontalAlignment(JLabel.CENTER);
        customerDetails.add(txtMobileNum);
            txtMobileNum.setHorizontalAlignment(JLabel.CENTER);
                customerDetails.add(lblPadding16);
                
        customerDetails.add(lblEmail);
            lblEmail.setHorizontalAlignment(JLabel.CENTER);
        customerDetails.add(txtEmail);
            txtEmail.setHorizontalAlignment(JLabel.CENTER);   
                customerDetails.add(lblPadding34);
                customerDetails.add(lblPadding35);
                customerDetails.add(lblPadding17);
                
                customerDetails.add(lblPadding20);
                customerDetails.add(lblPadding21);
                customerDetails.add(lblPadding22);
                customerDetails.add(lblPadding32);
                customerDetails.add(lblPadding33);
                
        customerDetails.add(lblHouseDetails);
            lblHouseDetails.setFont(ft2);
            lblHouseDetails.setHorizontalAlignment(JLabel.CENTER);
                customerDetails.add(lblPadding23);
                customerDetails.add(lblPadding24);
                customerDetails.add(lblPadding25);
                customerDetails.add(lblPadding26);
        customerDetails.add(cboType);
            listRenderer = new DefaultListCellRenderer();
            listRenderer.setHorizontalAlignment(DefaultListCellRenderer.CENTER); // center-aligned items
            cboType.setRenderer(listRenderer);
        customerDetails.add(lblhousenum);
            lblhousenum.setHorizontalAlignment(JLabel.CENTER);
        customerDetails.add(txtHouseNum);
            txtHouseNum.setHorizontalAlignment(JLabel.CENTER);
            txtHouseNum.setEditable(false);
        customerDetails.add(lblnumRooms);
            lblnumRooms.setHorizontalAlignment(JLabel.CENTER);
        customerDetails.add(txtRooms);
            txtRooms.setHorizontalAlignment(JLabel.CENTER);
            txtRooms.setEditable(false);
        customerDetails.add(cboAvailable);
        customerDetails.add(lblStreetName);
            lblStreetName.setHorizontalAlignment(JLabel.CENTER);
        customerDetails.add(txtStreetName);
            txtStreetName.setHorizontalAlignment(JLabel.CENTER);
            txtStreetName.setEditable(false);
        customerDetails.add(lblRentPrice);
            lblRentPrice.setHorizontalAlignment(JLabel.CENTER);
        customerDetails.add(txtRentPrice);
            txtRentPrice.setHorizontalAlignment(JLabel.CENTER);
            txtRentPrice.setEditable(false);
            
            customerDetails.add(lblPadding27);
            customerDetails.add(lblPadding28);
            customerDetails.add(lblPadding29);
            customerDetails.add(lblPadding30);
            customerDetails.add(lblPadding31);
            
        customerButtons.add(btnBack);
            btnBack.setFont(ft3);
        customerButtons.add(btnSave);
            btnSave.setFont(ft3);
        //end 2nd VIEW
        
        //3rd View
        ViewCustomersPanel.setLayout(new BorderLayout());
        ViewHeading.setLayout(new FlowLayout());
        ViewtablePanel.setLayout(new FlowLayout());
        ViewButtonPanel.setLayout(new GridLayout(1,2));
        
        ViewHeading.add(lblViewCustomer);
            lblViewCustomer.setHorizontalAlignment(JLabel.CENTER);
            lblViewCustomer.setFont(ft1);
        
        //CustViewTable(header);
        ViewtablePanel.add(CustViewTable);
        
        //1st Window    
        WindowAgentPanel.add(HeadingPanel, BorderLayout.NORTH);
        WindowAgentPanel.add(MenuPanel, BorderLayout.WEST);
        WindowAgentPanel.add(WelcomeagentPanel, BorderLayout.CENTER);
        
        //2nd Window
        addCustomerPanel.add(customerHeading, BorderLayout.NORTH);
        addCustomerPanel.add(customerDetails, BorderLayout.CENTER);
        addCustomerPanel.add(customerButtons, BorderLayout.SOUTH);
        
        //3rd Window
        ViewCustomersPanel.add(ViewHeading, BorderLayout.NORTH);
        ViewCustomersPanel.add(ViewtablePanel, BorderLayout.CENTER);
        ViewCustomersPanel.add(ViewButtonPanel, BorderLayout.SOUTH);
        
        
        btnLogout.addActionListener(this);
        btnBack.addActionListener(this);
        btnAdd.addActionListener(this);
        btnView.addActionListener(this);
        
        btnSave.addActionListener(this);
        
        cboType.addItemListener(this);
        cboAvailable.addItemListener(this);
                
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
    
    
    public void fillID_CBO(){
        //get Type cbo
        String type = (String)cboType.getSelectedItem();
        
        List<String> houseID_list = new ArrayList<>();

        houseID_list = client.populateID_CBO(type);
        
        for(int i = 0; i < houseID_list.size(); i++) {
            String houseid_list = houseID_list.get(i);
            cboAvailable.addItem(houseid_list);
        }
        
    }
    
    public void fillFields_houses(){
        String available = (String)cboAvailable.getSelectedItem();
        
        List<String> houseAvailable_list = new ArrayList<>();
        
        houseAvailable_list = client.populateFields(available);  
        System.out.println("\nTHIS IS THE OUTPUT from DATABASE>> " + available + "\n");
        for(int i = 0; i < houseAvailable_list.size(); i++) {
            String available_houseList = houseAvailable_list.get(0);
            txtHouseNum.setText(available_houseList); 
        }
        for(int i = 0; i < houseAvailable_list.size(); i++) {
            String available_houseList = houseAvailable_list.get(1);
            txtStreetName.setText(available_houseList); 
        }
        for(int i = 0; i < houseAvailable_list.size(); i++) {
            String available_houseList = houseAvailable_list.get(2);
            txtRooms.setText(available_houseList); 
        }
        for(int i = 0; i < houseAvailable_list.size(); i++) {
            String available_houseList = houseAvailable_list.get(3);
            txtRentPrice.setText(available_houseList); 
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Add New Customer")) {
            WelcomeagentPanel.setVisible(false);
            ViewCustomersPanel.setVisible(false);
            WindowAgentPanel.add(addCustomerPanel, BorderLayout.CENTER);
            addCustomerPanel.setVisible(true);

            //fill combobox
            cboType.setSelectedIndex(0);
             
            
        }
        else if(e.getActionCommand().equals("Back")) {
            addCustomerPanel.setVisible(false);
            WindowAgentPanel.add(WelcomeagentPanel, BorderLayout.CENTER);
            WelcomeagentPanel.setVisible(true);
        }
        else if(e.getActionCommand().equals("View All Customers")) {
            WelcomeagentPanel.setVisible(false);
            addCustomerPanel.setVisible(false);
            WindowAgentPanel.add(ViewCustomersPanel, BorderLayout.CENTER);
            ViewCustomersPanel.setVisible(true);
        }
        else if(e.getActionCommand().equals("LOG OUT")) {
            client.logOUT();
            new loginGUI().SetGUI();
            this.setVisible(false);
        }
        //Inside Customer panel
        else if(e.getActionCommand().equals("SAVE")) {
            
            int custID = Integer.valueOf(txtCustID.getText());
            String name = txtName.getText();
            String surname = txtSurname.getText();
            int mobileNum = Integer.valueOf(txtMobileNum.getText());
            String emailAddress = txtEmail.getText();
            
            int house_id = (int)cboAvailable.getSelectedItem();
            int customer_id = Integer.valueOf(txtCustID.getText());
            int rent_price = Integer.valueOf(txtRentPrice.getText());
            
            
            //customer customer = new customer(159, "Manny", "Barnes", 123, "Manny@gmail.com");
            customer customer = new customer(custID, name, surname, mobileNum, emailAddress);
            rentTransaction rentTrans = new rentTransaction(0, customer_id, house_id, rent_price, 0);
            
            boolean customerSuccess = client.addCustomer(customer);
            boolean transactionSuccess = client.addTransaction(rentTrans);
                System.out.println("Client returns " + transactionSuccess);
                System.out.println("Client returns " + customerSuccess);
            if(customerSuccess && transactionSuccess) {
                JOptionPane.showMessageDialog(this, "Customer has been successfully added!");
            }
            else {
                JOptionPane.showMessageDialog(this, "Customer could not be added due to technical issues");
            }
        }
            
    }  

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource().equals(cboType)){
           if(e.getStateChange() == ItemEvent.SELECTED) {
            cboAvailable.removeAllItems();
            fillID_CBO();
            } 
        }
        else if(e.getSource().equals(cboAvailable)){
            if(e.getStateChange() == ItemEvent.SELECTED){
                fillFields_houses();
            }  
        } 
    }
}   
