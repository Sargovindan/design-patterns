package pl.finsys.creational.factory.abstractFactory;

/**
 * Created with IntelliJ IDEA.
 * User: jaroslaw.krochmalski
 * Date: 02.05.13
 * Time: 12:18
 */
//ConcreteProductA2
public class MacOSXWindow implements Window {
    @Override
    public void setTitle(String text) {
        //Mac OSX specific behaviour
    }

    public void repaint() {
        //Mac OSX specific behaviour
    }
}