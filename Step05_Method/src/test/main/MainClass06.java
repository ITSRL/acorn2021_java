package test.main;

import java.util.Random;

public class MainClass06 {
	public static void main(String[] args) {
		Random ran=new Random();
		// 1~45 사이의 랜덤한 정수를 하나 얻어내서 콘솔창에 출력하는 프로그래밍을 해보세요
		int ranNum=ran.nextInt(45);
		System.out.println(ranNum+1);
		
		//nextInt 테스트해보기 0이 나오면 안되니까 +1
		for(int i=0;i<100;i++) {
			int ranNum1=ran.nextInt(45)+1;
			System.out.println(ranNum1);
		}
	}
}
