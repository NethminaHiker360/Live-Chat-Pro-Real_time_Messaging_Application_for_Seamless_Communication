package server;

import common.NoteController;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class NoteControllerImpl extends UnicastRemoteObject implements NoteController {
    private String note="Empty";
    protected NoteControllerImpl() throws RemoteException {
    }

    @Override
    public void setNote(String note) throws RemoteException {
        this.note=note;
    }

    @Override
    public String getNote() throws RemoteException {
        return note;
    }
}
