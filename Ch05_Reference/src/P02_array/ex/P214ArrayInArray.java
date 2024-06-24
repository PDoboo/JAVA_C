package P02_array.ex;

public class P214ArrayInArray {

	public static void main(String[] args) {
		int[][] mathScores = new int[2][3]; //2행3열
		for(int i=0; i<mathScores.length; i++) {
			for(int k=0; k<mathScores[i].length; k++) {
				System.out.println("mathScores["+i+"]["+k+"]="+mathScores[i][k]);
			}
		}
 System.out.println();
  int[][]englishScores = new int[2][];
  englishScores[0] = new int[2];
  englishScores[1] = new int[3];
  for(int i=0; i<englishScores.length; i++) {
	  for(int k=0; k<englishScores[i].length; k++) {
		  System.out.println("englishScores["+i+"]["+k+"]="+englishScores[i][k]);
	  }
  }
  System.out.println();
  
	int[][] javaScores= {{95,80},{92,96,80}};//
	for(int i=0; i<javaScores.length; i++) // 바깥쪽 반복문,배열의 각 행을 순회 {95,80}의 행 순회 0에서1까지반복
	for(int k=0; k<javaScores[i].length; k++) { // 안쪽 반복문,현재 행의 열을 순회 {92,96,80}의 열 순회.각 행의 길이에 따라 k는 다르게 반복.
		System.out.println("javaScores["+i+"]["+k+"]="+javaScores[i][k]);// 현재 i와 k 인덱스의 배열 요소를 출력합니다.
		//javaScores[0][0]=95 0행0열
		//javaScores[0][1]=80 0행1혈
		//javaScores[1][0]=92 1행0열
		//javaScores[1][1]=96 2행1열
		//javaScores[1][2]=80 3행2열

	}
	}
}
