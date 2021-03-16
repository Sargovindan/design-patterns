package pl.finsys.behavioral.nullobject;

import javax.swing.*;

/**
 * Based on: "Patterns in Java", Mark Grand.
 * <p/>
 * Date: Aug 8, 2011
 *
 * @author moleksyuk
 */
public class WarningDialog implements IWarningRouter {

    @Override
    public boolean routeWarning(String message) {
        int result = JOptionPane.showConfirmDialog(null, message, "Warning",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        return result == 0;
    }

}
