package ioTests.Task6;

import com.google.gson.Gson;
import java.io.FileReader;

public class GsonParser {
    public Squad parse() {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader("src/main/resources/task6.json")) {

            Squad squad = gson.fromJson(reader, Squad.class);

            return squad;
        } catch (Exception e) {
            System.out.println("Parsing error " + e.toString());
        }

        return null;
    }
}
