package p02.primitive_Type;

public class P88EscapeEx { 
  public static void main(String[] args) {
		/*
		 * 문자열 내부에 역슬래시\ 가 붙은 문자는 이스케이프 문자. 
		 * 이스케이프 문자를 사용하면 문자열 내부에 특정 문자를 포함시킬 수 있습니다.
		 */
	  System.out.println("번호\t이름\t직업");// \t 탭만큼 띄움
	  System.out.println("행 단위 출력\n");// \n 줄바꿈
	  System.out.println("행 단위 출력\n");// 
	  System.out.println("우리는 \"개발자\" 입니다.");// \"는 "입력값\" 큰따옴표 안의 입력값 출력
	  System.out.println("봄\\여름\\가을\\겨울");// \\는 \출력
	  
  }
}
