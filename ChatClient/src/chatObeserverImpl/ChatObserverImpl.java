package chatObeserverImpl;

import controller.ChatObserver;
import view.ChatWindowController;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ChatObserverImpl extends UnicastRemoteObject implements ChatObserver {
    private ChatWindowController chatWindow;
    public ChatObserverImpl(ChatWindowController chatWindow)throws RemoteException{
        this.chatWindow=chatWindow;
    }
    @Override
    public void update(String msg) throws RemoteException {
        chatWindow.setMessage(msg);
    }
}
