package p01.variable;

public class P80Ex04 {
	public static void main(String[] args) {
  int v1 = 0;//전역변수
  if(true) { //if(true)문일때는 무조건 함수실행
	  int v2 = 0;//지역변수
	  int v3 = 0;
	  if(true) {
//		  int v3= 0; 컴파일 오류 문장 상단으로 변수를 올렸다
		  v1 =1;
		  v2 =1;
		  v3 =1;
	  }
  v1 = v2+ v3;
  System.out.println(v1);
  }
	}
}