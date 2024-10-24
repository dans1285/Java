
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;


public class PostalCodeSearchTest {

    /**
     * Main method to execute the postal code search test.
     * 
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Create a Map to store postal code entries
        Map<String, PostalCodeEntry> postalCodeMap = new HashMap<>();

        // Path to the CSV file
        String filename = "ottawa_postal_codes.csv";
        
        Path file = Paths.get(filename);
       
        // Read and process the CSV file
        try (BufferedReader input = Files.newBufferedReader(file)) {
            String line = "";
            while ((line = input.readLine()) != null) {
                String[] fields = line.split(",");
                PostalCodeEntry entry = new PostalCodeEntry(fields[0], fields[1], fields[2], fields[3], fields[4]);
                postalCodeMap.put(entry.getPrefix(), entry);
            }
        } catch (IOException e) {
            System.err.println("Error reading the CSV file: " + e.getMessage());
            e.printStackTrace();
            return; // Terminate the program
        }

        // Test the Map by generating random prefixes
        for (int i = 0; i < 10; i++) {
            String randomPrefix = PostalCodeEntry.getRandomPrefix();
            System.out.println("Retrieving: " + randomPrefix);
            PostalCodeEntry postalCodeEntry = postalCodeMap.get(randomPrefix);
            if (postalCodeEntry != null) {
                System.out.println(postalCodeEntry);
            } else {
                System.out.println("NOT found");
            }
        }
    }
}

