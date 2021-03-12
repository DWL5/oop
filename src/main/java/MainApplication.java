import java.io.IOException;

public class MainApplication {

    public static void main(final String... args) throws IOException {

        final BankTransactionAnalyzerSimple bankTransactionAnalyzerSimple = new BankTransactionAnalyzerSimple();

        final BankStatementParser bankStatementParser = new BankStatementCSVParser();

        bankTransactionAnalyzerSimple.analyze(args[0], bankStatementParser);
    }
}
