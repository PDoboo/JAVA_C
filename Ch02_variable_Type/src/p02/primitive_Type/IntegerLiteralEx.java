package p02.primitive_Type;


public class IntegerLiteralEx {
 //Type - primitive(기본형ch02-2),reference(참조형:ch05)
//	type variable = literial 
	int      a    =   2000000000; //전역변수이면서,인스턴스변수를 사용하려면 객체생성
	//int 타입은 소수점은 사용안됨 정수만 됨.
	static byte b =120; //전역변수 이면서 static변수 static은 메모리에 상주해서 자리를 차지함
	public static void main(String[] args) { //지역변수면서 parameter변수
	//객체생성- 변수를 메모리(RAM)에 위치시키면 cpu에 가지고가서 실행
	IntegerLiteralEx ie = new IntegerLiteralEx(); //ch05 참조형변수-주소값이 들어있다
	  System.out.println(ie.a); //위의 IntegerLiteralEx ie 변수에 a 를 출력
	  
	  int c =1; //지역변수- 반드시 초기화해야함
	  System.out.println(c);
	  
	  //primitive Type(기본형타입)인 경우 저장되는 값의 허용범위
	  byte b1 = 127; // byte는 -128~127까지. 1byte
	  char c1 = 'A'; // 문자 한개를 의미 2byte
      short s1 = 32767; //-32768~32767 2byte
      int i1 = 2100000000; // -21억~21억 4byte
	  long lo = 210000000000000000L;//21억 이상을 나타낼때 쓰이는 타입. 숫자 옆에 L을 붙임 8byte
	  boolean b =true; //논리 true 또는 false 1bit
	  float f1 = 20.0f; // 작은범위 소수점  4byte
	  double d1 = 20.0; // 큰 범위 소수점.뒤에 대문자,소문자가 있다 8byte (default)
	  
	  //참조형 타입
	  String st1 ="홍길동";
	}

}
