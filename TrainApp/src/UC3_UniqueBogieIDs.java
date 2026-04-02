import java.util.HashSet;
import java.util.Set;

public class UC3_UniqueBogieIDs {

    // Set to store unique bogie IDs
    static Set<String> bogieIDs = new HashSet<>();

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // UC3 Flow
        addBogieIDs();
        displayBogieIDs();
    }

    // Add bogie IDs (including duplicates)
    public static void addBogieIDs() {

        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        System.out.println("\nBogie IDs added (with duplicates).");
    }

    // Display unique bogie IDs
    public static void displayBogieIDs() {
        System.out.println("Unique Bogie IDs: " + bogieIDs);
    }
}