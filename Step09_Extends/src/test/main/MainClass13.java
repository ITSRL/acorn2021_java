package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass13 {
	public static void main(String[] args) {
		//다형성 확인
		SmartPhone p1=new SmartPhone();
		HandPhone p2=new SmartPhone();
		Phone p3=new SmartPhone();
		Object p4=new SmartPhone();
		
		// type casting(형변환)
		SmartPhone p5 = (SmartPhone)p4;
		
		Object p6 = p1;
		Object p7 = p2;
		Object p8 = p3;
		Object p9 = p4;
		Object p10 = p5;
		
		//p2는 SmartPhone의 부모타입이니까  HandPhone p2=p1;
		
		//usePhone(new Object()); Phone < Object 이기 떄문에 안된다.
		usePhone(new Phone());
		usePhone(new HandPhone());
		usePhone(new SmartPhone());
		//부모타입으로 받아서 사용할 수 있기때문이야

	}
	
	public static void usePhone(Phone p) {
	//이 메서드를 호출하려면 Phone타입이 필요해
		p.call();
		// 부모타입으로 받아주면 전달이 가능하다.
		// 부모는 자식을 어떤 상황에서든지 받아준다.
		
		
		new Phone() {
			public void mobileCall() {
				System.out.println("이동하면서 전화해용");
			}
		}.mobileCall(); // 이렇게 바로 사용할 수 있다네
		
		HandPhone p1=new HandPhone() {
			@Override
			public void takePicture() {
				System.out.println("1000만 화소라니깐");
			}
			//public void test() {}
		};
		//p1.test(); 이건 작동을 안해..!
		p1.takePicture();
		
	}
	
}
