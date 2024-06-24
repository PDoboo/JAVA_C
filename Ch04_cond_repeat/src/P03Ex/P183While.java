package P03Ex;

public class P183While {

	public static void main(String[] args) {
	 //3번
		while(true) {
	int num1 =(int) (Math.random()*6)+1;
    int num2 =(int) (Math.random()*6)+1;
    System.out.println("("+num1+","+num2+")");
    if((num1+num2) ==5) 
    	 break;//반복문 탈출
		}
		 
	}

}
