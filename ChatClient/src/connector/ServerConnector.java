package connector;

import controller.ChatController;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ServerConnector {
    private ChatController chatController;
    private static ServerConnector serverConnector;
    private ServerConnector() throws NotBoundException, MalformedURLException, RemoteException {
        chatController=(ChatController) Naming.lookup("rmi://localhost:5050/ChatServer");
    }
    public static ServerConnector getServerConnector() throws NotBoundException, MalformedURLException, RemoteException{
        if(serverConnector==null){
            serverConnector=new ServerConnector();
        }
        return  serverConnector;
    }
    public ChatController getChatController(){
        return chatController;
    }
}
