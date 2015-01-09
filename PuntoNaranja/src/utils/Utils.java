/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import org.w3c.dom.Document;

/**
 *
 * @author rlobo
 */
public class Utils {
    String host = "localhost";
    int port = 6789;
    private ObjectOutputStream outputStream = null;
    private ObjectInputStream inputStream = null;
    Socket socket = null;
    
    public Utils(String _host, int _port) throws Exception{
        host = _host;
        port = _port;
        socket = new Socket(host, port);
    }
    
    public Utils() throws Exception{
        socket = new Socket(host, port);
    }
    
    public Document SendToServer(Document doc) throws Exception{
        //create output stream attached to socket
        Document docu;
        outputStream = new ObjectOutputStream(socket.getOutputStream());
        outputStream.writeObject(doc);
        //send msg to server
        socket.shutdownOutput();
        while(true){
            if(socket.getInputStream() != null){
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                docu = (Document) ois.readObject();
                break;
            }
        }
        return docu;
    }
    
    public Document RecieveFromServer() throws Exception{
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
        Document doc = (Document) ois.readObject();
        return doc;
    }
    
    public void open() throws IOException{
        socket.close();
    }
    
    public void close() throws IOException{
        socket.close();
    }
}
