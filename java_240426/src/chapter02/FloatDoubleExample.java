package chapter02;

public class FloatDoubleExample {
	public static void main(String[] args) {
		
//		float var1=3.14; -> 실수는 기본이 double
		float var2=3.14f;
		float var3=3.14F;
		double var4=3.14;
		
		float var5=0.123456890F;
		float var6=0.123456891F;
		float var7=0.12345689123456789F;
//		값을 저장시 오류발생하지 않고, 출력시 짤림
		
		double var8=0.123456789123456789;
		double var9=0.123456789123456789123456789;
//		소수점 자리수 제한 없이 값을 가지나 출력시 짤림(소수점 자리수는 double>float)
		
		double var10=3e6;
		float var11=3e6f;
		float var12=2e-3f;
		double var13=2e-3;
		
		
		
		System.out.println("var1 : 오류");
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
		System.out.println("var6 : " + var6);
		System.out.println("var7 : " + var7);
		System.out.println("var8 : " + var8);
		System.out.println("var9 : " + var9);
		System.out.println("var10 : " + var10);
		System.out.println("var11 : " + var11);
		System.out.println("var12 : " + var12);
		System.out.println("var13 : " + var13);

	}
}
