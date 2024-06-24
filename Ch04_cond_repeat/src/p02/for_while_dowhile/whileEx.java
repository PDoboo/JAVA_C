package p02.for_while_dowhile;

public class whileEx {
  //while은 조건이 맞지 않으면 실행하지 않는다.대신 조건식이 true일경우 계속 반복함. flase가되면 while문 종료
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		System.out.println(sum);
      //0부터 50까지 합
		for(int i=0; i<=50; i++) { //0+1+2..50 = ()를 출력
			sum = sum+i; //할당연산자 = 오른쪽부터 연산해서 다시 왼쪽 할당연산자에 넣어줌
		System.out.println(sum);
		System.out.println("--------------------------");
	
	//while : 1~50까지 합 계산하기 
		 int i1 = 1;
		 int sum1 = 0;
		 while (i1 <=50) {
		  sum1 = sum1+i1;
			 i1++;
		 }
		 System.out.println(sum);
		}

}
}