package P02_array;

public class ArrayEx1 {
 //배열(Array)테이터를 연속된 공간에 나열하고 데이터에 인덱스를 부여한 자료구조
//같은 타입끼리만 저장됨. 초기에 배열크기가 정해지면 더이상 줄이거나 늘릴수없음(정적구조)
	public static void main(String[] args) {
    //배열생성방법 3가지 
    
	//1.int타입 방법 1
	//index =0	
    int[] arr1 = {1,2,3,4};
    
    //2.int타입 방법 2
    int arr2[] = new int[3];//3개를 써서 arr가3개가 옴 4개가 올수없다.(배열의 개수를 의미함)
    arr2[0]=1;
    arr2[1]=2;
    arr2[2]=3;
  //arr2[3]=4; -출력오류: 배열의 현재 개수에서 벗어남
  //System.out.println(arr2[3]);
	
    //3.int타입 방법3
    int[]arr3 = new int[] {1,2,3};
    System.out.println(arr3[0]); //[0]이면 1출력,[1]이면 2출력
	 
    //for문으로 방법 3 출력
	for (int i=0; i<arr3.length; i++)
		System.out.println(arr3[i]);
	
	//향상된 for문으로 방법 3 출력
	for (int i:arr3)//arr3가 위의 for문장을 대신함
		System.out.println(i);
	    System.out.println("종료");
	}

}
