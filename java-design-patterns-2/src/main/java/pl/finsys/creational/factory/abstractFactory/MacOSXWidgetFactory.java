package pl.finsys.creational.factory.abstractFactory;

/**
 * Created with IntelliJ IDEA.
 * User: jaroslaw.krochmalski
 * Date: 02.05.13
 * Time: 12:19
 */
//ConcreteFactory2
public class MacOSXWidgetFactory implements AbstractWidgetFactory {
    //create a MacOSXWindow
    public Window createWindow() {
        MacOSXWindow window = new MacOSXWindow();
        return window;
    }
}