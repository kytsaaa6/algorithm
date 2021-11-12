package kym.study.algorithm.doit.chap02;

import java.util.Random;
import java.util.Scanner;

// 배열 요소에 값을 읽어 들여 역순으로 정렬합니다.
public class ReverseArray {

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 역순 정렬 !!
    static void reverse(int[] a) {
        for(int i=0; i<a.length/2; i++) {
            swap(a, i, a.length - i - 1);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("요솟수");
        int num = stdIn.nextInt();

        int[] x = new int[num];

        for(int i=0; i<x.length; i++) {
            x[i] = 1 + rand.nextInt(50);
            System.out.print(" " + x[i]);
        }

        reverse(x);

        System.out.println();
        for(int i=0; i<x.length; i++) {
            System.out.print(" " + x[i]);
        }
    }

}
