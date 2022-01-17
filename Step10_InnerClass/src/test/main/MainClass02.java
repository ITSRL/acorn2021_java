package test.main;

import test.mypac.MyUtil;
import test.mypac.MyUtil.User;

public class MainClass02 {
	public static void main(String[] args) {
		
		//User u=new MyUtil().new User();	
		
		MyUtil m=new MyUtil(); 			//이렇게 MyUtil을 생성해두고
		User u=m.new User();				//User을 만들어서 사용할 수 있다.

		u.doSomething();
	}
}
