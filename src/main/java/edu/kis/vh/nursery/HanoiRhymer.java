package edu.kis.vh.nursery;

/**
 * HanoiRhymer is a special type of rhymer that extends the
 * DefaultCountingOutRhymer.
 * It tracks the total number of rejected inputs based on specific conditions.
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    /**
     * Total number of rejected inputs.
     */
    private int totalRejected = 0;

    /**
     * Reports the total number of rejected inputs.
     *
     * @return the total number of rejected inputs
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Counts the given value into the rhymer.
     * If the value is greater than the current top value and the rhymer is not
     * empty,
     * the value is rejected and the totalRejected counter is incremented.
     * Otherwise, the value is counted in using the superclass method.
     *
     * @param in the value to be counted in
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
