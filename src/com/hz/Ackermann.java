package com.hz;

public class Ackermann {

    public int ccalc(int m, int n) {

        int val = 0;
        for(int i = 0; i< m*n; i++) {
            val = this.calculate(m, n);
        }
        return val;
    }

    // Ackerman.java
    public int calculate(int m, int n) {
        int result = -1;
        if(m == 0) {
            result = n + 1;
        }
        if(m > 0 && n == 0) {
            result = calculate(m - 1, 1);
        }
        if(m > 0 && n > 0) {
            result = calculate(m - 1, calculate(m, n -1));
        }
        return result;
    }
}
