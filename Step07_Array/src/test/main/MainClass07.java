package test.main;

import test.mypac.FriendDto;
/*
 *	친구 한명의 정보를 객체를 생성해서 담으려고한다.
 *
 *	친구 정보는 총 4개의 정보로 이루어져 있습니다.
 *
 *	번호, 이름, 전화번호, 성별
 *
 *	클래스명, 필드명은 여러분이 마음대로 정하고
 *
 *	Dto 작성 규약에 맞게 클래스를 작성하면 됩니다.
 *	(test.mypac 패키지에 클래스를 만드세요)
 */
public class MainClass07 {
	public static void main(String[] args) {
		
		/*
		 * 친구 세명의 정보를 담을 수 있는 배열 객체를 생성하고
		 * 그 배열객체에 친구 세명의 정보를 담아보세요.
		 */
		
		FriendDto a=new FriendDto(1,"김구라","010-0000-0000","남자");
		FriendDto b=new FriendDto(2,"해골","010-1111-1111","몰?루");
		FriendDto c=new FriendDto(3,"원숭이","010-3333-3333","여자");
		
		FriendDto d=new FriendDto();
		d.setNum(4);
		d.setName("침팬치");
		d.setTelNum("010-2222-2222");
		d.setSex("남자");
		
		//FriendDto[] friends={a,b,c,d};
		
		FriendDto[] friends=new FriendDto[4];
		friends[0]=a;
		friends[1]=b;
		friends[2]=c;
		friends[3]=d;
		
		//굳이 콘솔창에서 확인을 하겠다면 +연산 으로 다 넣을 수 있다. 쉼표는 안된다.
		for(int i=0;i<friends.length;i++) {
			System.out.println(friends[i].getNum()+" "+friends[i].getName()+" "+friends[i].getTelNum()+" "+friends[i].getSex());
		}
	}
}
