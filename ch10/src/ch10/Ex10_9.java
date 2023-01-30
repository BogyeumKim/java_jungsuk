package ch10;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex10_9 {

	public static void main(String[] args) {
		 
		DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			Date d = df.parse("2023년 01월 30일"); // 문자열을 parse를 통해 날짜로
			System.out.println(d);
			System.out.println(df2.format(d)); // 날짜를 format을 통해 문자열로
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
