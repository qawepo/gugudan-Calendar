package pj1;

import java.util.Scanner;

public class gugudan3 { // 구구단2 와 동일하나 최소/최대 단이 정해진 프로그램
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int MAXDAN = 9;
		final int MAXINT = 9;
		final int MININT = 2;
		
		System.out.println("몇단부터 출력할까요? (최소 2)");
		int x = sc.nextInt();
		while(x < MININT) {
			System.out.println("2단 이상으로 입력하세요!");
			x = sc.nextInt();
		}
		
		System.out.println("몇단까지 출력할까요? (최대 9)");
		int y = sc.nextInt();
		while(y > MAXDAN) {
			System.out.println("9단 이하로 입력하세요!");
			y = sc.nextInt();
		}
		
		for (int i = x; i <= y; i++) {
			System.out.println("  --" + i + "단 출력--");
			for (int j = 1; j <= MAXINT; j++) {
				System.out.println("ㅣ " + i + " x " + j + " = " + i*j + " ㅣ");	
			}
			System.out.println(" ");
		}
		sc.close();
	}
}
