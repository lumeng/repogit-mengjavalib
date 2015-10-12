package net.meng.util;

/**
 * Author: Meng LU <lumeng.dev@gmail.com>
 * Date: 9/22/14 8:44 PM
 */

@SuppressWarnings("unchecked")

public class QuickSortRegular {

    private static int partition(Comparable[] a, int lo, int hi) {

        int lt = lo;
        int rt = hi+1;


        // assuming N = hi - lo + 1,
        // total comparisons A_N in partition stage is
        //
        // consider the extreme case of a sorted array,
        // A_N = 1 + hi - lo + 1 = N + 1
        while (true) {
            // consider the extreme case of a sorted array,
            // compareTo called for lt = lo+1
            while (a[++lt].compareTo(a[lo]) <= 0) if (lt == hi) break;


            // consider the extreme case of a sorted array,
            // compareTo called for rt = hi, hi-1, ..., lo
            while (a[--rt].compareTo(a[lo]) == 1) if (rt == lo) break;

            if (lt >= rt) break;

            exchange(a, lt, rt);
        }

        exchange(a, lo, rt);

        return rt;

    }

    private static void exchange(Comparable[] a, int i, int j) {
        Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void sort (Comparable[] a, int lo, int hi) {

        if (lo >= hi) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j-1);
        sort(a, j+1, hi);

    }

    public static void main(String[] args) {
        Comparable<Integer>[] a = new Integer[10];


        System.out.println("define array:");
        for (int i = 0; i<10; i++) {
            a[i] = (int) Math.ceil(100*Math.sin(i));
            System.out.println("a[" + i + "] = " + a[i]);
        }

        sort(a, 0, 9);

        System.out.println("print sorted array:");
        for (int i = 0; i<10; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }

    }
}
