package p02.for_while_dowhile;

import java.util.Scanner;

public class DowhileEx {

	public static void main(String[] args) {
		// Scanner입력을받아 1부터 100사이의 random()값 
		//스캔입력
		Scanner sc = new Scanner(System.in);
			
		//random()값
		int r =(int)(Math.random()*100+1);//(0.0~0.9999)*100 = 1~100을 얻을수있다
		System.out.println("random:"+r);
		int num;
		do {		
		    System.out.println("숫자를 입력하세요");
		   num = sc.nextInt();
		   //스캔입력(num55) == 랜덤값(r99)
		   if(num == r) { //스캔값이 랜덤값보다 같거나 맞으면 break 
			   System.out.println("맞혔다");
			   break;
		   }else if(num < r) { //아니면 else if 스캔값이 랜덤값보다 작으면 숫자가 적다 출력
			   System.out.println("숫자가 적다");
		   } else { //그것도 아니면 else 스캔값이 랜덤값보다 크면 숫자가 크다 출력
				System.out.println("숫자가 크다");
			       
		   }
					       
		} while(true); 
	
	}

}
