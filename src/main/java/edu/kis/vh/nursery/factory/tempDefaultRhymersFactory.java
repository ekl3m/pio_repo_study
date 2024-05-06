package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.tempDefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.RhymersFactory;

public class tempDefaultRhymersFactory implements RhymersFactory {

    @Override
    public tempDefaultCountingOutRhymer getStandardRhymer() {
        return new tempDefaultCountingOutRhymer();
    }

    @Override
    public tempDefaultCountingOutRhymer getFalseRhymer() {
        return new tempDefaultCountingOutRhymer();
    }

    @Override
    public tempDefaultCountingOutRhymer getFIFORhymer() {
        return new FIFORhymer();
    }

    @Override
    public tempDefaultCountingOutRhymer getHanoiRhymer() {
        return new HanoiRhymer();
    }

}
