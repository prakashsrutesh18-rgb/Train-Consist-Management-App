import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.*;

public class UC8_FilterBogiesTest {

    // Reuse UC7 Bogie class
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    // Filter method (capacity > 70)
    List<Bogie> filterBogies(List<Bogie> bogies) {
        return bogies.stream()
                .filter(b -> b.capacity > 70)
                .collect(Collectors.toList());
    }

    // TEST 1: Capacity > 70
    @Test
    void testFilter_CapacityGreaterThanThreshold() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 50)
        );

        List<Bogie> result = filterBogies(bogies);

        assertEquals(1, result.size());
    }

    // TEST 2: Capacity = 70 (should NOT include)
    @Test
    void testFilter_CapacityEqualToThreshold() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Test", 70)
        );

        List<Bogie> result = filterBogies(bogies);

        assertTrue(result.isEmpty());
    }

    // TEST 3: Capacity < 70
    @Test
    void testFilter_CapacityLessThanThreshold() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("First Class", 24)
        );

        List<Bogie> result = filterBogies(bogies);

        assertTrue(result.isEmpty());
    }

    // TEST 4: Multiple matching bogies
    @Test
    void testFilter_MultipleBogiesMatching() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("Luxury", 80),
                new Bogie("AC Chair", 50)
        );

        List<Bogie> result = filterBogies(bogies);

        assertEquals(2, result.size());
    }

    // TEST 5: No bogies matching
    @Test
    void testFilter_NoBogiesMatching() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Mini", 20),
                new Bogie("Basic", 30)
        );

        List<Bogie> result = filterBogies(bogies);

        assertTrue(result.isEmpty());
    }

    // TEST 6: All bogies matching
    @Test
    void testFilter_AllBogiesMatching() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("A", 75),
                new Bogie("B", 80)
        );

        List<Bogie> result = filterBogies(bogies);

        assertEquals(2, result.size());
    }

    // TEST 7: Empty list
    @Test
    void testFilter_EmptyBogieList() {
        List<Bogie> bogies = new ArrayList<>();

        List<Bogie> result = filterBogies(bogies);

        assertTrue(result.isEmpty());
    }

    // TEST 8: Original list unchanged
    @Test
    void testFilter_OriginalListUnchanged() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 50));

        int originalSize = bogies.size();

        filterBogies(bogies);

        assertEquals(originalSize, bogies.size());
    }
}