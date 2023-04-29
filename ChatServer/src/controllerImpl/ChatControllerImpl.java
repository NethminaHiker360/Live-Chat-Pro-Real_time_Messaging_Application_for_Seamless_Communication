package controllerImpl;

import controller.chatController;
import controller.chatObserver;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class ChatControllerImpl extends UnicastRemoteObject implements chatController {

    private ArrayList<chatObserver> list=new ArrayList<>();
    public ChatControllerImpl() throws RemoteException{

    }
    @Override
    public void sendMessage(String message) throws RemoteException {
        for (chatObserver chatObserver:list) {
            chatObserver.update(message);
        }
    }

    @Override
    public void addChatObserver(chatObserver chatObserver) throws RemoteException {
        list.add(chatObserver);
    }

    @Override
    public void removeChatObserver(chatObserver chatObserver) throws RemoteException {
        list.remove(chatObserver);
    }
}
