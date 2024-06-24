package StudyRefrence;

public class P204ArrayCreateEx {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83,90,87};//배열생성
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 +=scores[i];//sum1 = sum1 + scores[i]; 축약형
			//i가0이면 83,i증가할수록2는90,3은87
		}
           System.out.println("총합:"+sum1);
           
           int sum2 = add(new int[] {83,90,87});//add가(new int[] {83,90,87}) sum2
           System.out.println("총합:"+sum2);
           System.out.println();
	}
      public static int add(int[]scores) {
    	  int sum  =0;
    	  for (int i=0; i<3; i++) {
    		  sum +=scores[i];
    	  }
      return sum;
}
}