package P02_array.ex;

public class P217ArrayCopy {

	public static void main(String[] args) {
	int[] oldIntArray = {1,2,3};
	int[] newIntArray = new int[5];
	
	for(int i=0; i<oldIntArray.length; i++) {//[3]번까지반복
		newIntArray[i] = oldIntArray[i];
	}
	
	for(int i=0; i<newIntArray.length; i++) {
		System.out.println(newIntArray[i]+",");
	}

}
}