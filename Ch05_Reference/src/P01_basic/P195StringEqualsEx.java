package P01_basic;
//main(메소드)가 없어서 실행불가 - 다른클래스에서 호출해서 사용가능
public class P195StringEqualsEx {
   //인스턴스 변수 - 객체생성해야 사용가능
	double d = 10.5;
	
	//인스턴스 메소드 - 객체생성해야 사용가능
	void add(int a,double b) { //10,20.5
		int result = (int) (a+b);
 		System.out.println(result);
  

}
	//static변수사용하려면 - 클래스명.변수
    static float f = (float)10.5;//double을 float으로 강제 형변환
	//static 메소드사용하려면 - 클래스명.메소드
     static void add2(int a,double f) {
		int result = (int) (a+f);
 		System.out.println(result);
 	   
}
}