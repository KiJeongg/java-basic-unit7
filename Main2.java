//Q2.입력한 영문을 대문자로 변경하기
//영문을 입력하고 Enter 키를 누르면 입력한 영문을 대문자로 변경하여 출력하는 프로그램을 완성해 보자.
//단, 사용자가 ‘END’ 라는 문자열을 입력하기 전까지 반복해서 문장을 입력받을 수 있게 한다.


import java.util.Scanner;

public class Main2 {
        public static void main(String[] args) {
            while(true) {
                Scanner sc = new Scanner(System.in);
                System.out.print("영어 문장을 입력하세요 : ");
                String a = sc.nextLine();
                if("END".equals(a)) {
                    break;
                }
                    System.out.println(a.toUpperCase());
            }
        }
}
