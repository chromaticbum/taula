package com.taula.core;

import java.util.Random;

/**
 * Created by hwilkins on 12/25/14.
 */
public class Roll {
    private static final Random rand = new Random();
    private final int die1, die2;

    public static Roll uniqueRoll() {
        Roll roll = new Roll();

        while(roll.isDoubles()) {
            roll = new Roll();
        }

        return roll;
    }

    public Roll() {
        this.die1 = rand.nextInt(6) + 1;
        this.die2 = rand.nextInt(6) + 1;
    }

    public int getDie1() {
        return die1;
    }

    public int getDie2() {
        return die2;
    }

    public boolean isDoubles() {
        return die1 == die2;
    }
}
