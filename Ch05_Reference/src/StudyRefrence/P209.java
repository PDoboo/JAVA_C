package StudyRefrence;

public class P209 {

	public static void main(String[] args) {
	if(args.length !=2) { //!=같지않다를 의미하는 비교연산자 !=입력된데이터 개수가 2개가 아닌게맞지!(true면 실행됨)
		System.out.println("값의 수가 부족합니다");
		System.exit(0);//프로그램 강제종료
	}
    String strNum1 = args[0];//첫번째 데이터
    String strNum2 = args[1];//두번째 데이터
    int num1 = Integer.parseInt(strNum1);//문자열을 정수로 변환함
    int num2 = Integer.parseInt(strNum2);
    
    int result = num1+num2;
    System.out.println(num1+"+"+num2+"="+result);
    
    
	}

}
