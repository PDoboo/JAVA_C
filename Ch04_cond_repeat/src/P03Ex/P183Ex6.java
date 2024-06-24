package P03Ex;

public class P183Ex6 {
//6번 
//   *
//  **
// ***
//****	
	public static void main(String[] args) {
	 for (int x = 1; x < 5; x++) { // x=1부터 x<5까지 반복
         for (int j =1; j<=4-x; j++) { // 공백 출력
             System.out.print(" ");
         }
         for (int k =1; k<=x; k++) { // 별 출력
             System.out.print("*");
         }
         System.out.println(); // 줄바꿈
     }
 }
}