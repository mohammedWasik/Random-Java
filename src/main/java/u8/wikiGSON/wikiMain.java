package u8.wikiGSON;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class wikiMain {
    public static void main(String[] args) {
        try {
            // Read data from JSON file and print the current name
            WikiJsonHandler data = JsonToObject.getData();
            if (data != null) {
                System.out.println("Current name: " + data.getName());

                // Write new name to JSON file
                JsonToObject.writeData("jay-z");

                // Read data again from JSON file after updating
                WikiJsonHandler updatedData = JsonToObject.getData();
                System.out.println("Updated name: " + updatedData.getName());
            } else {
                System.out.println("Failed to read data from JSON file.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class JsonToObject {
        private static final String resourcePath = "src/main/resources/wikipediaJSON.json";
        private static final Gson gson = new Gson();

        static WikiJsonHandler getData() throws IOException {
            try (FileReader fileReader = new FileReader(resourcePath)) {
                return gson.fromJson(fileReader, WikiJsonHandler.class);
            } catch (IOException e) {
                System.out.println("Error reading JSON file: " + e.getMessage());
                throw e;
            }
        }

        static void writeData(String name) throws IOException {
            JsonObject jsonObject;
            try (FileReader fileReader = new FileReader(resourcePath)) {
                jsonObject = JsonParser.parseReader(fileReader).getAsJsonObject();
            }

            jsonObject.addProperty("name", name);

            try (FileWriter fileWriter = new FileWriter(resourcePath)) {
                Gson gson1 = new GsonBuilder().setPrettyPrinting().create();
                gson1.toJson(jsonObject, fileWriter);
                System.out.println("Successfully updated JSON object with new name.");
            } catch (IOException e) {
                System.out.println("Error writing to JSON file: " + e.getMessage());
                throw e;
            }
        }
    }
}
