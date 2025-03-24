//Q4. 사용자의 입력을 파일에 저장하기
//사용자의 입력을 sample.txt 파일에 저장하는 프로그램을 작성해 보자.
// 단, 프로그램을 다시 실행하더라 기존에 작성한 내용을 유지하고 새로 입력한 내용을 추가해야 한다.
// FileWriter 써보기



import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("sample.txt",true);
        System.out.print("문장을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        fw.write(String.format("%s%n", line));
        fw.close();
}
}
