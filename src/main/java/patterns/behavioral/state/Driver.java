package patterns.behavioral.state;

import java.util.List;

public class Driver {
    public static void main(String[] args) {

        String csv = "John, Wick, \"Long Island, No:121\", \"He said \"\"Hello\"\"\", New York";
        System.out.println("Input: " + csv);

        CsvParser parser = new CsvParser();
        List<String> result = parser.split(csv);
        System.out.println("Result size: " + result.size());
        result.stream().forEach(res -> System.out.println("[" + res + "]"));
    }
}
