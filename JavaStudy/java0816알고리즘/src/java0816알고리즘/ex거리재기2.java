package java0816알고리즘;

public class ex거리재기2 {

	public static void main(String[] args) {
		int[] p = {92,32,52,9,81,2,68};
		int min = 0;
		int max = 0;
		int m = Math.abs(p[0]-p[1]);
		
		for (int i = 0; i < p.length; i++) {
			for (int j = i + 1 ; j < p.length; j++) {
				if (m > Math.abs(p[i]-p[j])) {
					min= i;
					max= j;
					m = Math.abs(p[i]-p[j]);
				}
			}
		}
		System.out.print("result = ["+min+", "+max+"]");
		
	}
}
