package P02_array;

public class ArrayCreateEx {

	public static void main(String[] args) {
		int[] scores;//[]은 배열
        scores = new int[] {83,90,87};
       //점수의 합계구하기
//       int sum =scores[0]+scores[1]+scores[2];
       
        //for 문
       int sum=0;
       for (int i=0; i<scores.length; i++) 
    	   sum += scores[i]; //sum =scores[i]
    	   System.out.println("총합"+sum);
    	   
      //int[] s1 = new int[] {83,90,97};//위의 int[] scores를 새로만들었다
      //int sum2= add(s1);//s1 - 배열의 주소값이 들어있음{83,90,97}   
       int sum2= add(new int[] {83,90,97});//s1 - 배열의 주소값이 들어있음{83,90,97}   
       System.out.println("총합"+sum2);
	}
	//static 메소드(RAM)
    public static int add(int[] scores) {
    int sum=0;
    for (int i=0; i<scores.length; i++) 
	   sum += scores[i]; //sum =scores[i]
     return sum; 
}
}