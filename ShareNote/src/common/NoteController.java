package common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface NoteController extends Remote {
    public void setNote(String note) throws RemoteException;
    public String getNote() throws RemoteException;
}
