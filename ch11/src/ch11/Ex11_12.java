package ch11;

import java.util.PriorityQueue;
import java.util.Queue;

public class Ex11_12 {
    public static void main(String[] args) {
        Queue pq = new PriorityQueue();
        pq.offer(3); // pq.offer(new Intger(3)) 오토박싱
        pq.add(1);
        pq.offer(5);
        pq.add(2);
        pq.offer(4);
        System.out.println(pq);

        Object obj = null;

        // PriorityQueqe에 저장된 요소 하나씩 꺼내기
        while ((obj = pq.poll()) != null) {
            System.out.println(obj);
        }

        /*
        * [1, 2, 5, 3, 4] // heap 자료구조에 의해 이렇게 출력됨.
            1
            2
            3
            4
            5*/
    }
}
