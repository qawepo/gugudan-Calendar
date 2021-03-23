package pj1;

import java.util.Scanner;

public class GugudanEx3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GugudanMethod3 gm3 = new GugudanMethod3();
		
		System.out.println("1번: 값을 입력하세요.");
		int x = sc.nextInt();
		
		gm3.ms1(x);
		
		System.out.println("2번: 두개의 값을 입력하세요.");
		System.out.println("몇단까지 출력할까요: ");
		int y = sc.nextInt();
		while(y<2) {
			System.out.println("최소 2단이상부터 가능합니다. 재입력하세요!: ");
			y = sc.nextInt();
		}
		System.out.println("몇단까지 곱할까요: ");
		int z = sc.nextInt();

		gm3.ms1(y, z);
		
	sc.close();}
}
