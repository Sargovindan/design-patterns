package pl.finsys.creational.factory.factoryMethod;

/**
 * Created with IntelliJ IDEA.
 * User: jaroslaw.krochmalski
 * Date: 02.05.13
 * Time: 12:09
 */
//concrete implementation of the Logger (Product)
public class XMLLogger implements Logger {

    public void log(String message) {
        //log to xml
        System.err.println("logging");
    }

}

