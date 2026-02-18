package patterns.behavioral.state;

public interface ParseState {

    void comma(CsvParser parser);

    void quote(CsvParser parser);

    void character(char ch, CsvParser parser);

    void finish(CsvParser parser);
}
