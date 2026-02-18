package patterns.behavioral.state;

public class NotQuoteState implements ParseState {

    private static NotQuoteState instance = new NotQuoteState();

    private NotQuoteState() {
    }

    public static NotQuoteState getInstance() {
        return instance;
    }

    @Override
    public void comma(CsvParser parser) {
        parser.createString();
    }

    @Override
    public void quote(CsvParser parser) {
        parser.setState(QuoteState.getInstance());
    }

    @Override
    public void character(char ch, CsvParser parser) {
        parser.bufferChar(ch);
    }

    @Override
    public void finish(CsvParser parser) {
        parser.createString();
    }
}
