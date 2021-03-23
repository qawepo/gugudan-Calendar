package pj1;

import java.util.Scanner;

public class Sum1 {
	public static void main(String[] args) {
		//두수의 입력을 받고 더하기
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		String s1,s2;
		System.out.println("두 수를 입력헤주세요");
		s1 = sc.next();
		s2 = sc.next();
		
//		System.out.println(s1 + ", " + s2);
		
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		System.out.println("두 수의 합은 " + (a+b) + "입니다");
		
//		a = sc.nextInt();
//		b = sc.nextInt();
		
	sc.close();}
}
