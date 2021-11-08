package kym.study.algorithm.doit.chap01;

import java.util.Scanner;

// 3개의 정숫값을 입력하고 중앙값을 구한 다음 출력
public class Median {
    static int med3(int a, int b, int c) {

        int med = 0;

        if(a>=b)
            if(b>=c)
                med = b;
            else if(a>=c)
                med = c;
            else
                med = a;
        else if (a>c)
            med = a;
        else if (b>c)
            med = c;
        else
            med = b;

        return med;
    }

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 중앙값을 구합니다.");
        System.out.println("a의 값 : ");
        int a = stdIn.nextInt();
        System.out.println("b의 값 : ");
        int b = stdIn.nextInt();
        System.out.println("c의 값 : ");
        int c = stdIn.nextInt();

        System.out.println("중앙값은 " + med3(a,b,c) + "입니다.");
    }
}
