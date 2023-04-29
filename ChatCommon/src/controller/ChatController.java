package controller;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ChatController extends Remote {
    public void sendMessage(String message)throws RemoteException;
    public void addChatObserver(ChatObserver chatObserver) throws RemoteException;
    public void removeChatObserver(ChatObserver chatObserver) throws RemoteException;
}
