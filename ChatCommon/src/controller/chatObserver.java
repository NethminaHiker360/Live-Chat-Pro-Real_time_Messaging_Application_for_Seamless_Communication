package controller;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface chatObserver extends Remote {
    public void update(String msg) throws RemoteException;
}
