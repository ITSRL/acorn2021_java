package mypac;

public class EmpDto {

	/*
	 * test.emp 페키지를 만들고
	 *  그 페키지 안에 사원 한명의 정보를 담을 객체를 생성할 클래스를 만들어보세요.
	 *  클래스명은 EmpDto
	 *  (단 사원정보는 empno, ename, sal, job 만)
	 */
	
	
	
	private int empno;
	private String ename;
	private int sal;
	private String job;
	
	// 생성자 함수 한번 명시해주기!
	
	public EmpDto() {}
	
	//우클릭 source / generate 모시깽이
	
	public EmpDto(int empno, String ename, int sal, String job) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
		this.job = job;
	}
	
	//우클릭 source / generate getter 모시깽이
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	
}
