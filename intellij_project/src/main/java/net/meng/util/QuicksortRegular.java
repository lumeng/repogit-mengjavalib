package net.meng.util;

import java.util.Arrays;

/**
 * Author: Meng LU <lumeng.dev@gmail.com>
 * Creation time: 2014-09-22T20:44:00-0800
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

            display(a, lo, hi, lt, rt);
            exchange(a, lt, rt);
            display(a, lo, hi, lt, rt);
        }

        exchange(a, lo, rt);
        display(a, lo, hi, lt, rt);

        return rt;

    }

    private static void display(Comparable a[], int lo, int hi, int lt, int rt) {

        String[] idx = new String[a.length];

        for (int i = 0; i < idx.length; i++) {
            idx[i] = String.format("% 6d", a[i]);
        }
        idx[lo] = "lo:" + String.format("% 3d", a[lo]);
        idx[hi] = "hi:" + String.format("% 3d", a[hi]);
        idx[lt] = "lt:" + String.format("% 3d", a[lt]);
        idx[rt] = "rt:" + String.format("% 3d", a[rt]);

        System.out.println(Arrays.toString(idx));
    }

    private static void display(Comparable a[]) {

        String[] idx = new String[a.length];

        for (int i = 0; i < idx.length; i++) {
            idx[i] = String.format("% 6d", a[i]);
        }

        System.out.println(Arrays.toString(idx));
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
        System.out.println("initial array:");
        for (int i = 0; i<10; i++) {
            a[i] = (int) Math.ceil(100*Math.sin(i));
        }
        display(a);
        System.out.println("sorting array:");
        sort(a, 0, 9);

        System.out.println("sorted array:");
        display(a);

    }
}
