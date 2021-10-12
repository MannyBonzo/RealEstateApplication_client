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
    
    public List<String> populateCBO(){
        try{
            List<String> locations = null;
            out.writeObject("getAllLocationCBO");
                out.flush();
            //response = (String)in.readObject();
            locations = (List<String>)in.readObject();
                System.out.println("CLIENT>> " + locations);
            return locations;
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
