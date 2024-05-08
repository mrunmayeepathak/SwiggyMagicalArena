package com.magicarena.model;

import java.util.Random;

public class Dice {
    private static final Random random = new Random();

    public static int roll() {

        return random.nextInt(6) + 1;  // Rolls a number between 1 and 6
    }
}
