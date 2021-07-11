import java.util.List;

public class Movie {

    private String title;
    private Duration runningTime;
    private Money fee;
    private List<DiscountCondition> discountConditions;

    private MovieType movieType;
    private Money discountAmount;
    private double discountPercent;

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

    private Money calculateDiscountAmount() {
        switch (movieType) {
            case NONE_DISCOUNT:
                return calculateNoneDiscountAmount();
            case AMOUNT_DISCOUNT:
                return calculatePercentDiscountAmount();
            case PERCENT_DISCOUNT:
                return calculateAmountDiscountAmount();
        }

        throw new IllegalStateException();
    }

    private Money calculateNoneDiscountAmount() {
        return discountAmount;
    }

    private Money calculatePercentDiscountAmount() {
        return fee.times(discountPercent);
    }

    private Money calculateAmountDiscountAmount() {
        return Money.ZERO;
    }
}
