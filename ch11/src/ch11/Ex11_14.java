package ch11;

import java.util.ArrayList;
import java.util.ListIterator;

public class Ex11_14 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        ListIterator it = list.listIterator();

        while (it.hasNext()) {
            System.out.println(it.next()); // 순방향
        }
        System.out.println();

        while (it.hasPrevious()) {  // hasNext를 또 쓰려면 it = list.listIterator();  선언 다시해주자.
            System.out.println(it.previous()); // 역방향
        }
    }
}
