package controller;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ChatController  extends Remote {
    public void sendMessage(String msg) throws RemoteException;

}
