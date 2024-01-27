package codingtest.ct.week01;

public class Ex0110 {

	public static void main(String[] args) {
		
		for(int i = 0 ; i<100; i ++) {
		if(i%2 == 0 ) continue;
		
		//continue -> 조건이 맞으면 다시 반복문으로 
		// 조건이 맞지 않으면 밑에 출력 
		// 즉 홀수만 나온다
		System.out.println(i);
		
		}

	}

}
