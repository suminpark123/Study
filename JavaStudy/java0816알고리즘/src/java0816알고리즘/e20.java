package java0816알고리즘;

public class e20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] point = {92,32,52,9,81,2,68};
		
		int min =0;
		int max =0;
		
		int n= Math.abs(point[0]-point[1]);
		
		for(int i=0; i<point.length; i++) {
			for(int j=i+1; j<point.length; j++) {
				if(n>Math.abs(point[i]-point[j])) {
				min = i;
				max = j;
				n=Math.abs(point[i]-point[j]);
				}
			}
		}System.out.print("result = "+min+max);
		
		
		
		
		
		
	}

}
