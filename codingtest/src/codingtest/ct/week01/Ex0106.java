package codingtest.ct.week01;

public class Ex0106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int result = 0;
//	       for (int i = 1; i <= 10; i++) {
//	            if (i % 2 == 0) {
//	                continue;
//	                //나눴을떄 짝수이면 다시 반복문으로 
//	                //조건에 부합하지 않으면 밑에 더함 
//	                // 즉 홀수면 더해줌
//	            }
//	            result += i;
//	        }
//	        System.out.println(result);
//	        //짝수만 계산
		
		
		// 배열에 for문 사용하여 담기
		String[] arrays = {"a", "b" , "c" ,"d","e"};
		for(int i = 0; i < arrays.length; i++) {
			
			System.out.println(arrays[i]);
			
		}
		
		
		// for each 
		// s에 arrays 값을 담아줌
		for(String s : arrays) {
			System.out.println(s);
		}
		
		
		int[] numbers = {1,2,3,4,5};
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.println(numbers[i]);
		}
	        
	        
		for (int a : numbers) {
			System.out.println(a);
		}
	        
	        
	    }
	
}

