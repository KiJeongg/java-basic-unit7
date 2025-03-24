//Q3. 오류 수정하기
//파일을 쓰거나 읽은 후에는 반드시 close 메서드로 파일 처리를 종료해야 한다.


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("Sample.txt");
        fw.write("write once, run anywhere");
        fw.close(); // 파일 종료처리 해줘야함

        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        String line = br.readLine();
        System.out.println(line);
        br.close(); // 파일 종료처리 해줘야함
    }

}
