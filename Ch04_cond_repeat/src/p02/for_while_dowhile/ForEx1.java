package p02.for_while_dowhile;

public class ForEx1 {

	public static void main(String[] args) {//string[] args = {"홍길동","abc"}

		int sum=0;
		System.out.println(sum);
//       //0부터 50까지 합
		for(int i=0; i<=50; i++) { //0+1+2..50 = ()를 출력
			sum = sum+i; //할당연산자 = 오른쪽부터 연산해서 다시 왼쪽 할당연산자에 넣어줌
		System.out.println(sum);
 	}
		// System.out.println(sum); 하나의 값만 출력하려면 {괄호 밖에 뺀다
		// 0부터 9까지 for문장으로 출력
		for (int i = 0; i < 10; i++) 
			System.out.println(i);
			System.out.println("종료");
			
	    //arr[] 배열내용 for 문 출력		
	   int arr[] = {10,20,30,40,50};
	   
	   //일반(옛 for문) 
	   for(int i=0; i<arr.length; i++) //arr의 i가 0일때 10
		   System.out.println(arr[i]);
	       System.out.println("end");
	    
	   //향상된 for문 
	   for(int i:arr) 
	      System.out.println(i);
	      System.out.println("end");
	   
		}
	}

