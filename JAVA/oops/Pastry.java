public class Pastry extends Cake{

    // Constructor
    public Pastry(String name, float price) {
        super(name, price);
    }

    // Overridden display method
    @Override
    public void display() {
        System.out.println(getName() + " :  " + getPrice() + " per piece");
    }
}
