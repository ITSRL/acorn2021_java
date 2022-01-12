package study.main;

public class MainClass {
	public static void main(String[] args) {
		
		// 산술 연산자   		+, -, /, %
		
		int num1=10;
		int num2=3;
		
		//+
		
		int sum=num1+num2;
		System.out.println(sum);
		
		//정수와 정수 연산결과는 정수
		
		int result=num1/num2;
		System.out.println(result);
		
		//정수와 실수 연산결과는 실수
		
		double result1=num1/num2;
		System.out.println(result1);
		
		//num1을 num2로 나눈 나머지값
		
		int result2=num1%num2;
		System.out.println(result2);
		
		// 증감 연산자 		++, --
		
		int num=0;
		num++;
		System.out.println(num);
		num--;
		System.out.println(num);
		
		num=0;
		num1=0;
		int result3=num-- + ++num1;
		System.out.println(result3);
		
		//디버그 모드로 하나씩 확인해보자
		
		// 비교 연산자		 ==, !=, >, >=, <, <=
		
		String name=null;
		boolean result4=name==null;
		boolean result5=name!=null;
		System.out.println(result4);
		System.out.println(result5);
		
		// 논리 연산자 		||, &&, !
		
		// or 연산
		
		boolean result6=false||true;	//true
		
		// and 연산
		
		boolean result7=false&&true;	//false
		
		// not 연산
		
		boolean result8=!false;			//true
		
		// 대입 연산자		=, +=, -=, *=, /=, %=
		
		int num3=10;
		
		//우측 값을 원래 값에 더한다
		num3+=10;
		
		//우측 값을 원래 값에 빼서 대입
		num3-=10;
		
		//우측 값을 원래 값에 곱해서 대입
		num3*=10;
		
		//우측 값을 원래 값에 나누어서 대입
		num3/=10;
		
		//우측 값으로 원래 값을 나눈 나머지 값을 대입
		num3%=10;
		
		// 3항 연산자 			~~~ ? ~~~~ : ~~~~ / ~~~?값이 true이면 왼쪽 false면 
		
		String name1=true?"김":"박";
		
		//와 이부분이 어렵다던데 다시한번 보자 3항 연산자!
	}
}