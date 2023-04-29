package controllerImpl;

import controller.chatController;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ChatControllerImpl extends UnicastRemoteObject implements chatController {
    public ChatControllerImpl() throws RemoteException{

    }
    @Override
    public void sendMessage(String message) throws RemoteException {

    }
}
