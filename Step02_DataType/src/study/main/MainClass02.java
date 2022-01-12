package study.main;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("연습중입니다");
		
		//변수 선언과 대입값 정하기
		int num1=1;
		//변수만 선언하기
		int	num2;
		//대입값을 정하기
		num2=10;
		
		//정수는 byte < short < int < long 순서로 표현 가능범위가 늘어난다
		
		//int와 byte를 정의했을때
		int myint=100;
		byte mybyte=100;
		
		//int type은 int type끼리
		int a = myint;
		//byte type은 byte type끼리 들어가야 되는데
		byte b = mybyte;
		
		//만약 int type변수 안에 값을 byte type에 대입하면 문법오류가 일어난다.
		//byte c = myint;
		
		//그럼 어떻게 넣을까?
		byte d = (byte)myint;
		
		System.out.println(d);
		
		//명시적으로 casting(byte) 해주면 대입이 가능해진다. 
		//100이 저장되어 있는 변수에 200을 대입해서 casting해서 대입한다면?
		
		myint=200;
		
		byte e = (byte)myint;
		
		//원래값이랑 다른 값이 된다는데 왜그러지? 일단 byte는 127까지 표현이 가능하니까 100은 들어갈 수 있고 200은 -56이 뜨는군? 
		
		System.out.println(e);
		
	}
}
