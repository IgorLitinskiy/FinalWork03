package ToyStore;

import java.util.List;

class Random {
    public ToyItem chooseOnWeight(List<ToyItem> toys) {
        double completeWeight = 0.0;
        for (ToyItem toy : toys)
            completeWeight += toy.getWeight();
        double r = Math.random() * completeWeight;
        double countWeight = 0.0;
        for (ToyItem toy : toys) {
            countWeight += toy.getWeight();
            if (countWeight >= r)
                return toy;
        }
        throw new RuntimeException();
    }
}
