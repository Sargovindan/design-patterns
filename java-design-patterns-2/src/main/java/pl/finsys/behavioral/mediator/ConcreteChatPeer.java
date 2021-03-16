package pl.finsys.behavioral.mediator;

/**
 * Created with IntelliJ IDEA.
 * User: jaroslaw.krochmalski
 * Date: 02.05.13
 * Time: 11:53
 */

public class ConcreteChatPeer extends ChatPeer {
    public ConcreteChatPeer(Mediator m) {
        super(m);
    }

    public void receive(String message) {
        System.out.println("Colleague Received: " + message);
    }

}