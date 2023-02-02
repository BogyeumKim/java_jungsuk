import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


class Fruit { 
	public String toString() {
		return "Fruit";
	}
}

class Apple extends Fruit{
	public String toString() {
		return "Apple";
	}
}

class Grape extends Fruit{
	public String toString() {
		return "Grape";
	}
}

class Juice{
	String name;	
	
	 Juice(String name) {
		this.name = name + "Jucie";
	}

	public String toString() {
		return name;
	}
}


class Juicer{
	static Juice makeJuice(FruitBox<? extends Fruit> box) { 
		String tmp = "";
		
		for(Fruit f : box.getList())
			tmp += f+ " ";
		return new Juice(tmp);
	}
	
	
}

class FruitBox<T extends Fruit> extends Box<T>{}

class Box<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item); }
	T get(int i) { return list.get(i); }
	ArrayList<T> getList() { return list; }
	int size() { return list.size(); }
	public String toString() { return list.toString(); }
	
}


public class Ex12_4 {

	public static void main(String[] args) {
			FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
			FruitBox<Apple> appletBox = new FruitBox<Apple>(); // Fruit 와 그 자손들 Apple , Grape
			
			fruitBox.add(new Apple());
			fruitBox.add(new Grape());
			appletBox.add(new Apple());
			appletBox.add(new Apple());
			
			System.out.println(Juicer.makeJuice(fruitBox));
			System.out.println(Juicer.makeJuice(appletBox)); // new FruitBox<Apple> 이라 40줄 제네릭스 Fruit에는 없지만 ? extends로 자손까지 받아서 가능 
			
			
		
		
		}
		
		
	}
	
