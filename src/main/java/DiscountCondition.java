import java.time.DayOfWeek;
import java.time.LocalTime;

public class DiscountCondition {
    private DiscountConditionType type;
    private int sequence;
    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;


    public boolean isSatisfiedBy(Screening screening) {
        if (type == DiscountConditionType.PERIOD) {
            return isSatisfiedByPeriod(screening);
        }

        return isSatisfiedBySequence(screening);
    }

    private boolean isSatisfiedBySequence(final Screening screening) {
        return sequence == screening.getSequence();

    }

    private boolean isSatisfiedByPeriod(final Screening screening) {
        return dayOfWeek.equals(screening.getWhenScreened().getDayOfWeek()) &&
                startTime.isBefore(screening.getWhenScreened().toLocalTime()) &&
                endTime.isAfter(screening.getWhenScreened().toLocalTime());
    }
}
