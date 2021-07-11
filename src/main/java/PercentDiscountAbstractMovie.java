import java.util.List;

public class PercentDiscountAbstractMovie extends AbstractMovie {
    private double percent;

    public PercentDiscountAbstractMovie(final String title, final Duration runningTime, final Money fee,
                                        double percent,
                                        final List<DiscountCondition> discountConditions) {
        super(title, runningTime, fee, discountConditions);
        this.percent = percent;
    }


    @Override
    protected Money calculateDiscountAmount() {
        return getFee().times(percent);
    }
}
