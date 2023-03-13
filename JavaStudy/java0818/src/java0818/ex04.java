package java0818;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] arr = {2,7,3,5,6};
		boolean ck = isdup(arr);
		System.out.println(ck);
	}

	
	
	public static boolean isdup(int[] b) {
		boolean a= false;
		
		for(int i =0; i<b.length; i++) {
			for(int j =i+1 ; j<b.length; j++) {
				if(b[i]==b[j]) {
					a=true;
				}
				
			}
		}return a;
		
		
	}
}
