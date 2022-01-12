package study.main;

public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("연습중입니다");
		//각 점수를 대입해서 평균을 구하기
		
		int a=100;
		int b=90;
		int c=75;
		
		//점수 합
		int sum=a+b+c;
		
		//평균 구하기 정수와 정수를 연산하면 정수가 나온다
		int ave=sum/3;
		System.out.println(ave);
		
		//소수점까지 필요하다면 정수와 실수를 연산하면 된다.
		double ave1=sum/3.0;
		System.out.println(ave1);
		
		//아니면 sum을 실수로 강제 casting하면 된다
		double ave2=(double)sum/3;
		System.out.println(ave2);
	}
}
