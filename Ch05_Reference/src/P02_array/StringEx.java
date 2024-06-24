package P02_array;
//String(문자열) 배열
public class StringEx {

	public static void main(String[] args) {
		String a1 = new String("홍길동");//원칙은 이렇게 
		String a2 = "홍길동"; //후에 변형됨(단축됨)
		
		//1.String타입 방법 1
		//index =0	
		String[] st1 = {"kim1","Na2","Park3","Lee4"};
	    
	    //2.String타입 방법 2
	    String[] st2= new String[3];//3개를 써서 st가3개가 옴 4개가 올수없다.(배열의 개수를 의미함)
	    st2[0]=new String("kim1");
	    st2[1]=new String("Na2");
	    st2[2]=new String("Park3");
	
		
	    //3.String타입 방법3
	    String[] st3 = new String[]{"kim1","Na2","Park3","Lee4"};
	    System.out.println(st3[0]); //[0]이면 1출력,[1]이면 2출력
		 
	    //for문으로 방법 3 출력
		for (int i=0; i<st3.length; i++)
			System.out.println(st3[i]);
		
		//향상된 for문으로 방법 3 출력
		for (String i:st3)//st3가 위의 for문장을 대신함
			System.out.println(i);
		    System.out.println("종료");	
}

}
