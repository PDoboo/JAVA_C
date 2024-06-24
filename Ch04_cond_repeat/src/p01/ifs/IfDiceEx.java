package p01.ifs;

public class IfDiceEx {

	public static void main(String[] args) {
		System.out.println(Math.random() * 10);// 0.0~0.9999범위내에 불특정 수를 반환
		// 주사위: 1~6
		int dice = (int) (Math.random() * 6) + 1;// 0.0~0.55
		System.out.println(dice);
		if(dice == 1)
			System.out.println("1번");
		else if(dice==2)
			System.out.println("2번");
		else if(dice==3)
			System.out.println("3번");
		else if(dice==4)
			System.out.println("4번");
		else if(dice==5)
			System.out.println("5번");
		else 
			System.out.println("6번");
        
	}

}
