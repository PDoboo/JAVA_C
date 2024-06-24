package StudyRefrence;

public class P208ArrayLengthEx {

	public static void main(String[] args) {
		//length는 배열의 길이, 즉 배열에 포함된 요소의 개수를 의미합니다. 
		//자바에서 배열은 고정된 크기를 가지며, 배열을 선언할 때 그 크기가 결정됩니다. 
		//length 속성을 사용하면 배열의 크기를 쉽게 알 수 있습니다. 
       int[]scores = {83,90,87};
       int sum = 0;
       for(int i=0; i<scores.length; i++) {//i가<scores의.lenth개수보다작으면 i++증가
    	   sum += scores[i]; // sum = sum+scores[i]축약
       }
       System.out.println("총합:"+sum);
       double avg = (double)sum /scores.length; //scores의length갯수로 나눔[3개니3으로나눔]
       System.out.println("평균:"+avg);
	}

}
