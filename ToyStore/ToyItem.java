package ToyStore;



public class ToyItem{
    public static final int MAX_WEIGHT = 100;
    public static final int MIN_WEIGHT = 0;
    private Integer id;
    private String name;
    private int weight;
    private int quantity;
    public ToyItem(Integer id, String name, int weight, int quantity){
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.quantity = quantity;
    }
    public ToyItem(ToyItem other){
        this(other.id, other.name, other.weight, other.quantity);
    }
    public ToyItem(){
    }
    public Integer getToyItemId(){
        return id;
    }
    public void setToyItem(Integer toyItem){
        this.id = toyItem;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getWeight(){
        return weight;
    }
    /**
     * Sets toy drop relative rate.
     * 
     * @param weight Must be in range 0-100.
     */
    public void setWeight(int weight){
        if (weight < MIN_WEIGHT || weight > MAX_WEIGHT) {
            throw new IllegalArgumentException();
        }
        this.weight = weight;
    }
    public int getQuantity(){
        return quantity;
    }
    /**
     * Sets quantity of toys of this kind.
     * 
     * @param quantity Must be greater than 0.
     */
    public void setQuantity(int quantity){
        if (quantity < 0) {
            throw new IllegalArgumentException();
        }
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return String.format("id: %2d  %s  weight: %d  quantity: %d", id, name, weight, quantity);
    }
}