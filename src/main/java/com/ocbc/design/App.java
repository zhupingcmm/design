package com.ocbc.design;

import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/**
 * @Author: pzhu
 * @Date: 2023/11/18 9:37
 */
public class App {
    public static void main(String[] args) {

        App app = new App();
        boolean isHappy = app.isHappy(105);
        System.out.println(isHappy);
    }


    public boolean isHappy(int n) {

        Set<Integer> record = new HashSet<>();

        while (n != 1 && !record.contains(n)) {
            record.add(n);
            n = getNextNumber(n);
        }

        return n == 1;
    }

    private int getNextNumber(int n) {
        int res = 0;
        while (n > 0) {
            int tem = n % 10;
            res += tem * tem;
            n = n / 10;
        }
        return res;
    }
}
