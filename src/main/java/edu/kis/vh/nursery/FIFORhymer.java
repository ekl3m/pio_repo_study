package edu.kis.vh.nursery;

public class FIFORhymer extends tempDefaultCountingOutRhymer {

    public tempDefaultCountingOutRhymer temp = new tempDefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}
