package test.main;

import test.mypac.House;
import test.mypac.MyObject;
import test.mypac.Phone;

public class MainClass05 {
	public static void main(String[] args) {
		//1. MyObject 클래스의 callPhone()  메소드를 호출해 보세요.
		MyObject.callPhone(new Phone());
		//2. MyObject  클래스의 buyHouse() 메소드를 호출하고 
		// 리턴되는 참조값을 myHome 이라는 이름의 지역 변수에 담아 보세요.
		House myHome=MyObject.buyHouse();
		

		MyObject.buyHouse();
		
		//buyHouse는 House type을 리턴하기 때문에 아래와 같이 a에 담아서 쓸 수 있다.
		House a=MyObject.buyHouse();
		
		MyObject.callPhone(new Phone());
		
		// callPhone 은 void 타입을 리턴하기 때문에 이렇게 쓸 수 없다. 
		//Phone b=MyObject.callPhone(new Phone());
	}
}
