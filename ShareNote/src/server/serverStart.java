package server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class serverStart {
    public static void main(String[] args) {
        try {
            Registry noteRegistry= LocateRegistry.createRegistry(5050);
            noteRegistry.rebind("Noteserver",new NoteControllerImpl());
            System.out.println("Server Start...");
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
