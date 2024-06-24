package Book.conversion;

import java.util.Scanner;

public class Toyard {
    //4번과제
	public static void main(String[] args) {
		double meter = 100.785;
		System.out.println(meter*1.0936);
		
		
    //6번 
	char ch ='자'; //2 byte 영문자제외 언어는 다 2byte
	System.out.println(ch);
	ch = '\uc790'; //유니코드 16진수를 의미
	System.out.printf("%c",ch); // %c는 char의 약자 %s 는 string
	
	//8번 스캐너 사용
	 Scanner sc = new Scanner(System.in);
	 System.out.println("kg입력?");
	 Double kg= sc.nextDouble();//double 타입을 써서 소수점 까지 표현해줌
	 System.out.printf("%fKG은 %f파운드 입니다",kg,kg*2.2);
	}

}
