package Book;

public class P96PromotionEx {
   //자동타입변환
	public static void main(String[] args) {
 byte byteValue = 10; //byte타입을 int 로 변환
 int intValue = byteValue;
  System.out.println("intValue:"+intValue);
  
  char charValue = '가'; //'가'의 유니코드를 int로 변환
  intValue = charValue;
  System.out.println("가의 유니코드:"+intValue);
	
  intValue = 50; //int를 long으로 변환 
  long longValue = intValue;
  System.out.println("longValue:"+longValue);
  
  longValue = 100; //long타입을 float로 변환
  float floatValue = longValue;
  System.out.println("floatValue:"+floatValue);
  
  floatValue = 100.5F;//float타입을 double로 변환
  double doubleValue = floatValue;
  System.out.println("doubleValue:"+doubleValue);
	}
	
}
