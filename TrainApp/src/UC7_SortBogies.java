import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UC7_SortBogies {

    // Bogie class (inside same file)
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // List to store bogies
        List<Bogie> bogies = new ArrayList<>();

        // Adding bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 50));
        bogies.add(new Bogie("First Class", 24));

        System.out.println("\nBefore Sorting:");
        displayBogies(bogies);

        // Sorting using Comparator (by capacity)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter Sorting (by capacity):");
        displayBogies(bogies);
    }

    // Display method
    public static void displayBogies(List<Bogie> bogies) {
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }
    }
}