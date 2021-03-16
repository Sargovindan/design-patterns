package pl.finsys.behavioral.mediator;

/**
 * Created with IntelliJ IDEA.
 * User: jaroslaw.krochmalski
 * Date: 02.05.13
 * Time: 11:54
 */
public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediator();

        ConcreteChatPeer desktop = new ConcreteChatPeer(mediator);
        ConcreteChatPeer mobile = new MobileChatPeer(mediator);

        mediator.addColleague(desktop);
        mediator.addColleague(mobile);

        desktop.send("Hello World");
        mobile.send("Hello");

    }
}