package pl.finsys.creational.factory.abstractFactory;

/**
 * Created with IntelliJ IDEA.
 * User: jaroslaw.krochmalski
 * Date: 02.05.13
 * Time: 12:17
 */
//ConcreteProductA1
public class MSWindow implements Window {

    @Override
    public void setTitle(String text) {
        //MS Windows specific behaviour
    }

    public void repaint() {
        //MS Windows specific behaviour
    }
}