package codingtest.ct.week01;

public class Ex0112 {

	public static void main(String[] args) {
		String str = "Good Morning";
		
		System.out.println("charAt " + str.charAt(7));
		System.out.println("startsWith :" + str.startsWith("good"));
		System.out.println("endWith : "+ str.endsWith("ng"));

		System.out.println("equals : " + str.equals("good morning"));
	
		System.out.println("replaceAll :" + str.replaceAll("[Good]", "a"));
	   // 대괄호를 쓰면 Good 를 다 a로 변경 aaaa 출력
	
	
	}
	
	// lastIndexOf = 뒤에서 부터 찾아서 맨앞에 번호
	// IndexOf는 앞에서 부터

}