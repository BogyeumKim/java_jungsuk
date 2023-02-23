import java.util.ArrayList;

public class Ex12_1_1 {
    public static void main(String[] args) {
        BOX1<Fruit1> fruit1BOX = new BOX1<Fruit1>();
        BOX1<Apple1> apple1BOX = new BOX1<Apple1>();
        BOX1<Toy> toyBOX = new BOX1<Toy>();
//        BOX1<Grap1> grap1BOX = new BOX1<Apple1>(); // 제네릭 포도에는 사과 못담음

        fruit1BOX.add(new Fruit1());
        fruit1BOX.add(new Apple1()); // 제네릭타입 Fruit지만 자손 apple , grape 가능

        apple1BOX.add(new Apple1());
        apple1BOX.add(new Apple1());
//        apple1BOX.add(new Toy()); // appleBox 제네릭타입이 Apple1이라 Toy는 불가

        toyBOX.add(new Toy());

        System.out.println(fruit1BOX);
        System.out.println(apple1BOX);
        System.out.println(toyBOX);
    }



}

class BOX1<T> {
    ArrayList<T> list = new ArrayList<>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    int size() {
        return list.size();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}

class Fruit1 {
    @Override
    public String toString() {
        return "Fruit1";
    }
}

class Apple1 extends Fruit1 {
    @Override
    public String toString() {
        return "Apple1";
    }
}

class Grap1 extends Fruit1 {
    @Override
    public String toString() {
        return "Grap1";
    }
}

class Toy {
    @Override
    public String toString() {
        return "Toy";
    }
}

