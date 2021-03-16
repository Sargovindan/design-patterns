package pl.finsys.behavioral.mediator;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: jaroslaw.krochmalski
 * Date: 02.05.13
 * Time: 11:52
 */


public class ChatMediator implements Mediator {
    private ArrayList<ChatPeer> chatPeers;

    public ChatMediator() {
        chatPeers = new ArrayList<>();
    }

    public void addColleague(ChatPeer chatPeer) {
        chatPeers.add(chatPeer);
    }

    public void send(String message, ChatPeer originator) {
        //let all other screens know that this screen has changed
        for (ChatPeer chatPeer : chatPeers) {
            //don't tell ourselves
            if (chatPeer != originator) {
                chatPeer.receive(message);
            }
        }

    }

}