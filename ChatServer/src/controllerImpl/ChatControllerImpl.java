package controllerImpl;

import controller.ChatController;
import controller.ChatObserver;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class ChatControllerImpl extends UnicastRemoteObject implements ChatController {

    private ArrayList<ChatObserver> list=new ArrayList<>();
    public ChatControllerImpl() throws RemoteException{

    }
    @Override
    public void sendMessage(String message) throws RemoteException {
        for (ChatObserver chatObserver:list) {
            chatObserver.update(message);
        }
    }

    @Override
    public void addChatObserver(ChatObserver chatObserver) throws RemoteException {
        list.add(chatObserver);
    }

    @Override
    public void removeChatObserver(ChatObserver chatObserver) throws RemoteException {
        list.remove(chatObserver);
    }
}
