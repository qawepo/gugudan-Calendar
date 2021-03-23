package pj1;

public class GugudanMethod3 {
	public void ms1(int x){
		for (int i = 2; i <= x; i++) {
			for (int j = 1; j <= x; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
			System.out.println("");
		}
	}
	
	public void ms1(int x, int y) {
		for (int i = 2; i <= x; i++) {
			for (int j = 1; j <= y; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
			System.out.println("");
		}
	}
}
