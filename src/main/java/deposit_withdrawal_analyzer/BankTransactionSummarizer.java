package deposit_withdrawal_analyzer;

public interface BankTransactionSummarizer {
    double summarize(double accumulator, BankTransaction bankTransaction);
}
