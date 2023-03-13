package java0816알고리즘;

import java.util.Scanner;

public class ex14_알바펫2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("====알파벳 빈도수 구하기====");
		  System.out.print("입력>> ");
		  String eng = sc.next();      
		  char[] alphabet = new char[52];    
		  int[] count = new int[alphabet.length]; 
		
		  for (int i = 0 ; i < alphabet.length ; i++)
		  {
		   if (i < 26)
		    alphabet[i] = (char)(i + 65);  
		   else
		    alphabet[i] = (char)(i + 71); 
		  }
		  
		  for (int i = 0 ; i < eng.length() ; i++)  
		  {
		   for (int j = 0 ; j < alphabet.length ; j++)  
		   {
		    if (eng.charAt(i) == alphabet[j])  
		    {
		     count[j]++;        
		     break;
		    }
		   }
		  }
		   
		 // System.out.println("알파벳이 사용된 횟수를 출력합니다.");
		  for (int i = 0 ; i < alphabet.length ; i++)
		  {
		   System.out.println(alphabet[i] + " : " + count[i] );
		  }
		 }
		
	}


