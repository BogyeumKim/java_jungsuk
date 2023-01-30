package ch10;

import java.text.DecimalFormat;

public class Ex10_7 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#.###E0");
		
		try {
//			System.out.println(Double.parseDouble("1,234,567.89")); 숫자형식 parse에서는 콤마가 포함된 문자열을 숫자로 변환 분가
//			Number num = df.parse("1,234,567.89"); 숫자형식 parse에서는 콤마가 포함된 문자열을 숫자로 변환 분가
			
			System.out.println(Double.parseDouble("1234567.89"));
			Number num = df.parse("1234567.89");
			
			System.out.println("1,234,567,89" + "->");
			
			double d = num.doubleValue() ; 
			System.out.println(d + " -> ");
			
			System.out.println(df2.format(num)); // 숫자 -> 형식으로
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
