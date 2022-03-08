package inOutPractice;
import java.nio.file.*;
import java.io.IOException;
import java.util.*;


public class IOPractice {
    String directory = "data";
    String file = "data.txt";

    List<String> groceryList = Arrays.asList("coffee", "milk", "sugar");
    Path filepath = Paths.get("data", "groceries.txt");
    Files.write(filepath, groceryList);
}
