package kym.study.algorithm.doit.chap02;

import java.util.Random;
import java.util.Scanner;

// 배열 요소의 최댓값을 나타냅니다(값을 난수로 생성).
public class MaxOfArrayRand {

    static int maxOf(int[] a) {

        int max = 0;

        for(int i=0; i<a.length; i++) {
            if(a[i] > max) {
                max = a[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdInt = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수 : ");

        int size = stdInt.nextInt();

        int[] height = new int[size];

        System.out.println("키 값은 아래와 같습니다.");
        for(int i=0; i<height.length; i++) {
            height[i] = 100 + rand.nextInt(90); // 100 + 0~89까지의 난수 생성.
            System.out.println("height[i] = " + height[i]);
        }

        System.out.println("최댓값은 " + maxOf(height) + "입니다.");
    }
}
