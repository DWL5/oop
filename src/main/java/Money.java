public class Money {

    public static final Money ZERO = new Money(0L);
    private final double value;

    public Money(final double value) {
        this.value = value;
    }

    public Money times(final double discountPercent) {
        return new Money(value * discountPercent);
    }

    public Money minus(final Money money) {
        return new Money(value - money.getValue());
    }

    public double getValue() {
        return value;
    }
}
