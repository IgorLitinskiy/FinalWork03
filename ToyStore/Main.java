package ToyStore;


import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        ToyItem toy1 = new ToyItem(0, "Кукла Barbie    ", 32,22);
        ToyItem toy2 = new ToyItem(1, "Hot Wheels      ", 40,35);
        ToyItem toy3 = new ToyItem(2, "Футбольный мяч  ", 50,66);
        ToyItem toy4 = new ToyItem(3, "Конструктор лего", 33,23);
        ToyItem toy5 = new ToyItem(4, "Велосипед       ", 42,74);

        List<ToyItem> toys = new ArrayList<ToyItem>();
        toys.add(toy5);
        toys.add(toy4);
        toys.add(toy3);
        toys.add(toy2);
        toys.add(toy1);

        ToyStore toyStore = new ToyStore(toys);
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();

    }  
}
