public class SequenceCondition {
    private int sequence;

    public SequenceCondition(final int sequence) {
        this.sequence = sequence;
    }

    public boolean isSatisfiedBySequence(final Screening screening) {
        return sequence == screening.getSequence();
    }
}
