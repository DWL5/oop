package object.phone;

public class TaxablePolicy extends AdditionalRatePolicy{
    private double taxRatio;

    public TaxablePolicy(Double taxRatio, RatePolicy next) {
        super(next);
        this.taxRatio = taxRatio;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return fee.plus(fee.times(taxRatio));
    }
}
