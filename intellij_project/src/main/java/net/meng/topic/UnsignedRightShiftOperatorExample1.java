package net.meng.topic;

/**
 * Author: Meng Lu <lumeng.dev@gmail.com>
 * Date: 2017-6-17T14:50-0700
 *
 * This example demonstrates computing the mean of two large integers using
 * the right shift operator.
 *
 */
public class UnsignedRightShiftOperatorExample1 {

    private static final int int1 = Integer.MAX_VALUE - 1;
    private static final int int2 = Integer.MAX_VALUE;
    private static Double int1Double = new Double(int1);
    private static Double int2Double = new Double(int2);

    public static void main(String[] args) {

        int mid1 = (int1 + int2) /2;

        System.out.println(mid1);

        int mid2 = (int1 + int2) >>> 1;

        System.out.println(mid2);


        Double mid3 = (int1Double + int2Double) / 2.;

        System.out.println(mid3);

    }
}
