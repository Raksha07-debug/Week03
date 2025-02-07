package stringbufferque.compare;

import java.util.Scanner;

public class CompareString{
    public static void main(String[] args) {
        long startTime, endTime;

        // Testing StringBuilder Performance
        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 0; i < 100000; i++) {
            sb.append(" Performance Test");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime - startTime) + " ns");

        // Testing StringBuffer Performance
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer("Hello");
        for (int i = 0; i < 100000; i++) {
            sbf.append(" Performance Test");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endTime - startTime) + " ns");
    }
}

