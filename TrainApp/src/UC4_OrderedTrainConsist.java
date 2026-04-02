import java.util.LinkedList;

public class UC4_OrderedTrainConsist {

    // LinkedList to maintain train order
    static LinkedList<String> train = new LinkedList<>();

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // UC4 Flow
        addBogies();
        insertPantry();
        removeEnds();
        displayTrain();
    }

    // Add initial bogies
    public static void addBogies() {
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("\nInitial train consist: " + train);
    }

    // Insert Pantry Car at position 2
    public static void insertPantry() {
        train.add(2, "Pantry");
        System.out.println("After adding Pantry at position 2: " + train);
    }

    // Remove first and last bogie
    public static void removeEnds() {
        train.removeFirst();
        train.removeLast();
        System.out.println("After removing first and last bogie: " + train);
    }

    // Display final train consist
    public static void displayTrain() {
        System.out.println("\nFinal ordered train consist: " + train);
    }
}