package codingtest.ct.week02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex0206 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		long startTime;
		long endTime;
		startTime = System.nanoTime();
		for(int i = 0; i< 10000; i++) {
			list1.add(0,String.valueOf(i));
			// 같은 숫자면 앞에(int)0,1 (String)a
			//숫자를 문자로 바꾸는거면 String.valueOf
			
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린 시간 :"+ ( endTime-startTime)+"ns");
		
		startTime = System.nanoTime();
		for(int i = 0; i< 10000; i++) {
			list2.add(0,String.valueOf(i));
			// 같은 숫자면 앞에(int)0,1 (String)a
			//숫자를 문자로 바꾸는거면 String.valueOf
			
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린 시간 :"+ ( endTime-startTime)+"ns");
		
		

	}

}
