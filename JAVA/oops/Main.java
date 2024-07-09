import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        // Welcome message
        System.out.println("Today's Special Menu");
        System.out.println("--------------------------------------------------");

        // Special Cakes
        System.out.println("Special Cakes");
        System.out.println("---------------------------------------------");

        // Create ArrayList for cakes
        ArrayList<Cake> cakes = new ArrayList<>();
        cakes.add(new Cake("Chocolate Brownie", 250.0f));
        cakes.add(new Cake("Chocolate Maple", 300.0f));

        // Use for-each loop to display cakes
        for (Cake cake : cakes) {
            cake.display();
        }

        // Special Pastries
        System.out.println();
        System.out.println("Special Pastries");
        System.out.println("---------------------------------------------");

        // Create ArrayList for pastries
        ArrayList<Pastry> pastries = new ArrayList<>();
        pastries.add(new Pastry("Black Forest", 35.0f));
        pastries.add(new Pastry("Choco Truffle", 40.0f));

        // Use for-each loop to display pastries
        for (Pastry pastry : pastries) {
            pastry.display();
        }
    }
}
