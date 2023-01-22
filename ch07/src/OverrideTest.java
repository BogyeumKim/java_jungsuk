class Point3 {
	int x;
	int y;
	String getLocation() {
		return "x:"+x+",y:"+y;
	}
	
	public String toString() {
		return "xxxx : "+x+"yyyy :"+y;
	}
	
}

class Point3D2 extends Point3 {
	int z;
	
	// 조상 getLocation 함수 오버라이딩
	String getLocation() {
		return "x:"+x+",y:"+y+",z :"+z;
	}
	
	Point3D2(int x, int y) {
		this.x = x;
		this.y = y;
	}
}


public class OverrideTest {

	public static void main(String[] args) {

		Point3D2 p = new Point3D2(3,5);
//		p.x = 3;
//		p.y = 5;
		p.z = 7;
		System.out.println(p.getLocation());
		
		Point3 p2 = new Point3();
		System.out.println(p2.toString());
		System.out.println(p2);
		
		
	}

}
