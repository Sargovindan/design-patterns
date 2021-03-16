package pl.finsys.behavioral.mediator;

/**
 * Created with IntelliJ IDEA.
 * User: jaroslaw.krochmalski
 * Date: 02.05.13
 * Time: 11:52
 */

//Colleage interface
public abstract class ChatPeer {
    private Mediator mediator;

    public ChatPeer(Mediator m) {
        mediator = m;
    }

    //send a message via the mediator
    public void send(String message) {
        mediator.send(message, this);
    }

    //get access to the mediator
    public Mediator getMediator() {
        return mediator;
    }

    public abstract void receive(String message);

}
