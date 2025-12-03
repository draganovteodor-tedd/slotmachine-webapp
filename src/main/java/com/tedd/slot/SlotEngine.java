package com.tedd.slot;

import java.util.Random;

public class SlotEngine {

    private static final String[] SYMBOLS = {"🍒","🍋","🔔","⭐","7️⃣","🍀"};
    private static final int[] PAYOUT = {2,3,5,8,20,10};

    private final Random rnd = new Random();

    public static class SpinResult {
        public String r1, r2, r3;
        public double win;
    }

    public SpinResult spin(double bet) {
        SpinResult r = new SpinResult();
        r.r1 = randomSymbol();
        r.r2 = randomSymbol();
        r.r3 = randomSymbol();
        r.win = calculateWin(r.r1, r.r2, r.r3, bet);
        return r;
    }

    private String randomSymbol() {
        return SYMBOLS[rnd.nextInt(SYMBOLS.length)];
    }

    private double calculateWin(String a, String b, String c, double bet) {
        if (a.equals(b) && b.equals(c)) {
            int idx = indexOfSymbol(a);
            return bet * PAYOUT[idx];
        }
        int sevens = 0;
        if (a.equals("7️⃣")) sevens++;
        if (b.equals("7️⃣")) sevens++;
        if (c.equals("7️⃣")) sevens++;
        if (sevens == 2) return bet * 3;
        return 0;
    }

    private int indexOfSymbol(String s) {
        for (int i=0; i<SYMBOLS.length; i++)
            if (SYMBOLS[i].equals(s)) return i;
        return -1;
    }
}
