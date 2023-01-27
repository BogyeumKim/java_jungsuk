

import java.util.Objects;

class Card{
	String kind;
	int number;
	
	Card(){
		this("SPADE",1);
	}
	Card(String kind, int number){
		this.kind=kind;
		this.number= number;
	}
	
	// equals()를 오버라이딩하면 hashCode()도 오버라이딩 해야함.
	public int hasCode() {
		return Objects.hash(kind,number);
	}
	
	
	 public boolean equals(Object obj) {
		 if(!(obj instanceof Card)) return false;
		 
		 Card c = (Card)obj;
		 return this.kind.equals(c.kind) && this.number == c.number;
	 }
	
	public String toString() {
		return "kind:"+kind+", number:"+number;
	}
}

public class Ex9_4 {

	public static void main(String[] args) {
		
		Card c1= new Card();
		Card c2 = new Card();
		
		System.out.println(c1.equals(c2)); // equals가 true면 hascode도 true 여기서는 equals를 오버라이딩으로 형변환시켜서 true지만 기존 equals로는 주소값이 달라 false나옴 
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		System.out.println(c1.hasCode());
		System.out.println(c2.hasCode());
	}

}
