package patterns.behavioral.state;

import java.util.ArrayList;
import java.util.List;

public class CsvParser {

    private ParseState state;
    private List<String> splitStrings;
    private StringBuilder stringBuilder;

    public CsvParser() {
        state = NotQuoteState.getInstance();
    }

    void setState(ParseState state) {
        this.state = state;
    }

    void bufferChar(char ch) {
        stringBuilder.append(ch);
    }

    void createString() {
        splitStrings.add(stringBuilder.toString().trim());
        stringBuilder.setLength(0);
    }

    public List<String> split(String str) {
        splitStrings = new ArrayList<>();
        stringBuilder = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (ch == ',')
                state.comma(this);
            else if (ch == '\"')
                state.quote(this);
            else
                state.character(ch, this);
        }

        state.finish(this);

        return splitStrings;
    }
}
