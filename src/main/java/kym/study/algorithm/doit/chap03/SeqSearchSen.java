package kym.study.algorithm.doit.chap03;

import java.util.Scanner;

// 선형 검색 (보초법)
public class SeqSearchSen {
    // 요솟수가 n인 배열 a에서 key와 같은 요소를 보초법으로 선형 검색합니다.
    static int seqSearchSen(int[] a, int n, int key) {

        int i = 0;

        a[n] = key;

        while(true) {
            if(a[i]==key)
                break;
            i++;
        }
        return i==n ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int n = stdIn.nextInt();
        int[] x = new int[n+1];             // 요솟수 num + 1

        for(int i=0; i<n; i++) {
            System.out.print("x["+i+"] : ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색할 값 : ");
        int ky = stdIn.nextInt();

        int idx = seqSearchSen(x,n,ky);    // 배열 x에서 키 값이 ky인 요소를 탐색

        if(idx==-1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(ky+"은 x["+idx+"]에 있습니다.");
    }
}
