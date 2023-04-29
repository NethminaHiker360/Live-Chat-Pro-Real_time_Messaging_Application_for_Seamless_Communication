package controller;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface chatController extends Remote {
    public void sendMessage(String message)throws RemoteException;
}
