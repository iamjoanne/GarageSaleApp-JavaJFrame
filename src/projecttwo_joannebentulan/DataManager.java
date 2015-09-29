package projecttwo_joannebentulan;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author JOANNE BENTULAN
 */
public abstract class DataManager {

    public abstract void write(String fileName, ArrayList<GarageSale> al) throws FileNotFoundException, IOException;

    public void read(String fileLocation) {
        //fileLocation = "Desktop\\GarageSale.txt";
        File file = new File(fileLocation);
        try (Scanner sc = new Scanner(fileLocation)) {
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] details = line.split(",");
                String item = details[0];
                String location = details[1];
                //String itemAndLoc = item.toString()+location.toString();                
            }
        }
    }
}
