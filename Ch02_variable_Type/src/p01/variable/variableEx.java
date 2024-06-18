package p01.variable;
//Variable(변수)- 값을 저장할수 있는 메모리 특정번지에 붙이는 이름
public class variableEx {
     //프로그램시작: main()호출, 안에서 순차적으로 실행
	public static void main(String[] args) { //parameter변수, 지역변수
	 // CUP - RAM - SSD/HDD
     //type  variable = literal
       int       a  =  1; //기본형 변수 - 실제값
       String   st = new String("홍길동");//참조형 변수-주소값
       System.out.println(st.charAt(0)); //홍 출력
     //변수2가지 - 기본형(primitive:ch2-3), 참조형(reference:ch05)
       System.out.println(a);//참조형 변수-주소값 1 출력
       System.out.println(st); //홍길동 출력
	}

}
