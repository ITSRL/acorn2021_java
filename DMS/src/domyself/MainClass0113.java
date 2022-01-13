package domyself;

import mypac.EmpDto;

public class MainClass0113 {
	
	public static void main(String[] args) {
		
		/*
		 * 실제로 EmpDto 객체를 생성해서 
		 * 사원 한명의 정보를 담는 테스트 코드를 작성해 보세요 
		 * 사원 한명의 정보는 king의 정보를 담아 보세요
		 */
		
		EmpDto e=new EmpDto();
		
		e.setEmpno(7839);
		e.setEname("King");
		e.setSal(5000);
		e.setJob("PRESIDENT");
		
		EmpDto e1=new EmpDto(7839,"King",5000,"PRESIDENT");
		
		System.out.println(e.getEname());
		System.out.println(e.getEmpno());
		System.out.println(e.getJob());
		System.out.println(e.getSal());
		
		System.out.println(e1.getEname());
		System.out.println(e1.getEmpno());
		System.out.println(e1.getJob());
		System.out.println(e1.getSal());
	}
	
	public static void main2(String[] args) {
		
		/*
		 *  [ 기본 데이터 type 에 대응되는 참조 data type ]
		 *  
		 *  byte    : Byte
		 *  short   : Short
		 *  int     : Integer
		 *  long    : Long
		 *  
		 *  float   : Float
		 *  double  : Double
		 *  
		 *  char    : Character
		 *  boolean : Boolean
		 */
		// int와 char 을 제외한 나머지를 참조 data type을 만들땐 첫글자를 대문자로
		int num1=10;
		Integer num2=10;
		
		Integer sum=num1+num2;
		System.out.println(sum);
		
		int a=Integer.parseInt("555");
		System.out.println(a);
		
		double b=Double.parseDouble("99.9");
		System.out.println(b);
	}
}
