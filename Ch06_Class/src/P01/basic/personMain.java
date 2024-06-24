package P01.basic;

public class personMain {
	
		 //1.초기화블럭 - 프로그램 실행시 가장먼저 실행
		{
			System.out.println("2.인스턴스 초기화 블럭은 객체생성될때마다 가장 먼저 실행");
		}
		
	  static {
			System.out.println("1.static 초기화 블럭은 최초 한번 실행");
		}
		 //2.전역변수(field)
			String name;
			int age;
	     //3.생성자 -객체생성시 초기값 부여
			public personMain(String name1,int age1) {
				this.name = name1;
				this.age = age1;
				System.out.println("3.생성자");
			}
			
		 public personMain() {
			// TODO Auto-generated constructor stub
		}

		//4.method

		public static void main(String[] args) {
			personMain pm1 = new personMain("홍길동",20);//반드시 생성자 필요
			personMain pm2 = new personMain("홍길동",20);
		 System.out.println("4.메인:"+pm1);
		 System.out.println("4.메인:"+pm2);
		 
		 personMain pm3 = new personMain();
	     pm3.name="홍길동2";
	     pm3.age = 30;
		}

}
