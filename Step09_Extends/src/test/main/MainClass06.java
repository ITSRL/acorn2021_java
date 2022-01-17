package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass06 {
	//실행순서가 시작되는 특별한 main 메소드
	public static void main(String[] args) {
		//usePhone() 메소드를 호출하는 코드를 아래에 작성해 보세요.
		//같은 클래스 안에서 스테틱 메서드를 호출할때 클래스명을 생략 가능하지만, 지금은 생략하지 마라. (main메서드와 usePhone 메서드가 같은 클래스에 있다는)
		MainClass06.usePhone(new Phone());
		MainClass06.usePhone(new HandPhone());
		MainClass06.usePhone(new SmartPhone());
	}
	//Phone type 을 인자로 전달 받는 static 메소드 
	public static void usePhone(Phone p) {
		//인자로 전달되는 참조값을 이용해서 메소드 호출하기 
		p.call();
	}
}




