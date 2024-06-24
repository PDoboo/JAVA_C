package p02.for_while_dowhile;
 //class 4가지 구성요소
public class P172ForPrintForm {
	       //1. 초기화 블럭
    
			//2. constructor
			
			//3. 변수
			int a = 10;
			static byte b =11; //static변수(램에 저장되어있어서 공간을 차지함 cpu로 실시간 사용)
	
			//4. 메소드 main()-프로그램 출발
	public static void main(String[] args) {
		  short c =32;
		  //static long d = 100; 불가함 메모리를 8byte차지
		  int a1 = 10;
		  System.out.println(a1);
		  System.out.println(P172ForPrintForm.b);
		  System.out.println(c);

	
		  P172ForPrintForm fp = new P172ForPrintForm();
		  System.out.println(fp.a);
		  System.out.println(b);
		  System.out.println(P172ForPrintForm.b);
		  System.out.println(c);
		  
//		  fp.add();
//		  add2();
//		  P172ForPrintForm.add2(); 
		  
		  subEx s = new subEx();
		  subEx.add2();//class명이 다르기 때문에 반드시 호출 해준다
	}
	
}

