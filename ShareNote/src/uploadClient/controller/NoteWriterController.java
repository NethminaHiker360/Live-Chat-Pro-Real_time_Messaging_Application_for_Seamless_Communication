package uploadClient.controller;

import common.NoteController;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class NoteWriterController {
    public TextArea textArea;
    public Button btn;

    public void btnOnAction(ActionEvent actionEvent) {
        try {
            NoteController serverConnector= (NoteController) Naming.lookup("rmi://localhost:5050/Noteserver");
            serverConnector.setNote(textArea.getText());
            textArea.clear();
        } catch (NotBoundException e) {
            throw new RuntimeException(e);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
