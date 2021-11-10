package kym.study.algorithm.doit.chap01;

import java.util.Scanner;

// 2자리의 양수(10 ~99)로 제한
public class Digits {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int no;

        System.out.println("2자리의 정수를 입력하세요.");

        do {
            System.out.print("입력 : ");
            no = stdIn.nextInt();
        } while (no < 10 || no > 99);

        System.out.println("no = " + no);
    }
}
