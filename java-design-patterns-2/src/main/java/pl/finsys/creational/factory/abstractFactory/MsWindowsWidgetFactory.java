package pl.finsys.creational.factory.abstractFactory;

/**
 * Created with IntelliJ IDEA.
 * User: jaroslaw.krochmalski
 * Date: 02.05.13
 * Time: 12:18
 */
//ConcreteFactory1
public class MsWindowsWidgetFactory implements AbstractWidgetFactory {
    //create an MSWindow
    public Window createWindow() {
        MSWindow window = new MSWindow();
        return window;
    }
}