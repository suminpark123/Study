package java0819;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ex01중복제거 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("==GameStart==");
		int[] randomArray = createRandomNumber(3);
		System.out.println(Arrays.toString(randomArray));
		int[] inputArray = new int[3];
		
		while(true) {
		for(int j = 0; j < inputArray.length; j++) {
			System.out.print(j+1+"번째 숫자 입력 : ");
			inputArray[j] = sc.nextInt();
		}
		
		 int[] sb =strikeBallCounting(randomArray,inputArray );
			System.out.print("strike : "+sb[0]);
			System.out.print("               ");
			System.out.print("ball : "+sb[1]+"\n");
			if(sb[0]==3) {
				System.out.println("게임종료");
				break;
			}
		}
		
		
		
		
		
	}
	
	
	private static int[] createRandomNumber(int length) {
		// TODO Auto-generated method stub
		Random rd=new Random();
		
		int[] array2=new int[length];
		
	
			//System.out.print(aa[i]+" ");
		
		for(int i=0; i<array2.length; i++) {
			array2[i]=rd.nextInt(50)+1;
		
		}
		for(int i=0; i<array2.length-1; i++) {
			for(int j=i+1; j<array2.length; j++) {
			if(array2[i]==array2[j]) {
				i--;
				
			}
		}
		}
		return array2;
	}

	
	
	private static boolean cc(int[] array) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<array.length-1; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i]==array[j]) {
				return true;
				}
			}
		}
		
		
		
		
		return false;
	}

	private static int[] strikeBallCounting(int[] array1, int[] array2) {
		// TODO Auto-generated method stub

		int[] sb = new int[2];


		for (int i = 0; i < array1.length; i++) {
			for (int k = 0; k < array2.length; k++) {
				if (array1[i] == array2[k]) {
					if(i==k) {
						sb[0]++;
					}else {
						sb[1]++;
						
					}
				}
			}
		}

		return sb;

	}
	
	
	
	
	
}
