package projecttwo_joannebentulan;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author JOANNE BENTULAN
 */
public class DataInputException {

    //private final String EMPTY_STRING = "";
    public Boolean isPresent(JTextField tField) throws Exception {
        if (tField.getText().toString().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Cannot be empty");
            return false;
        }
        return true;
    }

    public Boolean isString(JTextField tField) throws Exception {
        String text = tField.getText();
        //"[a-zA-Z]+"
        if (text.matches("^[\\p{L} .'-]+$")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Only string/letters");
            return false;
        }

    }

}
