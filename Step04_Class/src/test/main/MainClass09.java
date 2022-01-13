package test.main;

import test.mart.Computer;
import test.mart.Cpu;
import test.mart.HardDisk;
import test.mart.Memory;

public class MainClass09 {
	public static void main(String[] args) {
		/*
		 *  [ 프로그래밍의 목적 ]
		 *  
		 *  test.mart 페키지 안에 있는 클래스를 활용해서...
		 *  
		 *  1. 게임을 한다.
		 *  2. oli999@naver.com 으로 이메일을 보낸다.
		 */
		
		Computer c1=new Computer(new Cpu(), new Memory(), new HardDisk());
		c1.playGame();
		c1.sendEmail("yjp243@naver.com");
		
		Cpu c=new Cpu();
		Memory m=new Memory();
		HardDisk h=new HardDisk();
		
		Computer c2=new Computer(c, m, h);
		c2.playGame();
		c2.sendEmail("kbs-tv@hanmail.net");
	}
}












