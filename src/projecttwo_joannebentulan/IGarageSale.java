package projecttwo_joannebentulan;

import java.io.File;

/**
 *
 * @author JOANNE BENTULAN
 */
public interface IGarageSale {
    String searchByItem(String search);
    String displayAll(File fileName);
    String addItemAndLoc(String item, String location);
    String deleteItem(String name);
}
