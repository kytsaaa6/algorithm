package kym.study.algorithm.doit.chap03;
// 제네릭 클래스의 예
public class GenericClassTester {
    // 제네릭 클래스의 파리미터를 T라고 작성합니다.
    static class GenericClass<T> {
        private T xyz;
        GenericClass(T t) {     // 생성자
            this.xyz = t;
        }

        T getXyz() {            // xyz 반환
            return xyz;
        }
    }

    public static void main(String[] args) {
        GenericClass<String> s = new GenericClass<String>("ABC");
        GenericClass<Integer> n = new GenericClass<Integer>(15);

        System.out.println(s.getXyz());
        System.out.println(n.getXyz());

    }
}
