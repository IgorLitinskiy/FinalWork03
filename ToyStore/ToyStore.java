package ToyStore;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class ToyStore {
    private List<ToyItem> toys;

    public ToyStore(List<ToyItem> toys) {
        this.toys = toys;
    }
    
    public ToyItem getToyForPrice() {
        Random random = new Random();
        ToyItem toy = random.chooseOnWeight(toys);
        return toy;
    }

    public void saveToyForLottery() {
        ToyItem toy = getToyForPrice();
        String text = toy.toString();
        try(FileWriter writer = new FileWriter("ToyStore/list.txt", true))
        { 
            writer.write(text);
            writer.append('\n');
            writer.flush();
        }
        catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        toys.remove(toy);
    }
}
