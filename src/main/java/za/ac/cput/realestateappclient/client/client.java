/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.realestateappclient.client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;

import za.ac.cput.realestateapp.domain.customer;
import za.ac.cput.realestateapp.domain.agent;
import za.ac.cput.realestateapp.domain.house;
import za.ac.cput.realestateapp.domain.rentTransaction;

/**
 *
 * @author smann
 */
public class client {
    private Socket server;
    
    private ObjectInputStream in;
    private ObjectOutputStream out;
    
    /** Creates a new instance of ClientApp */
    public client()
    {
        // Attempt to establish connection to server
        try
        {
            // Create socket
            server = new Socket("127.0.0.1", 4000);
            
            out = new ObjectOutputStream(server.getOutputStream());
                out.flush();
            
            in = new ObjectInputStream(server.getInputStream());
        }
        catch (IOException ioe)
        {
            System.out.println("IOException: " + ioe.getMessage());
        }
    }
    
    public void logOUT() {
        try{
            out.writeObject("terminate");
                out.flush();    
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
    
    public boolean addCustomer(customer customer){
        try {
            out.writeObject("addCustomer");
                out.flush();
            out.writeObject(customer);
                out.flush();
            
                //System.out.println(in.readBoolean());
            return in.readBoolean();
            
        }
        catch (IOException ioe)
        {
            System.out.println("IO Exception: " + ioe.getMessage());
            return true;
        }
    }
    
    public boolean addHouse(house house){
        try {
            out.writeObject("addHouse");
                out.flush();
            out.writeObject(house);
                out.flush();
            
            return in.readBoolean();
        }
        catch (IOException ioe)
        {
            System.out.println("IO Exception: " + ioe.getMessage());
            return true;
        }
    }
    
    public boolean addAgent(agent agent) {
         try {
            out.writeObject("addAgent");
                out.flush();
            out.writeObject(agent);
                out.flush();
            
            return in.readBoolean();
        }
        catch (IOException ioe)
        {
            System.out.println("IO Exception: " + ioe.getMessage());
            return true;
        }
    }
    
    public boolean addTransaction(rentTransaction transaction) {
         try {
            out.writeObject("recordTransaction");
                out.flush();
            out.writeObject(transaction);
                out.flush();
            
            return in.readBoolean();
        }
        catch (IOException ioe)
        {
            System.out.println("IO Exception: " + ioe.getMessage());
            return true;
        }
    }
    
    public List<String> populateID_CBO(String type){
        try{
            List<String> house_id = null;
            out.writeObject("getAll_id");
                out.flush();
            out.writeObject(type);
                out.flush();
            //response = (String)in.readObject();
            house_id = (List<String>)in.readObject();
                System.out.println("CLIENT>> " + house_id);
            return house_id;
        }
        catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public List<String> populateFields(String available){
        try{
            List<String> house_fields = null;
            out.writeObject("getAll_houseInfo");
                out.flush();
            out.writeObject(available);
                out.flush();
            //response = (String)in.readObject();
            house_fields = (List<String>)in.readObject();
                System.out.println("CLIENT>> " + house_fields);
            return house_fields;
        }
        catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
    //EDITING PANEL
    public List<String> populateEditHouseID_CBO() {
        try{
            List<String> house_id = null;
            out.writeObject("getHouseID");
            out.flush();
            house_id = (List<String>)in.readObject();
                System.out.println("CLIENT>> " + house_id);
            return house_id;
        }
        catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
    public List<String> populateEditAgentID_CBO() {
        try{
            List<String> agent_id = null;
            out.writeObject("getAgentID");
            out.flush();
            agent_id = (List<String>)in.readObject();
                System.out.println("CLIENT>> " + agent_id);
            return agent_id;
        }
        catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public List<String> populateEditHouseFields(String rental){
        try{
            List<String> house_fields = null;
            out.writeObject("getAll_EDIThouseInfo");
                out.flush();
            out.writeObject(rental);
                out.flush();
            house_fields = (List<String>)in.readObject();
                System.out.println("CLIENT>> " + house_fields);
            return house_fields;
        }
        catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public List<String> populateEditAgentFields(String agent_id){
        try{
            List<String> house_fields = null;
            out.writeObject("getAll_EDITagentInfo");
                out.flush();
            out.writeObject(agent_id);
                out.flush();
            house_fields = (List<String>)in.readObject();
                System.out.println("CLIENT>> " + house_fields);
            return house_fields;
        }
        catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    
    
    public static void main(String[] args)
    {
        new client();
    }
}
