package main;

import controllerImpl.ChatControllerImpl;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class serverStart {
    public static void main(String[] args) {
        try {
            Registry chatRegistry= LocateRegistry.createRegistry(5050);
            chatRegistry.rebind("ChatServer",new ChatControllerImpl());
            System.out.println("Server Start...");
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
