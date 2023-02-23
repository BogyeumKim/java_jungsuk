import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Fruit4 {
    String name;
    int weight;

    public Fruit4(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name+"("+weight+")";
    }
}

class Apple4 extends Fruit4 {
    public Apple4(String name, int weight) {
        super(name, weight);
    }
}

class Grape4 extends Fruit4 {
    public Grape4(String name, int weight) {
        super(name, weight);
    }
}

class AppleComp implements Comparator<Apple4> { // sort를 쓰기위하여 Comprator 인터페이스를 상속받아와서 필수 메서드를 구현해야함
    @Override
    public int compare(Apple4 o1, Apple4 o2) {
        return o2.weight - o1.weight;
    }
}

class GrapeComp implements Comparator<Grape4> {
    @Override
    public int compare(Grape4 o1, Grape4 o2) {
        return o2.weight - o1.weight;
    }
}

class FruitComp implements Comparator<Fruit4> {

    @Override
    public int compare(Fruit4 o1, Fruit4 o2) {
        return o1.weight-o2.weight;
    }
}

class FruitBox4<T extends Fruit4> extends BOX4<T>{}
class BOX4<T> {
    ArrayList<T> list = new ArrayList<>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    ArrayList<T> getList() {
        return list;
    }

    int size() {
        return list.size();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}

public class Ex12_4_4 {
    public static void main(String[] args) {
        FruitBox4<Apple4> apple4FruitBox4 = new FruitBox4<>();
        FruitBox4<Grape4> grape4FruitBox4 = new FruitBox4<>();

        apple4FruitBox4.add(new Apple4("GreenApple", 300));
        apple4FruitBox4.add(new Apple4("GreenApple", 100));
        apple4FruitBox4.add(new Apple4("GreenApple", 200));

        grape4FruitBox4.add(new Grape4("GreenGrap", 400));
        grape4FruitBox4.add(new Grape4("GreenGrap", 300));
        grape4FruitBox4.add(new Grape4("GreenGrap", 200));

        Collections.sort(apple4FruitBox4.getList(),new AppleComp()); // 기존 sort가아닌 Comparator을 구현해야하는 sort임
        Collections.sort(grape4FruitBox4.getList(),new GrapeComp());
        System.out.println(apple4FruitBox4);
        System.out.println(grape4FruitBox4);
        System.out.println();

        Collections.sort(apple4FruitBox4.getList(),new FruitComp());
        // 위에처럼 AlleComp , GrapeComp을 따로 생성하는것보다 FruitComp이라는 클래스로 묶어서 관리하자
        // 물론 묶어서 관리하려면 인터페이스 제네릭스는 애플과 그레이프의 조상이 되어야한다.
        // sort 들어가서보면 super(조상)을 제네릭스에 둬야함 public static <T> void sort(List<T> list, Comparator<? super T> c) { ~ }
        Collections.sort(grape4FruitBox4.getList(),new FruitComp());
        System.out.println(apple4FruitBox4);
        System.out.println(grape4FruitBox4);

    }

}