package kym.study.algorithm.doit.chap01;

import java.util.Scanner;

// 입력한 정숫값이 양수인지 음수인지 0인지 판단
public class JudgeSign {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수를 입력하세요.");
        int n = stdIn.nextInt();

        if(n>0)
            System.out.println("양수 입니다.");
        else if(n<0)
            System.out.println("음수 입니다.");
        else
            System.out.println("0입니다.");
    }
}
