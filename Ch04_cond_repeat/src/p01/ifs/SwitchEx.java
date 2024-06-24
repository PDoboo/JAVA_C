package p01.ifs;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		//Scanner에 영문자(대,소): A,a
		Scanner sc = new Scanner(System.in);
		String str = sc.next();//홍길동,a
		char key = str.charAt(0);
		switch (key) {
		case 'A': 
		case 'a': 
			System.out.println("A,a");
			break;
		case 'B': 
		case 'b': {
			System.out.println("B,b");
			break;
		}	
		default:
			
		}
		System.out.println("종료");
	}
}
