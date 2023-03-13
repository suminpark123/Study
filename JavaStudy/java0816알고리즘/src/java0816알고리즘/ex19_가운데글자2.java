package java0816알고리즘;

public class ex19_가운데글자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getMiddle("power"));
	}

	private static String getMiddle(String s) {
		// TODO Auto-generated method stub		
		 String answer = "";
        
       
         if(s.length()%2==0) {
             answer = s.substring(s.length()/2-1, s.length()/2+1);
         } else {
             answer = s.substring(s.length()/2,s.length()/2+1);
         }
         
         return answer;
         
     }
}

		
		
		
		

