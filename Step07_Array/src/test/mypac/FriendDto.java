package test.mypac;

public class FriendDto {
	private int num;
	private String name;
	private String telNum;
	private String sex;
	
	public FriendDto() {}

	public FriendDto(int num, String name, String telNum, String sex) {
		super();
		this.num = num;
		this.name = name;
		this.telNum = telNum;
		this.sex = sex;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelNum() {
		return telNum;
	}

	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}


	
}
