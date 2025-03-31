//Q3.함수형 프로그래밍을 사용하여 다음 정수 배열에서 음수를 모두 제거하는 프로그램을 만들기
//filter 메서드 사용하기

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        int[] numbers = {1, -2, 3, -5, 8, -3};
        int[] result = Arrays.stream(numbers) // IntStream  생성
                .filter((a) ->a >=0)  // 음수를 제거
                    .toArray() // int[] 배열로 반환
        ;
    }
}
