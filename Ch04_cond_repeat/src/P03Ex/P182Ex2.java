package P03Ex;

public class P182Ex2 {
//1~100까지의 정수 중 3의 배수 총합구하기 코드
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
			System.out.println(sum);
		}
		}

}
