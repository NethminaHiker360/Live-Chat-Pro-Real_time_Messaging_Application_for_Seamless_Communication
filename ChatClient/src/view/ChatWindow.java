package view;

import chatObeserverImpl.ChatObserverImpl;
import connector.ServerConnector;
import controller.ChatController;
import controller.ChatObserver;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ChatWindow {
    public TextArea txtmsg;
    public Button btnSend;
    public ChatObserver chatObserver;
    public TextArea textArea;
    public TextField txtfield;
    public TextField txtname;
    public Button btnexit;
    public Button btnClear;

    public void initialize(){
        try {
            chatObserver=new ChatObserverImpl(this);
            ChatController chatController = ServerConnector.getServerConnector().getChatController();
            chatController.addChatObserver(chatObserver);
        } catch (NotBoundException e) {
            throw new RuntimeException(e);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void btnSendOnAction(ActionEvent actionEvent) {
        try {
            ChatController chatcontroller=ServerConnector.getServerConnector().getChatController();
            chatcontroller.sendMessage(txtname.getText()+" : "+txtfield.getText());
            txtfield.clear();
        } catch (NotBoundException e) {
            throw new RuntimeException(e);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void setMessage(String msg) {
        textArea.appendText(msg+"\n");
    }

    public void enterOnAction(ActionEvent actionEvent) {
        btnSendOnAction(actionEvent);
    }

    public void exitbtnOnAction(ActionEvent actionEvent) {
    }

    public void btnclearOnAction(ActionEvent actionEvent) {
    }
}
