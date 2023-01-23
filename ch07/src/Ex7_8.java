class Product {
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv1 extends Product {
	Tv1(){
		//조상 클래스의 생성자 Product(int price)를 호출한다.
		super(100); // Tv의 가격을 100만원으로 한다.
	}	

	public String toString() { return "TV"; }
}

class Computer extends Product {
	Computer() { super(200); }
	public String toString() { return "Computer"; }
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액 부족");
			return;
		}
		else {
			money -= p.price;
			bonusPoint += p.bonusPoint;
			System.out.println(p+"를 구입했습니다.");
		}
		
	} // buy 끝
	
	
}


public class Ex7_8 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv1()); // Product p = new Tv1(); -> b.buy(p)
		b.buy(new Computer());
		
		System.out.println("현재 남은돈은 " + b.money);
		System.out.println("현재 보너스포인트는 "+ b.bonusPoint);
	}

}
