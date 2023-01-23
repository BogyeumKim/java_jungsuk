package pkg2;

import pkg1.MyParent;

class MyChild extends MyParent {
	public void printMembers() {
//		System.out.println(prv); // 같은 클래스가 아니라  불가
//		System.out.println(dft); // 같은 패키지가 아니라 불가
		System.out.println(prt); // 같은 패키지가 아니지만 자손클래스라 가능
		System.out.println(pub);
	}
}

public class MyParentTest2 {

	public static void main(String[] args) {
		MyParent p = new MyParent();
//		System.out.println(p.prv); // 같은 클래스가 아니라  불가
//		System.out.println(p.dft); // 같은 패키지가 아니라 불가
//		System.out.println(p.prt); // 같은 패키지가 아니고 자손아니라불가
		System.out.println(p.pub);
	}

}
