import java.util.HashMap;
import java.util.Map;

public class UC6_BogieCapacityMapping {

    // HashMap to store bogie -> capacity
    static HashMap<String, Integer> bogieCapacity = new HashMap<>();

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // UC6 Flow
        addBogieCapacity();
        displayCapacity();
    }

    // Add bogie-capacity mapping
    public static void addBogieCapacity() {

        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 50);
        bogieCapacity.put("First Class", 24);

        System.out.println("\nBogie capacity mapping added.");
    }

    // Display bogie capacities
    public static void displayCapacity() {

        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}