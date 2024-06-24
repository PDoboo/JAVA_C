package p01.ifs;

import java.util.Scanner;

//161
public class IfElseIfElseEx {

	public static void main(String[] args) {
		// 점수: 100~90: A
		// 89~80 : B
		// 79~70: C
		// 69~60: D
		// 1. 직접입력
		int score = 85;
		// 2.Scanner 입력
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		if (score > 90) {
			System.out.println("A");
			System.out.println("A학점");
		} else if (score > 80)
			System.out.println("B");
		else if (score > 70)
			System.out.println("C");
		else
			System.out.println("D");
		
		    System.out.println("종료");
	}

}
