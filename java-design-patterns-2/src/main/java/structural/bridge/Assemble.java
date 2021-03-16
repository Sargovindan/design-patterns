package structural.bridge;

/**
 * Created with IntelliJ IDEA.
 * User: jaroslaw.krochmalski
 * Date: 21.05.13
 * Time: 09:46
 */
public class Assemble implements Workshop {

    @Override
    public void work() {
        System.out.println(" Assembled.");
    }

}
