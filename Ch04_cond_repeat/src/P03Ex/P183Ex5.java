package P03Ex;

public class P183Ex5 {
    //5
//    *
//    **
//    ***
//    **** 출력
	public static void main(String[] args) {
	for(int x=0; x<4; x++) { //x=0일때 x=1일때
		for(int j=0; j<=x; j++) {
			System.out.print("*");
			if(j == x) System.out.println();//줄바꾸기
		} 
	}
	for(int x=1; x<5; x++) { //x=1일때 
		for(int j=1; j<=x; j++) {
			System.out.print("*");
			if(j == x) System.out.println();//줄바꾸기
	}

}
}
}