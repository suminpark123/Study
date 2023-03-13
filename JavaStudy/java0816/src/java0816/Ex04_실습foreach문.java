package java0816;

public class Ex04_실습foreach문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {7,2,3,4,5,33};
		int x =0;
		
		for(int i : arr ) {
			if(i%2==1) {
				System.out.print(i+" ");
				x++;
				
			}
			
		}System.out.print(x+"개");

	}

}
