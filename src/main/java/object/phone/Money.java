package object.phone;

public class Money {
    public static Money ZERO = new Money(0L);

    private Long value;

    public Money(Long value) {
        this.value = value;
    }

    public Money(double doubleValue) {
        this.value = Double.doubleToLongBits(doubleValue);
    }

    public Money times(long value) {
        return new Money(this.value * value);
    }

    public Money times(double value) {
        return new Money(this.value * value);
    }

    public Money plus(Money money) {
        return new Money(this.value + money.getValue());
    }

    public Long getValue() {
        return value;
    }

    public Money minus(Money discountAmount) {
        return new Money(this.value - discountAmount.getValue());
    }
}
