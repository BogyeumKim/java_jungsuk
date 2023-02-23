import java.util.ArrayList;

public class Ex12_2_2 {
    public static void main(String[] args) {
        FruitBox2<Fruit2> fruitBox2 = new FruitBox2<Fruit2>();
        FruitBox2<Apple2> apple2FruitBox2 = new FruitBox2<Apple2>();
        FruitBox2<Grap2> grap2FruitBox2 = new FruitBox2<Grap2>();
//        FruitBox2<Grap2> grap2FruitBox21 = new FruitBox2<Apple2>();

        fruitBox2.add(new Fruit2());
        fruitBox2.add(new Apple2());
        fruitBox2.add(new Grap2());
        apple2FruitBox2.add(new Apple2());
//        apple2FruitBox2.add(new Grap2()); // 애플박스에 포도 불가
        grap2FruitBox2.add(new Grap2());
//        grap2FruitBox2.add(new Apple2()); // 포도박스에 애플 불가

        System.out.println("fruitBox-" + fruitBox2);
        System.out.println("appleBox-" + apple2FruitBox2);
        System.out.println("grapeBox-" + grap2FruitBox2);
    }
}

interface Eatable{}
class Fruit2 implements Eatable {
    @Override
    public String toString() {
        return "Fruit1";
    }
}

class Apple2 extends Fruit2 {
    @Override
    public String toString() {
        return "Apple1";
    }
}

class Grap2 extends Fruit2 {
    @Override
    public String toString() {
        return "Grap1";
    }
}

class FruitBox2<T extends Fruit2 & Eatable> extends BOX2<T> {}
class BOX2<T> {
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
