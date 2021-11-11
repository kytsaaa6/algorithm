package kym.study.algorithm.doit.chap02;

import java.util.Scanner;

// 배열 요소의 최댓값을 나타냅니다(값을 입력 받음).
public class MaxOfArray {

    static int maxOf(int[] a) {

        int max = 0;

        for(int i=0; i<a.length; i++) {
            if(a[i]>max) {
                max = a[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수 : ");
        int size = stdIn.nextInt();
        int[] height = new int[size];

        for(int i=0; i<height.length; i++) {
            System.out.println(i+1 + " 번쨰 키를 입력하세요.");
            height[i] = stdIn.nextInt();
        }
        System.out.println(maxOf(height));
    }
}
