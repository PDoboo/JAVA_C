package P01_basic;

public class BasicEx {
   //main()프로그램 시작점
	public static void main(String[] args) {
	 //type 변수 = 리터럴 
		int  a  =  10; //기본형 변수(primitive)변수
		//객체생성 
	 String st1  = new String("홍길동");//참조(referenc)변수,java에서 만든 class
	 //new String은 주소값. st1에 주소값이 들어있다
	  System.out.println(a);
	  System.out.println(st1);
	  
	  char ch =st1.charAt(0);//"홍"만 출력
	  System.out.println(ch);
    
	  P195StringEqualsEx s = new P195StringEqualsEx();//객체생성-참조형변수(개발자가 만든것)
	  System.out.println(s);//class 주소값 출력
	  System.out.println(s.d);
	  s.add(10,20.5); //P195StringEqualsEx 여기에 있는 a 와 b 를 가지고와서 여기서 출력
	  System.out.println(P195StringEqualsEx.f);
	  P195StringEqualsEx.add2(10,20.5);
 	}

}
