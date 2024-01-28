package codingtest.ct.week01;

public class Ex0115 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "aaa";
		String str2 =  "aaa";
		
		
		String str3 = new String("aaa");
		String str4 = new String("aaa");
		// str3 은 스택에서 주소 번호를 받고 
		// 받은 값 aaa는 힙영역으로 던져짐
		
		// ==의 경우엔 주소값과 힙영영의 값도 보기때문에 false 
		
		// equals의 경우엔 aaa의 값만 보기 때문에 true
		// 그래서 문자열 비교할때는 equals를 사용하는게 좋음
		System.out.println(str3 == str4);
		

		System.out.println(str1 == str4);
		System.out.println(str1.equals(str3));
	}

}
