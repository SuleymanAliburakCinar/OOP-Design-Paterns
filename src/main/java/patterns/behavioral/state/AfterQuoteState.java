package patterns.behavioral.state;

public class AfterQuoteState implements ParseState {

    private static final AfterQuoteState instance = new AfterQuoteState();

    private AfterQuoteState() {
    }

    public static AfterQuoteState getInstance() {
        return instance;
    }

    @Override
    public void comma(CsvParser parser) {
        // Sıradaki virgül ise quote alıntı tamamlandığı için gelmiştir. Kelime eklenir NotQuote stateine geçilir
        parser.createString();
        parser.setState(NotQuoteState.getInstance());
    }

    @Override
    public void quote(CsvParser parser) {
        // Sıradaki quote ise quote basılır ve quote state e geri geçilir
        parser.bufferChar('\"');
        parser.setState(QuoteState.getInstance());
    }

    @Override
    public void character(char ch, CsvParser parser) {
        // Sıradaki quote değil ise NotQuote gibi davranır ve NotQuote state ine geçilir.
        parser.bufferChar(ch);
        parser.setState(NotQuoteState.getInstance());
    }

    @Override
    public void finish(CsvParser parser) {
        parser.createString();
    }
}
