
class Time {
	private int hour; // 0 ~23 사이 값 가져야함 
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if ( isNotValidHour(hour)) return; // 알트 쉬프트 M 하면 if문 조건절을 따로 메서드로 뺄수있음.
		else  this.hour = hour;
	}

	private boolean isNotValidHour(int hour) { // 이 메서드는 Time class 안에서만 쓰니까 public이아닌 private로 해주자.
		return hour < 0 || hour > 23;
	}
	
	public int getHour() {
		return hour;
	}
}

public class TimeTest {

	public static void main(String[] args) {

		Time t = new Time();
//		t.hour = 100; // private 같은 클래스가 아니라 접근이불가능함.
		t.setHour(22);
		System.out.println(t.getHour());
		
		t.setHour(29);
		System.out.println(t.getHour()); // 위에 setHour 메서드에서 isNotValidHour 메서드에 걸려 this.hour = hour 까지 못가고 위에서 return되므로 값이 변경되지 않음.
		
	}

}
