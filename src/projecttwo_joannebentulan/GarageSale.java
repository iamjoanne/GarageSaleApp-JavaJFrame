package projecttwo_joannebentulan;

/**
 *
 * @author JOANNE BENTULAN
 */
public class GarageSale {
    String item, location;

    public GarageSale(){}
    public GarageSale(String item, String location) {
        this.item = item;
        this.location = location;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    @Override
    public String toString(){
        return (item + location + "\n");
    }
}
