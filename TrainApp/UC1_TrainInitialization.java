import java.util.ArrayList;
import java.util.List;

public class UC1_TrainInitialization {

    // Train consist (list of bogies)
    static List<String> trainConsist = new ArrayList<>();

    public static void main(String[] args) {

        // UC1 Flow
        initializeTrain();
        displaySummary();
    }

    // Initialize train
    public static void initializeTrain() {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("Train consist initialized.");
    }

    // Display summary
    public static void displaySummary() {
        System.out.println("Initial number of bogies: " + trainConsist.size());
    }
}