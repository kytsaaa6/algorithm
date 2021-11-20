package kym.study.algorithm.doit.chap03;
// 이진 검색

import java.util.Scanner;

public class BinSearch {

    // 요솟수가 n인 배열 a에서 key와 같은 요소를 이진 검색합니다.
    static int binSearch(int a[], int n, int key) {
        int pl = 0;                     // 검색 범위의 첫 인덱스
        int pr = n-1;                   // 검색 범위의 끝 인덱스

        do {
            int pc = (pl + pr) / 2;     // 중앙요소의 인덱스
            if(a[pc]==key)
                return pc;              // 검색 성공!
            else if(a[pc] < key)
                pl = pc+1;              // 검색 범위를 뒤쪽 절반으로 좁힘
            else
                pr = pc-1;              // 검색 범위를 앞쪽 절반으로 좁힘
        } while(pl <= pr);

        return -1;                      // 검색 실패!
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int n = stdIn.nextInt();
        int[] x = new int[n];

        System.out.println("오름차순으로 입력하세요.");
        x[0] = stdIn.nextInt();

        for(int i=1; i<x.length; i++) {
            do {
                System.out.print("x["+i+"] : ");
                x[i] = stdIn.nextInt();
            } while (x[i] < x[i-1]);            // 바로 앞의 요소보다 작으면 다시 입력
        }

        System.out.print("검색할 키 값 : ");
        int ky = stdIn.nextInt();

        int idx = binSearch(x, n, ky);          // 배열 x에서 키 값이 ky인 요소를 탐색

        if(idx==-1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(ky+"은 x["+idx+"]에 있습니다.");

    }
}
