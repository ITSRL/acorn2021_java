package study.main;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("연습중입니다");
		
		//float에는 뒤에 f로 명시해야하는건가?
		float num1=10.1f;
		
		//double은 안해도 되던데?
		double num2=10.1d;
		double num3=10.1;
		
		//그리고 상대적으로 범위가 넓은 double에는 float를 담는것이 가능하다.
		double a=num1;
		//반대로 float에 double의 값을 담을떄는 casting이 필요해!
		float b=(float)num2;
	}
}
