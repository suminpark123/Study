package java0817;

public class ex06이차원예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr= new int[5][5];
		
		int x=21;	
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[j][i]=x++;
			}
		//	System.out.println();
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
				}
		
		
	}

}
