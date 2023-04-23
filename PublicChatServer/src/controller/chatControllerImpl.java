package controller;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class chatControllerImpl extends UnicastRemoteObject implements ChatController{
    protected chatControllerImpl() throws RemoteException {
    }

    @Override
    public void sendMessage(String msg) throws RemoteException {

    }
}
