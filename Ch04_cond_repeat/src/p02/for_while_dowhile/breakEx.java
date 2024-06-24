package p02.for_while_dowhile;

public class breakEx {

	public static void main(String[] args) {
	 //1~10까지 출력하되 1~5까지만 출력
       for(int i=1; i<=10; i++) {
    	  System.out.println(i);
    	   if(i==5)//i가 5이상이되면 문장 빠져나오기 
    	   break;
       }
       System.out.println("end");
       
       for(int i=1; i<=10; i++) { // continue진행 
     	 
     	   if(i==5) //i가 5가 되면 다시 for문 위로 올라감
     	   continue;
     	  System.out.println(i);
        }
        System.out.println("end");
	}

}
