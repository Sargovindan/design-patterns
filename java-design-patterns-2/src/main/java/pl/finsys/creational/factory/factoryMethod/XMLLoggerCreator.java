package pl.finsys.creational.factory.factoryMethod;

/**
 * Created with IntelliJ IDEA.
 * User: jaroslaw.krochmalski
 * Date: 02.05.13
 * Time: 12:10
 */
//ConcreteCreator
public class XMLLoggerCreator extends AbstractLoggerCreator {

    @Override
    public Logger createLogger() {
        XMLLogger logger = new XMLLogger();
        return logger;
    }

}