package P01.basic;

public class StudentEx {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1);
		
		Student s2 = new Student();
		System.out.println(s2);

		Student s3 = new Student("홍길동");
		System.out.println(s3.name);
		
		Student s4 = new Student("홍길동");
		System.out.println(s4.name);
		System.out.println(s4.age);
		
		Student s5 = new Student("홍길동",20,4.5);
		System.out.println(s5.name);
		System.out.println(s5.age);
		System.out.println(s5.jum);
		
		
		//"홍길동",20, 4.5
		
		
	}

}
