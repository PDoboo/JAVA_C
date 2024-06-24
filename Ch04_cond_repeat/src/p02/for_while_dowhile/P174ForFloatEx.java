package p02.for_while_dowhile;

public class P174ForFloatEx {

	public static void main(String[] args) {
		for (float x =0.1f; x<=1.0f; x+=0.1f) { //0.1 부터 1.0까지 출력 0.1씩 증가함
			System.out.println(x);
		
		}
			for (double x =0.1f; x<=1.0f; x+=0.1f) {
				System.out.println(x);
		}
        //a~z까지출력 for문장 //유니코드 호출로 만들기
		for (char x = 'a'; x <='z'; x++) { 
			System.out.println(x+" ");
		}
	}
}

