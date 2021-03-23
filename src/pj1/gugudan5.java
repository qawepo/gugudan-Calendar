package pj1;

import java.util.Scanner;

public class gugudan5 { //입력받은 줄씩 입력받은 단까지 입력받은 숫자만큼 곱해 출력하는 프로그램
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		

		
		System.out.println("몇단부터 출력할까요? (1 ~ 9)");
		int MINDAN = sc.nextInt();
		while(MINDAN < 1 || MINDAN > 9) {
			System.out.println("1 ~ 9의 수를 입력해주세요!");
			MINDAN = sc.nextInt();
		}
		//---------------------------------------------------------------
		
		System.out.println("몇단까지 출력할까요? (1 ~ 9)");
		int MAXDAN = sc.nextInt();
		while(MAXDAN < MINDAN) {
			System.out.println("처음 시작하는 단보다 작은 숫자는 입력할 수 없습니다. 재입력해주세요!");
			MAXDAN = sc.nextInt();
		}
		while(MAXDAN < 1 || MAXDAN > 9) {
			System.out.println("1 ~ 9의 수를 입력해주세요!");
			MAXDAN = sc.nextInt();
			while(MAXDAN < MINDAN) {
				System.out.println("처음 시작하는 단보다 작은 숫자는 입력할 수 없습니다. 재입력해주세요!");
				MAXDAN = sc.nextInt();
			}
		}
		//----------------------------------------------------------------
		
		System.out.println("몇까지 곱할까요? (1 ~ 9)");
		int MAXINT = sc.nextInt();
		while(MAXINT > 9 || MAXINT < 1) {
			System.out.println("1 ~ 9의 수를 입력해주세요!");
			MAXINT = sc.nextInt();
		}
		//----------------------------------------------------------------
		
		System.out.println("몇줄씩 출력할까요? (MAX 5)");
		int LINE = sc.nextInt();
		while(LINE > 5 || LINE < 1) {
			System.out.println("최대 5의 수를 입력해주세요!");
			LINE = sc.nextInt();
		}
		//----------------------여기까지 인수를 입력받는 코드----------------------


		//------------------------여기부터 출력하는 코드-------------------------
		for (int a = MINDAN; a <= MAXDAN; a+=LINE) {
			for (int i = 0; i < LINE; i++) {
				int dan = (a+i);
				
				if(dan > MAXDAN) 
					break;			
				System.out.print(" --" + dan + "단 출력--" + " \t");
			}
			System.out.println(" ");
			
			for (int i = 1; i < MAXINT+1; i++) {
				for (int j = 0; j < LINE; j++) {
					int dan = (a+j);
					
					if(dan > MAXDAN) 
						break; 
					System.out.print("ㅣ" + dan +" x " +i+ " = " +dan*i+ "ㅣ" + " \t");
				}
				System.out.println(" ");
			}
			System.out.println(" ");
		}
		sc.close();
	}
}
