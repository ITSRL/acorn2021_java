package test.string;

public class MainClass {
	public static void main(String[] args) {
		String name1="김구라";	//id=19
		String name2="김구라";	//id=19
		//어떤 문자열을 다른 사람이 만든 메소드를 통해서 가져와야하는경우가 있다. new해서 만들 수도 있고.
		String name3=new String("김구라");	//id=23
		String name4=new String("김구라");	//id=24
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);
		//String type 의 참조값 비교
		boolean result1 = name1 == name2; //==은 참조값을 비교하는거야 그러니까 true
		System.out.println(result1);
		boolean result2 = name1 == name3; // false 자바스크립트와 다르게 자바에서는 문자열을 비교하기위해 ==을 쓰면 안된다. 그때그때 달라요 어떻게 문자열을 만드냐에 따라
		System.out.println(result2);
		
		//String type의 문자열 내용 비교
		boolean result3 = name1.equals(name3); // 이렇게 만드는게 좋아요 //true
		System.out.println(result3);
		boolean result4="김구라".equals(name1);
		System.out.println(result4);
		boolean result5=name1.equals("김구라");
		System.out.println(result5);
	}
}
