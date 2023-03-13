package java0824;

public class sdaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //[1] 입력
        int[] score = {90,87,100, 95, 80};
        int[] rank = {1,1,1,1,1};
           
        //[2] 처리
                       
        for(int i=0; i<score.length; i++){
            rank[i] = 1; 
           
            for (int j = 0; j < score.length; j++) {                        
                if(score[i]<score[j]){   
                    rank[i]++;              
                }              
            }          
        }      
       
        //[3] 출력
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]+"점 : "+rank[i]+"등");           
        }
    }

}
	


