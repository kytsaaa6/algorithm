package kym.study.algorithm.doit.chap02;

import java.util.Scanner;

// 두 배열이 같은가를 판단
public class ArrayEqual {

    static boolean equals(int[] a, int[] b) {
        if(a.length != b.length)
            return false;

        for(int i=0; i<a.length; i++) {
            if(a[i] != b[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("배열 a의 요솟수 : ");
        int na = stdIn.nextInt();

        int[] a = new int[na];

        for(int i=0; i<a.length; i++) {
            a[i] = stdIn.nextInt();
        }

        System.out.print("배열 b의 요솟수 : ");
        int nb = stdIn.nextInt();

        int[] b = new int[nb];

        for(int i=0; i<b.length; i++) {
            b[i] = stdIn.nextInt();
        }

        System.out.println("equals(a,b) = " + equals(a,b));
    }
}
