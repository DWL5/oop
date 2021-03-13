package deposit_withdrawal_analyzer;

public interface BankTransactionFilter {
    boolean test(BankTransaction bankTransaction);
}
