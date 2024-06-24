package P02_array;

public class Dog {
	
	String name;
	String kind;
	//2.생성자 - 객체생성시 초기값 저장용도 생성자는 클래스 이름과 같고, 메소드와 다르게return과type없음
	public Dog(String name1, String kind1) {
		
		this.name = name1;//this현재클래스
		this.kind = kind1;
	}
    //3.인스턴스 메소드  
	public int add() {
		return 10;
//사용하려면 class Dogmain을 가져와야 함
	}

}
