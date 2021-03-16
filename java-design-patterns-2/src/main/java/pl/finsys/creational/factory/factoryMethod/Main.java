package pl.finsys.creational.factory.factoryMethod;

/**
 * Created with IntelliJ IDEA.
 * User: jaroslaw.krochmalski
 * Date: 02.05.13
 * Time: 12:10
 */
public class Main {
    private void someMethodThatLogs(AbstractLoggerCreator logCreator) {
        Logger logger = logCreator.createLogger();
        logger.log("message");

    }


    public static void main(String[] args) {
        //for the purposes of this example, create an XMLLoggerCreator directly,
        //but this would normally be passed to constructor for use.
        AbstractLoggerCreator creator = new XMLLoggerCreator();

        Main main = new Main();
        main.someMethodThatLogs(creator);
    }

}
