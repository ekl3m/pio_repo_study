package edu.kis.vh.nursery;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;

class RhymersDemo {

    public static final int BOUND = 20;
    public static final int RHYMERS_NUMBER = 3;
    public static final int ITERATIONS_NUMBER = 15;

    public static void main(String[] args) {
        RhymersFactory factory = new DefaultRhymersFactory();

        DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
                factory.getFIFORhymer(), factory.getHanoiRhymer() };

        for (int i = 1; i < ITERATIONS_NUMBER; i++)
            for (int j = 0; j < RHYMERS_NUMBER; j++)
                rhymers[j].countIn(i);

        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < ITERATIONS_NUMBER; i++)
            rhymers[RHYMERS_NUMBER].countIn(rn.nextInt(BOUND));

        for (int i = 0; i < rhymers.length; i++) {
            while (!rhymers[i].callCheck())
                System.out.print(rhymers[i].countOut() + "  ");
            System.out.println();
        }

        System.out.println("total rejected is "
                + ((HanoiRhymer) rhymers[RHYMERS_NUMBER]).reportRejected());

    }

}