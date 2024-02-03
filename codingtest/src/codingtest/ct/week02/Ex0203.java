package codingtest.ct.week02;

import java.util.ArrayList;
import java.util.List;

public class Ex0203 {
	public static void main(String[] args) {
		// Integer 는 null 도 받을 수 있음. 
		// List는 일단 객체만 받을 수 있음
		// Integer는 객체임
		List<String> list = new ArrayList<>();
		list.add("A");


		
		System.out.println(list.toString()+","+list.size());
		list.add("B");
		list.add("D");
		System.out.println(list.toString()+","+list.size());
		list.add(2,"C"); // 3번째에 C를 넣음
		list.add("F");
		System.out.println(list.toString()+","+list.size());
		list.set(4, "E"); // 4번째값을 E로 바꿈
		System.out.println(list.toString()+","+list.size());
		System.out.println(list.get(3)); // 인덱스3의 값을 가져옴
		
		for(int i = 0; i<list.size();i++) {
			System.out.printf("%d 번째 문자 : %s \n " , i,list.get(i));
		}
		list.remove(1);
		list.remove("D");
		for (String s : list) {
			System.out.printf(" 문자 : %s \n " ,s);
		}
		
		
		

	}

}
