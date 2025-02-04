package dev.dany.dragonchess.web;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
    //Server
    private int port;
    private ServerSocket serverSocket;
    private Socket[] sockets;
    private ObjectOutputStream oos;
    private ObjectInputStream ois;
    
    public Server(int port, int nClients)
    {
        try
        {
            this.port = port;
            this.serverSocket = new ServerSocket(port);
            this.sockets = new Socket[nClients];
            for(int i = 0; i < nClients; i++)
            {
                sockets[i] = serverSocket.accept();
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public void send(Object o, int client)
    {
        try
        {
            oos = new ObjectOutputStream(sockets[client].getOutputStream());
            oos.writeObject(o);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public Object receive(int client)
    {   
        try
        {
            ois = new ObjectInputStream(sockets[client].getInputStream());
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
            for(int i = 0; i < sockets.length; i++)
            {
                this.sockets[i].close();
            }
            this.serverSocket.close();
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
}
