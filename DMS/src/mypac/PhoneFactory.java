package mypac;

public class PhoneFactory {
	
	/*
	 * PhoneFactory 라는 이름의 클래스를 정의해보세요
	 * 접근지정자는 public 리턴type은 Phone
	 * static여부는 non static
	 * 메소드명은 getPhone
	 * 메소드에 전달할 값은 없는메소드를 
	 * Phonefactory 클래스에 만들어보세요
	 */
	
	public Phone getPhone() {
		Phone p=new Phone();
		return p;
	}

}
