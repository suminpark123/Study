package java0808;

public class Ex08_과제16번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 5; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print(" ");

			}
			for(int x= 0; x<=i; x++) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		

	}
}


