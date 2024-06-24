package StudyRefrence;

public class P202ArrayCreate {

	public static void main(String[] args) {
	//값 목록으로 배열 생성 
		int []scores = {83,90,87};
		System.out.println("scores[0]:"+scores[0]);
		System.out.println("scores[1]:"+scores[1]);
		System.out.println("scores[2]:"+scores[2]);
		//총합
		int sum = 0;
		for(int i=0; i<3; i++) {//i는 []안의 배열숫자값 
			sum += scores[i];//sum = sum + scores[i]; 축약형
		}
         System.out.println("총합:"+sum);
         //평균
         double avg = (double)sum /3;
         System.out.println("평균:"+avg);
	}

}
