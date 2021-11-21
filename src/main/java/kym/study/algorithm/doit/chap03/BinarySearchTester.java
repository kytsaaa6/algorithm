package kym.study.algorithm.doit.chap03;
// Arrays.binarySearch로 이진 검색

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int n = stdIn.nextInt();

        int[] x = new int[n];

        System.out.println("오름차순으로 입력하세요.");
        System.out.print("x[0] : ");
        x[0] = stdIn.nextInt();

        for (int i=1; i<x.length; i++) {
            do {
                System.out.print("x["+i+"] : ");
                x[i] = stdIn.nextInt();
            } while(x[i] < x[i-1]);
        }

        System.out.print("검색할 값 : ");
        int key = stdIn.nextInt();

        int idx = Arrays.binarySearch(x,key);

        if(idx<0)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(key+" 는 x["+idx+"] 에 있습니다.");
    }
}
