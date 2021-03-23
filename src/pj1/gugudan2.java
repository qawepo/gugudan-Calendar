package pj1;

import java.util.Scanner;

public class gugudan2 { // 사용자에게 입력받은 숫자부터 숫자까지의 단을 출력하는 프로그램

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇단부터 출력할지 입력하세요");
		int x = sc.nextInt();
		System.out.println("몇단까지 출력할지 입력하세요");
		int y = sc.nextInt();
		
		for (int i = x; i <= y; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "X" + j + " = " + i*j + " / ");
			}
			System.out.println(" ");
		}
		sc.close();
	}
}
