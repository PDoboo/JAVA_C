package P02_array.ex;
// 객체를 참조하는 배열
public class P217ArrayReference {

	public static void main(String[] args) {
		String[]strArray = new String[3]; //배열 3개
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println(strArray[0]==strArray[1]);//true:두 배열 객체가 동일한String객체를 참조함
		System.out.println(strArray[0]==strArray[2]);//false 
		//new로 객체를 생성하면 새로운String객체가 생성되어서 [0]과 [2]는 서로다른객체를 참조해서 false
		System.out.println(strArray[0].equals(strArray[2]));//true:문자열을 비교하는 equals는 true값이 리턴

	}

}
