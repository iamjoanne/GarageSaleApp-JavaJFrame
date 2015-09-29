package projecttwo_joannebentulan;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JOANNE BENTULAN
 */
public class GarageSaleImp extends DataManager implements IGarageSale{

    String fileLocation = "G:\\2014FALL COSC 1437 Java 2\\Projects\\ProjectTwo_JoanneBentulan\\GarageSale.txt";
    
    @Override
    public void write(String fileName, ArrayList<GarageSale> al) throws FileNotFoundException, IOException{
        //File file = new File("G:\\2014FALL COSC 1437 Java 2\\Projects\\ProjectTwo_JoanneBentulan\\GarageSale.txt");
        super.read(fileLocation);
//        File file = new File(fileName);        
        fileName = fileLocation.toString();

        FileWriter writer = new FileWriter(fileName);        
        
        for(Object o : al){
            writer.write(o.toString());
        }
        
        writer.close();
    }

    @Override
    public String searchByItem(String search) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String displayAll(File fileName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String addItemAndLoc(String item, String location) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String deleteItem(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
