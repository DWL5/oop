public class Reservation {
    private final Customer customer;
    private final Screening screening;
    private final Money calculateFee;
    private final int audienceCount;

    public Reservation(final Customer customer, final Screening screening, final Money calculateFee, final int audienceCount) {

        this.customer = customer;
        this.screening = screening;
        this.calculateFee = calculateFee;
        this.audienceCount = audienceCount;
    }
}
