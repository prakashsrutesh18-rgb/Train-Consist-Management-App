import java.util.ArrayList;
import java.util.List;

public class UC2_AddPassengerBogies {

    // Passenger bogie list
    static List<String> passengerBogies = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // UC2 Flow
        addBogies();
        displayBogies();
        removeBogie("AC Chair");
        checkBogie("Sleeper");
        displayBogies();
    }

    // Add passenger bogies
    public static void addBogies() {
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nPassenger bogies added.");
    }

    // Display bogies
    public static void displayBogies() {
        System.out.println("Current bogies: " + passengerBogies);
    }

    // Remove a bogie
    public static void removeBogie(String bogie) {
        passengerBogies.remove(bogie);
        System.out.println("\nRemoved bogie: " + bogie);
    }

    // Check if bogie exists
    public static void checkBogie(String bogie) {
        if (passengerBogies.contains(bogie)) {
            System.out.println(bogie + " bogie exists in the train.");
        } else {
            System.out.println(bogie + " bogie does NOT exist in the train.");
        }
    }
}