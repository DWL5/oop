import java.util.List;

public abstract class AbstractMovie {

    private String title;
    private Duration runningTime;
    private Money fee;
    private List<DiscountCondition> discountConditions;

    public AbstractMovie(final String title, final Duration runningTime, final Money fee, final List<DiscountCondition> discountConditions) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountConditions = discountConditions;
    }

    public Money calculateMovieFee(Screening screening) {
        if (isDiscountable(screening)) {
            return fee.minus(calculateDiscountAmount());
        }

        return fee;
    }

    private boolean isDiscountable(final Screening screening) {
        return discountConditions.stream()
                .anyMatch(condition -> condition.isSatisfiedBy(screening));
    }

    abstract protected Money calculateDiscountAmount();

    protected String getTitle() {
        return title;
    }

    protected Duration getRunningTime() {
        return runningTime;
    }

    protected Money getFee() {
        return fee;
    }

    protected List<DiscountCondition> getDiscountConditions() {
        return discountConditions;
    }
}
