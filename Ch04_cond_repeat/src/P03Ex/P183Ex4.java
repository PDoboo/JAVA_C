package P03Ex;

public class P183Ex4 {
   //4번
	public static void main(String[] args) {
	for (int x=1; x<=10; x++) { //x가 1부터 시작
		for(int y=1; y<=10; y++) { //y는 1부터 10까지
			if(4*x+5*y ==60) 
				System.out.println("("+x+","+y+")");
		}
	}

	}

}
