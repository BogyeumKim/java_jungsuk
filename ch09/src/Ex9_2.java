class Person{
	long id;
	
	Person(long id){
		this.id= id;
	}
	
	
	public boolean equals(Object obj) {
		
		Person p = (Person)obj;
		
		if(obj instanceof Person) {
			return this.id ==p.id;
		}
		else return false;
	}
	
	
}

public class Ex9_2 {

	public static void main(String[] args) {
		Person p1 = new Person(123456789L);
		Person p2 = new Person(123456789L);
		
		if(p1.equals(p2)) System.out.println("같은사람");
		else System.out.println("다른사람");
	}

}


