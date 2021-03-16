package pl.finsys.behavioral.mediator;

/**
 * Created with IntelliJ IDEA.
 * User: jaroslaw.krochmalski
 * Date: 02.05.13
 * Time: 11:53
 */

public class MobileChatPeer extends ConcreteChatPeer {
    public MobileChatPeer(Mediator m) {
        super(m);
    }

    public void receive(String message) {
        System.out.println("Mobile Received: " + message);
    }

}