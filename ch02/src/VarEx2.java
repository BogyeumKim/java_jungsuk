
public class VarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=2 , y=4;
		int tmp;
		
		tmp = x; // tmp = 2
		x = y; // x = 4
		y = tmp; // y = tmp(2)
		
		System.out.println("x="+x);
		System.out.println("y="+y);

	}
}
