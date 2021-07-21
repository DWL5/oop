public class Money {
    public static Money ZERO = new Money(0L);

    private Long value;

    public Money(Long value) {
        this.value = value;
    }

    public Money times(long value) {
        return new Money(this.value * value);
    }

    public Money plus(Money money) {
        return new Money(this.value + money.getValue());
    }

    public Long getValue() {
        return value;
    }
}
