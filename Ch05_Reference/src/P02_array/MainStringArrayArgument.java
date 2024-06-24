package P02_array;

public class MainStringArrayArgument {

	public static void main(String[] args) {//문자열 "10" "20"
	 if(args.length !=2) { //입력된 개수가 2개가 아님!true면 "String개수가 부족"출력 
      System.out.println("String개수가 부족");		 
       System.exit(0);//시스템 정상종료 명령어 
	}
	 	
	 //+연산 문자열 출력
	 System.out.println(args[0]+args[1]);
    try {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		 System.out.println(num1+num2);
	} catch (NumberFormatException e) {
		System.out.println("입력된 숫자형 문자가 아니기 때문에 예외");//예외처리하는방법
		//위쪽의 int num1~2 시스템 내용을 드래그 후 마우스 우클릭 하면 서라운드 위드 에서 try catch 블록 클릭 하면 catch 생김
	}
    System.out.println("다음내용으로 진행하기");
		
	 
    //매개값주고 실행하기 해당 class에서 마우스 우클릭 Run->Run Configurations->main class->Arugment에 입력값 주고 어레이 후 실헹
}
}
