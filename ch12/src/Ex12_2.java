import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;



public class Ex12_2 {

	public static void main(String[] args) {
		
		HashMap<String, Student> map = new HashMap<>(); // JDK 1.7부터 생성자에 제네릭스 타입지정 생략가능
		map.put("김씨", new Student("김씨", 1, 1, 100, 100, 100));
		
		Student s = map.get("김씨");
		
		System.out.println(s.no);
		}
		
		
	}


class Student{
	String name ="";
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	
}
