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

/**
 * Client Connection to Server
 * @author Manasseh Barnes
 */
public class Client {
    private Socket server;
    
    /** Creates a new instance of ClientApp */
    public Client()
    {
        // Attempt to establish connection to server
        try
        {
            // Create socket
            server = new Socket("127.0.0.1", 12345);
        }
        catch (IOException ioe)
        {
            System.out.println("IOException: " + ioe.getMessage());
        }
    }
    
    public void communicate()
    {
        // The connection has been established - now send/receive.
        
        try
        {        
            // Step 1: create channels
            ObjectOutputStream out = new ObjectOutputStream(server.getOutputStream());
            out.flush();
            ObjectInputStream in = new ObjectInputStream(server.getInputStream());
            
            // Step 2: communicate
            out.writeObject("Radford");
            out.flush();
            String response = (String)in.readObject();
            System.out.println("From SERVER>> " + response);
            
            // Step 3: close down
            out.close();
            in.close();
            server.close();        
        }
        catch (IOException ioe)
        {
            System.out.println("IO Exception: " + ioe.getMessage());
        }
        catch (ClassNotFoundException cnfe)
        {
            System.out.println("Class not found: " + cnfe.getMessage());
        }
    }
    
    public static void main(String[] args)
    {
        Client client = new Client();
        client.communicate();
    }
}
