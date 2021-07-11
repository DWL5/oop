import java.util.List;

public class NoneDiscountAbstractMovie extends AbstractMovie {
    public NoneDiscountAbstractMovie(final String title, final Duration runningTime, final Money fee, final List<DiscountCondition> discountConditions) {
        super(title, runningTime, fee, discountConditions);
    }

    @Override
    protected Money calculateDiscountAmount() {
        return Money.ZERO;
    }
}
