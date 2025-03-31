//Q4. 함수형 프로그래밍 활용하기 2
//다음 코드는 정수 배열에서 홀수를 골라 2 를 곱한 뒤, 저장하는 코드
//스트림의 filter와 map 메서드 활용하기
import java.util.Arrays;

public class Main4 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] result = Arrays.stream(numbers) // IntStream 생성한다
                .filter((a) -> a % 2 == 1) // 홀수만 취합한다
                .map((a) -> a * 2) // 각 항목에 2를 곱한다
                .toArray() // int[] 배열로 반환한다.
                ;
    }
}
