package pl.finsys.creational.factory.abstractFactory;

/**
 * Created with IntelliJ IDEA.
 * User: jaroslaw.krochmalski
 * Date: 02.05.13
 * Time: 12:19
 */

public class Main {
    public static void main(String[] args) {
        GUIBuilder builder = new GUIBuilder();
        AbstractWidgetFactory widgetFactory;

        //check what platform we're on
        if (currentPlatform() == "MACOSX") {
            widgetFactory = new MacOSXWidgetFactory();
        } else {
            widgetFactory = new MsWindowsWidgetFactory();
        }
        builder.buildWindow(widgetFactory);
    }

    private static String currentPlatform() {
        return "MACOSX";
    }
}