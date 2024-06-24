package P02_array;

//행,열 - 수학:1행2행 1열2열
//     컴퓨터:0행,1행,0열,1열
public class ArrayinEx {

	public static void main(String[] args) {
		//2,3 위아래 열 가로는 행- 1행 2열 
		//4,5
     int math0 = 2; //기본형
     
     //1차원배열
     int[]math1 = new int[2]; //배열만들기[배열의 개수를 넣음];
     math1[0] = 10;
     math1[1] = 20;
     System.out.println(math1[0]);
     
   //2차원배열
     int[][]math2 = new int[2][2]; //배열만들기[배열의 개수를 넣음]; [][]두개를만들면 2차원 배열. 2행 2열
     //첫번째 행(10,20) 두번째 행(30,40)입력 
     math2[0][0] = 10;//0행1열 10
     math2[0][1] = 20;//0행2열 20
     math2[1][0] = 30;//0행1열 30
     math2[1][1] = 40;//1행2열 40
     System.out.println(math2[0][0]);//10
     
   //2차원배열 2
     int[][]math3 = new int[2][3]; //배열만들기[배열의 개수를 넣음]; [][]두개를만들면 2차원 배열. 2행 3열
     //첫번째 행(10,20,50) 두번째 행(30,40,60)입력 
     math3[0][0] = 10;//0행0열 10
     math3[0][1] = 20;//0행1열 20
     math3[0][2] = 50;//0행2열 50
     math3[1][0] = 30;//1행0열 30
     math3[1][1] = 40;//1행1열 40
     math3[1][2] = 60;//1행2열 60
     System.out.println(math3[1][0]);
     
   //2차원배열 3-for 사용 출력
//     int[][]math4 = new int[2][3];//배열만들기[배열의 개수를 넣음]; [][]두개를만들면 2차원 배열. 2행 3열
     int[][]math4 = {{10,20,50},{30,40,50}};//2행3열 1행{10,20,50} 2행{30,40,50}
     System.out.println("math4.length:"+math4.length);
     //첫번째 행(10,20,50) 두번째 행(30,40,60)입력 
       for(int i=0; i<math4.length; i++) { //i가0(첫번째행)일때 k는=10,20,50 수행 i가1(두번째행)일때 k=10,20,50수행함
    	 for(int k=0; k<math4[i].length; k++) 
    		 System.out.println("math4["+i+"]["+k+"]="+math4[i][k]);
     }
      //2차원 배열 4
      //int[][]math4 = new int[2][];//배열만들기[배열의 개수를 넣음]; [2][]열은없고 행만 2행있음
      int[][]math5 = {{10,20},{30,40,60}};//2행3열 1행{10,20,50} 2행{30,40,50}
      //math5[0] = new int[2]; //1행에 열이2개 
      //math5[1] = new int[3]; //2행에 열이3개 
      System.out.println("math5.length:"+math5.length);
       //첫번째 행(10,20,50) 두번째 행(30,40,60)입력 
         for(int i=0; i<math5.length; i++) { //i가0(첫번째행)일때 k는=10,20 수행 i가1(두번째행)일때 k=30,40,60수행함
      	 for(int k=0; k<math5[i].length; k++) 
      		 System.out.println("math5["+i+"]["+k+"]="+math5[i][k]);
	}

}
}