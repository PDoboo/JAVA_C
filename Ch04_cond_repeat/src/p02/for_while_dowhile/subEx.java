package p02.for_while_dowhile;
 //main메소드가 없어서 실행불가 -> 다른클래스에서 호출하면 가능함
public class subEx {

	//인스턴스 메소드(객체생성)
    void add() {
    	System.out.println("add()");
    	
    	
    	
    }
   // static()-RAM 
static void add2() { //static 은 램에 저장되어있음
	System.out.println("add()2");
	
//	subEx s = new subEx();//class명이 다르기 때문에 반드시 호출 해준다
//	subEx.add2();
//	
}
}