package kym.study.algorithm.doit.chap01;

import java.util.Scanner;

// 1부터 n까지의 정수 합 구하기
public class SumWhile {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값 : ");
        int n = stdIn.nextInt();

        int i = 1;
        int sum = 0;

        while(i<=n) {
            sum += i;
            i++;
        }

        System.out.println("sum = " + sum);

    }
}