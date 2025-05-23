//Q2. 스레드 적용하기

import java.util.ArrayList;
import java.util.TreeMap;

class HeavyWork implements Runnable {
    String name;

    HeavyWork(String name) {
        this.name = name;
    }
     @Override
     public void run() {
        work();
     }
    public void work() {
        for (int i=0; i<5; i++) {
            try {
                Thread.sleep(100);
            }   catch (Exception e) {
            }
        }
        System.out.printf("%s done.%n", this.name);
    }
}

public class Main2 {
    public static void main(String[] args) throws  InterruptedException {
        long start = System.currentTimeMillis();
        ArrayList<Thread> threads = new ArrayList<>(); //스레드를 저장할 리스트 생성
        for(int i=1; i<5; i++) {
           Thread t = new Thread(new HeavyWork("w"+i));
           threads.add(t);
           t.start();
        }
        for (Thread t : threads) {
            t.join(); // 저장한 스레드가 종료될때까지 대기한다.
        }
            long end = System.currentTimeMillis();
            System.out.printf("elapsed time:%s ms\n", end - start);
    }


}
