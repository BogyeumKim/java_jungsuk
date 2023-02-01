package ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Ex11_11 {
	
	public static void main(String[] args) {

		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc"); // 중복이라 저장안됨 
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		
		System.out.println(set); // David는 2번나옴 equals()와 hashCode()를 오버라이딩 해야함. 39~48줄
		
	}
}

class Person{
	String name;
	int age;
	
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name,age);
	}

	@Override
	public boolean equals(Object obj) {
	if(!(obj instanceof Person)) return false;
	Person p = (Person) obj;
	
		return this.name.contentEquals(p.name) && this.age == p.age; // 원래 this.name equals obj.name(매개변수)인데 obj에는 name이 없으니까 다운캐스팅 해준다.
	}
	
	
	
}
