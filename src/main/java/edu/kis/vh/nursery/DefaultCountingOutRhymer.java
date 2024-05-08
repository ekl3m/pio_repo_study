package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int AMOUNT_OF_NUMBERS = 12;
    public static final int TOTAL_BEGINING_NUMBER = -1;
    private int[] numbers = new int[AMOUNT_OF_NUMBERS];

    public int total = TOTAL_BEGINING_NUMBER;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == TOTAL_BEGINING_NUMBER;
    }

    public boolean isFull() {
        return total == (AMOUNT_OF_NUMBERS - 1);
    }

    protected int peekaboo() {
        if (callCheck())
            return TOTAL_BEGINING_NUMBER;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return TOTAL_BEGINING_NUMBER;
        return numbers[total--];
    }

}
