package controller;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class chatControllerImpl extends UnicastRemoteObject implements ChatController{
    private ArrayList<ChatObserver> chatObserverList=new ArrayList<>();
    protected chatControllerImpl() throws RemoteException {
    }

    @Override
    public void sendMessage(String msg) throws RemoteException {

    }

    @Override
    public void addChatObserever(ChatObserver chatObserver) throws RemoteException {
        chatObserverList.add(chatObserver);
    }

    @Override
    public void removeChatObserever(ChatObserver chatObserver) throws RemoteException {
        chatObserverList.remove(chatObserver);
    }
}
