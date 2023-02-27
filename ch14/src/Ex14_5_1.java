import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex14_5_1 {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int)(Math.random() *100) +1; // Supplier 매개변수 없고 반환값 있음
        Consumer<Integer> c = i -> System.out.println(i + ", "); // Consumer 매개변수 있고 반환값 없음
        Predicate<Integer> p = i -> i % 2 == 0; // Predicate 조건식 표현하는데 사용. 매개변수는 하나 반환타입 bollean
        Function<Integer,Integer> f = i->i/10*10; // i의 일의자리를 없앰, 일반적인 함수

        List<Integer> list = new ArrayList<>();
        makeRandomList(s, list);
        System.out.println(list);

        printEvenNum(p, c, list);
        List<Integer> newList = doSomething(f, list);
        System.out.println(newList);
    }

    static <T> List<T> doSomething(Function<T, T> f, List<T> list) { // Function 일반적인 함수 apply 사용
        List<T> newList = new ArrayList<T>(list.size());

        for (T i : list) {
            newList.add(f.apply(i));
        }
        return newList;
    }

    static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) { // Predicate 조건식 표현하는데 사용. 매개변수는 하나 반환타입 bollean test사용
//         Consumer 매개변수 있고 반환값 없음 accept 사용
        System.out.print("[");
        for (T i : list) {
            if (p.test(i)) {
                c.accept(i);
            }
        }
        System.out.println("]");
    }

    static <T> void makeRandomList(Supplier<T> s, List<T> list) { // Supplier 매개변수 없고 반환값 있음 get사용
        for (int i = 0; i < 10; i++) {
            list.add(s.get());
        }
    }
}
