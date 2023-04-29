package chatObeserverImpl;

import controller.ChatObserver;
import view.ChatWindow;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ChatObserverImpl extends UnicastRemoteObject implements ChatObserver {
    private ChatWindow chatWindow;
    public ChatObserverImpl(ChatWindow chatWindow)throws RemoteException{
        this.chatWindow=chatWindow;
    }
    @Override
    public void update(String msg) throws RemoteException {
        chatWindow.setMessage(msg);
    }
}
