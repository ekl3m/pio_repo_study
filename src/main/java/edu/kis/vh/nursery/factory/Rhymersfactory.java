package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.tempDefaultCountingOutRhymer;

public interface RhymersFactory {

    public tempDefaultCountingOutRhymer getStandardRhymer();

    public tempDefaultCountingOutRhymer getFalseRhymer();

    public tempDefaultCountingOutRhymer getFIFORhymer();

    public tempDefaultCountingOutRhymer getHanoiRhymer();

}
