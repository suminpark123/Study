package java0818;

public class ex03_완전수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int[] array = { 2, 7, 3, 5, 4,4};
			boolean check = isDuplicate(array);
			System.out.println(check);
		}


		public static boolean isDuplicate(int[] a) {
			boolean b = false;
			for (int i = 0; i < a.length; i++) {
				for (int j = i+1; j<a.length; j++) {// <?
					if (a[i] == a[j]) {
						b = true;
					}
				}
			}
			return b;
		}
	}
		
		
		
		
		
 
 


//완전수 약수의합에서 자신을뺀후 자신과 같은경우