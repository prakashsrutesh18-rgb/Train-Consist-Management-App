import java.util.LinkedHashSet;

public class UC5_OrderedUniqueBogies {

    // LinkedHashSet to maintain order + uniqueness
    static LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // UC5 Flow
        addBogies();
        displayFormation();
    }

    // Add bogies (including duplicate)
    public static void addBogies() {

        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        trainFormation.add("Sleeper"); // duplicate (ignored)

        System.out.println("\nBogies added (duplicate attempted).");
    }

    // Display final formation
    public static void displayFormation() {
        System.out.println("Final train formation: " + trainFormation);
    }
}