package object.phone;

public interface RatePolicy {

    public Money calculateFee(Phone phone);
}
