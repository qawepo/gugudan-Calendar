package pj1;

public class GugudanEx2 {
	public static void main(String[] args) {
		GugudanMethod2 gm2 = new GugudanMethod2();
		
		for (int i = 2; i < 10; i++) {
			System.out.println("----"+ i + "단----");
			int[] result = gm2.calculate(i);
			gm2.printg(result,i);
			System.out.println("");
		}
	}
}
