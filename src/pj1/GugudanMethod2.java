package pj1;

public class GugudanMethod2 {
	public int[] calculate(int times) {
		int[] result = new int[9];
		for (int i = 0; i < result.length; i++) {
			result[i] = times * (i+1);
		}
		return result;
	}
	
	public void printg(int[] arr, int x) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(x + " x " + (i+1) + " = " + arr[i]);
		}
	}
}
