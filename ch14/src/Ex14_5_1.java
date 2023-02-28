import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Ex14_5_1 {
    public static void main(String[] args) {
        IntSupplier s = () -> (int)(Math.random() *100) +1;
        IntConsumer c = i -> System.out.println(i + ", ");
        IntPredicate p = i -> i % 2 == 0;
        IntUnaryOperator op = i->i/10*10;

        int[] list = new int[10];
        makeRandomList(s, list);
        System.out.println(Arrays.toString(list));

        printEvenNum(p, c, list);
        int[] newList = doSomething(op, list);
        System.out.println(Arrays.toString(newList));
    }

    static int[] doSomething(IntUnaryOperator s, int[] list) { // Function 일반적인 함수 apply 사용
        int[] newList = new int[list.length];

        for (int i = 0; i < newList.length; i++) {
            newList[i] = s.applyAsInt(list[i]); // IntUnaryOperator은 apply가 아니라 applyAsInt()
        }
        return newList;
    }

    static void printEvenNum(IntPredicate p, IntConsumer c, int[] list) { // Predicate 조건식 표현하는데 사용. 매개변수는 하나 반환타입 bollean test사용
//         Consumer 매개변수 있고 반환값 없음 accept 사용
        System.out.print("[");
        for (int i : list) {
            if (p.test(i)) {
                c.accept(i);
            }
        }
        System.out.println("]");
    }

    static void makeRandomList(IntSupplier s, int[] list) { // Supplier 매개변수 없고 반환값 있음 get사용
        for (int i = 0; i < 10; i++) {
            list[i] = s.getAsInt(); // IntSupplier는 get이 아니라 getAsInt()으로
        }
    }
}
