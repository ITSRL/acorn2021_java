package test.emp;
//import test.emp.EmpDto; 같은 패키지 안에 있어서 상관없숭

public class Emp {
	public static void main(String[] args) {
		EmpDto e1=new EmpDto(7839,"KING","PRESIDENT",5000);
		
		EmpDto e2=new EmpDto();
		e2.setEmpno(7837);
		e2.setEname("KIM");
		e2.setJob("TEACHER");
		e2.setSal(10000);
		
		System.out.println(e1.getEname());
		System.out.println(e1.getEmpno());
		System.out.println(e1.getJob());
		System.out.println(e1.getSal());
		
		System.out.println(e2.getEname());
		System.out.println(e2.getEmpno());
		System.out.println(e2.getJob());
		System.out.println(e2.getSal());
	}
}
