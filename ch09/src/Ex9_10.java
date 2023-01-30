
public class Ex9_10 {

	public static void main(String[] args) {
		 int iVal = 100;
		 String strVal = String.valueOf(iVal); // 속도 빠름
		 String strVal2 = iVal + ""; // 편리
		 
		 System.out.println(strVal.getClass().getName());
		 System.out.println(strVal2.getClass().getName());
		 
		 double sum = Integer.parseInt(strVal)+Double.parseDouble(strVal2); // 구버전
		 System.out.println(sum); // 숫자 변수는 getClass가 안먹힘 
		 
		 double sum2 = Integer.valueOf(strVal)+Double.valueOf(strVal2); // 신버전
		 System.out.println(sum2);
		 
		 // 문자열 결합
		 System.out.println(String.join("", strVal,"+",strVal2,"=")+sum); // join은 내부적 String Buffer를 사용해 속도 상승 
		 System.out.println(strVal+"+"+strVal2+"="+sum2); // 일반적인결합
		 
		 
	}

}
