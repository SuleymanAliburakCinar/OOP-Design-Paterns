package patterns.behavioral.state;

public class QuoteState implements ParseState {

    private static QuoteState instance = new QuoteState();

    private QuoteState() {
    }

    public static QuoteState getInstance() {
        return instance;
    }

    @Override
    public void comma(CsvParser parser) {
        parser.bufferChar(',');
    }

    @Override
    public void quote(CsvParser parser) {
        //Quote state inin içindeyken tekrar quote geldiği için AfterQuote state ine geçilir. Alıntının içindeki uç durumlar orada kontrol edilir.
        parser.setState(AfterQuoteState.getInstance());
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
