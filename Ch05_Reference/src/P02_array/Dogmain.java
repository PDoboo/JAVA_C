package P02_array;

public class Dogmain {

	public static void main(String[] args) {
	    //객체생성
		//Dog dg = new Dog();
		
		 Dog[] d = new Dog[3];//Dog class 3개 배열
		  d[0]=new Dog("강순","진돗개");
		  d[1]=new Dog("쥐콩","코카");
		  d[2]=new Dog("쿠키","푸들");
		  System.out.println(d[0].name);
		  System.out.println(d[0].kind);
	
	  // 일반 for	
	  for (int i=0; i<d.length; i++)
			System.out.println(d[i].name+":"+d[i].kind);
	 //향상된 for
	  for (Dog i:d)
		  System.out.println(i.name+"::"+i.kind);//i의name , i의kind 출력
	  
	  Dog dg2 = new Dog("강아지","서리");
	  System.out.println(dg2.add());
	}//Dog.java 값을 출력

}
