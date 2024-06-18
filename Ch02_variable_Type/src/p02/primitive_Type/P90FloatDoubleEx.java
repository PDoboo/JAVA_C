package p02.primitive_Type;

public class P90FloatDoubleEx {
 public static void main(String[]args) {
     //실수값 저장
	 //float var1 =3.14;
	 float var2 = 3.14f;
	 double var3 = 3.14;
	 
	 //정밀도 테스트
	 float var4 = 0.1234567890123456789f;
	 double var5 = 0.1234567890123456789;
	 
	 System.out.println("var2: "+ var2);
	 System.out.println("var3: "+ var3);
	 System.out.println("var4: "+ var4);
	 System.out.println("var5: "+ var5);//double타입인 var5가 float타입인 var4보다 2배이상 정밀한값으로 출력
		/*
		 * float타입과 double타입이 허용하는 소수점 이하 자리는 각 7자리와 15자리입니다. 
		 * double타입은 float타입보다 2배정도 정밀도가 높아서 붙여진 이름입니다.
		 */
	 
	//e 사용하기
	 double var6 = 3e6;
	 float var7 =3e6F;
	 double var8 =2e-3;
	 System.out.println("var6: "+var6);
	 System.out.println("var7: "+var7);
	 System.out.println("var8: "+var8);
 }
}
