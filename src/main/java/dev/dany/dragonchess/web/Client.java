package dev.dany.dragonchess.web;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;

public class Client implements Serializable
{
    //Server
    private int port;
    private Socket socket;
    private ObjectOutputStream oos;
    private ObjectInputStream ois;
    private boolean connected;
    
    public Client(String ip, int port)
    {
        try
        {
            this.port = port;
            this.socket = new Socket(ip, port);
            this.connected = true;
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public void send(Object o)
    {
        try
        {
            oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(o);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public Object receive()
    {   
        try
        {
            ois = new ObjectInputStream(socket.getInputStream());
            Object incoming = ois.readObject();
            return incoming;
        }
        catch(IOException | ClassNotFoundException e)
        {
            e.printStackTrace();
            return null;
        }
    }
    
    public void close()
    {
        try
        {
            this.socket.close();
            this.connected = false;
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public int getPort()
    {
        return this.port;
    }
    
    public boolean isConnected()
    {
        return this.connected;
    }
}
