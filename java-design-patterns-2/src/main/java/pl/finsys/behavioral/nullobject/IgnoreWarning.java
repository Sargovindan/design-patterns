package pl.finsys.behavioral.nullobject;

/**
 * Based on: "Patterns in Java", Mark Grand.
 * <p/>
 * Date: Aug 8, 2011
 *
 * @author moleksyuk
 */
public class IgnoreWarning implements IWarningRouter {

    @Override
    public boolean routeWarning(String message) {
        return true;
    }

}
