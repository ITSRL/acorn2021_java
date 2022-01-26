package test.main;
/*
 *  Exception 의 종류는 크게 두가지이다.
 *  
 *  1. RuntimeException 을 상속받아서 만든 실행중에 발생하는 Exception 
 *  
 *  2. RuntimeException 을 상속받지 않아서 만든 컴파일(문법체크중) 중에 발생하는 Exception 
 */
public class MainClass05 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		
		try {
			//스레드(작업단위, Thread) 를 5초 잡아두기 1/1000초 단위로 작성한다.
			//반드시 try~catch 블럭으로 예외 처리를 해야 한다. 없으면 문법적으로 오류가 생긴다. runtimeException을 상속받지 않은 Exception
			Thread.sleep(5000);
		} catch (InterruptedException e) {	// 부모중에 runtimeException이 없는 Exception은 반드시 try/catch를 묶어야한다. 마우스를 올려보면 Surround with try/catch라고 뜰거야
			e.printStackTrace();
		}
		System.out.println("main 메소드가 종료 됩니다.");
	}
}






