
public class Ex6_3 {
	
	public static void main(String args[]) {
				
		Card c = new Card();
		c.kind = "Heart";
		c.number = 7;
		
		Card c2 = new Card();
		c2.kind ="space";
		c2.number = 5;
		
		System.out.println("c kind ="+c.kind+" c number="+c.number);
		System.out.println("c2 kind ="+c2.kind+" c2 number="+c2.number);
		System.out.printf("%d,%d%n",Card.width,Card.height);
		
		System.out.println("///////////////////");
		
		c.kind = "aaaa";
		c2.kind = "bbbb";
		Card.height = 555;
		Card.width = 666;
		
		
		
		System.out.println("c kind ="+c.kind+" c number="+c.number);
		System.out.println("c2 kind ="+c2.kind+" c2 number="+c2.number);
		System.out.printf("%d,%d",Card.width,Card.height);
		
	}
		
	
}

class Card {
	
	String kind;
	int number;
	
	static int width = 100;
	static int height = 200;
	
	
}



