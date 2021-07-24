package object.phone;

public abstract class BasicRatePolicy implements RatePolicy{
    @Override
    public Money calculateFee(Phone phone) {
        Money money = Money.ZERO;

        for (Call call : phone.getCalls()) {
            money.plus(calculateCallFee(call));
        }
        return null;
    }

    protected abstract Money calculateCallFee(Call call);
}
