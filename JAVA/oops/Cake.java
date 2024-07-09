public class Cake{
    private String name;
    private float price;

    // Constructor
    public Cake(String name, float price) {
        this.name = name;
        this.price = price;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for price
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // Display method
    public void display() {
        System.out.println(name + " :  " + price + " per pound");
    }
}
