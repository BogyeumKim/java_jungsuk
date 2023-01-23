class Product2 {
	int price;
	int bonusPoint;
	
	Product2(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	Product2(){} // 기본생성자
}

class Tv2 extends Product2 {
	Tv2(){
		//조상 클래스의 생성자 Product(int price)를 호출한다.
		super(100); // Tv의 가격을 100만원으로 한다.
	}	

	public String toString() { return "TV"; }
}

class Computer2 extends Product2 {
	Computer2() { super(200); }
	public String toString() { return "Computer"; }
}

class Buyer2 {
	int money = 1000;
	int bonusPoint = 0;
	Product2[] cart = new Product2[10]; // 구매제품 담을 배열
	int i=0; // Product배열에 사용될 카운터
	
	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("잔액부족");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;
		System.out.println(p+"를 구매함");
	} // buy 끝
	
	void summary() { // 구매물품 정보 요약 메서드
		int sum=0;
		String itemList ="";
		
		// 반복문을 통해 물품의 총가격 목록 생성
		for ( int i=0; i<cart.length; i++) {
			if(cart[i] == null) break;
			sum += cart[i].price;
			itemList += cart[i]+",";
		}
		System.out.println("구매한 총금액은 "+sum);
		System.out.println("구매한 제품은 "+itemList);
	}
	
	
	
}


public class Ex7_9 {

	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		
		b.buy(new Tv2()); // Product p = new Tv1(); -> b.buy(p)
		b.buy(new Computer2());
		
		b.summary();
		
	}

}
