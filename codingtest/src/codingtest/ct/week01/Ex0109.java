package codingtest.ct.week01;

public class Ex0109 {

	public static void main(String[] args) {
		
		
		// 라벨 브레이크 -> 최상위로 빠져나감
		// 즉 for문에서 브레이크가 빠져나가고 아직 while문 안이기 때문에 계속 반복됨
		// for에서 while로 나갈수있게 해줌
		
		ep:
		while(true) {
			for ( int i = 0; i<100; i++) {
				if(i == 50 ) {
					break ep;
				}
				System.out.println(i);
				
			}

	}
		}
	}

