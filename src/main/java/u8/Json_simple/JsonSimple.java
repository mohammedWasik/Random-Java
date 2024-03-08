package u8.Json_simple;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonSimple {
    public static void main(String[] args) throws IOException, ParseException {
        // Read data from the existing JSON file
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(new FileReader("src/main/resources/book.json"));

        // Get the "book" object from the existing JSON data
        JSONObject bookObject = (JSONObject) jsonObject.get("book");

        // Extract information from the "book" object
        String author = (String) bookObject.get("author");
        String house = (String) bookObject.get("House");
        String year = (String) bookObject.get("year");
        String price = (String) bookObject.get("price");

        // Print the extracted information
        System.out.println("Original Author: " + author);
        System.out.println("Original House: " + house);
        System.out.println("Original Year: " + year);
        System.out.println("Original Price: " + price);

        // Update the JSON data in the same file
        try (FileWriter file = new FileWriter("src/main/resources/book.json")) {
            // Create a new JSONObject with updated data
            JSONObject updatedBookObject = new JSONObject();
            updatedBookObject.put("author", "Cardi Z");
            updatedBookObject.put("House", "NY Records");
            updatedBookObject.put("year", "2000");
            updatedBookObject.put("price", "9.9");

            // Create a JSONObject to hold the updated bookObject
            JSONObject updatedJsonObject = new JSONObject();
            updatedJsonObject.put("book", updatedBookObject);

            // Write the updated JSON data to the same file
            file.write(updatedJsonObject.toJSONString());
            System.out.println("Successfully wrote updated JSON object to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
