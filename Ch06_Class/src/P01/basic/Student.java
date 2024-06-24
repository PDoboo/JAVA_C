package P01.basic;

public class Student {
     //StudentEx 값을 채우기 위해 
	 String name;
	 int age;
	 double jum;  
	 //생성자 -객체 생성시 시작값을 저장할때
	 public Student() {
	 //Student s1 = new Student();
	//	System.out.println(s1);
	 }
	
	 public Student(String string) {
		 this.name = string;
	//Student s2 = new Student();
	//System.out.println(s2);
		 
	 }
public Student(String name, int age) {
	
		this.name = name;
		this.age = age;
 //Student s4 = new Student("홍길동");
 //	System.out.println(s4.name);
//	System.out.println(s4.age);
			
}

public Student(String name, int age,double jum) {
	
	this.name = name;
	this.age = age;
	this.jum= jum;
	//Student s5 = new Student("홍길동",20,4.5);
	//System.out.println(s5.name);
	//System.out.println(s5.age);
	//System.out.println(s5.jum); 
}
}