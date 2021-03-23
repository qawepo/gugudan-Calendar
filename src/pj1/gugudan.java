package pj1;

import java.util.Scanner;

public class gugudan { // 사용자에게 입력받은 단을 출력하는 프로그램

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몇단을 출력할까요");
		int x = sc.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(x + " x " + i + " = " + x*i );
		}
		sc.close();
	}
}
