package codingtest.ct.week01;

public class Ex0111 {

	public static void main(String[] args) {
		
		
		for(int i = 1; i<= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d * %d = %-2d",j,i,j*i);
				
				// %2d 이면 최소 2자리 수를 받는건데
				// 만약 한자리수를 받으면 공백으로 띄어줌
				// - 의 경우엔 왼쪽으로 정렬
				// ->
				// 결과값이    7
				// 이라면    7 로 왼쪽 정렬
				
				
				
				
				//구구단 가로로 찍기 ㄷㄷ
				// 2*1 3*1 4*1 ..... 9*1
				//돌고 다음 2*2 2*3 .. 
				
			}
			System.out.println();
		}

	}

}