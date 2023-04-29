package view;

import chatObeserverImpl.ChatObserverImpl;
import connector.ServerConnector;
import controller.ChatController;
import controller.ChatObserver;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ChatWindowController {
    public TextArea txtmsg;
    public Button btnSend;
    public ChatObserver chatObserver;
    public TextArea textArea;

    public void Initialize(){
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
            chatcontroller.sendMessage(txtmsg.getText());
            txtmsg.clear();
        } catch (NotBoundException e) {
            throw new RuntimeException(e);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void setMessage(String msg) {
        textArea.setText(msg+"\n");
    }
}
