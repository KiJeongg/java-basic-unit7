//Q1. 입력한 숫자의 합 구하기
// nextInt 메서드를 사용해 두개의 숫자를 받아 그 합을 출력해보기


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력하세요");
        int first = sc.nextInt();
        System.out.printf("두번째 숫자를 입력하세요");
        int second = sc.nextInt();

        int result = first + second;
        System.out.printf("%d + %d = %d 입니다.%n", first, second, result);

    }
}