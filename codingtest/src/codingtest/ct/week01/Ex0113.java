package codingtest.ct.week01;

public class Ex0113 {

	public static void main(String[] args) {
	
		// 삼각형 
		
		// 행을 먼저 for문으로 돌림
		// for ( 1 - 5  -> 즉 0~4 )
		// 1-5 까지 돔
		
//		
//		for (int i = 1; i<=5; i++)
//		{
//			
//			for(int j = 1; j<=i; j++)  //i만큼 찍음 첫번쨰줄 1개 , 2번째줄 2개 , 3번쨰줄 3개 ,,,,
//			{
//				System.out.print("*");
//				
//			}
//			System.out.println();
//		}
			
//		       *
//		      **
//		     ***
//		    ****
//		   *****
//			
//		for(int i = 1; i<=5; i++)
//		{
//			
//			// 공백을 만들어줘야겠네요
//			for(int j = 1; j<=5-i; j++ ) // i가 첫번째 바퀴 돌때 1 이니깐 5-1 = 4 4개의 공백을 찍은뒤 k의 구문에서 * 찍어줌
//			{
//				System.out.print(" ");
//			}
//			for(int k=1; k<= i; k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//	
//		}
		
//		*****
//		****
//		***
//		**
//		*
//		
//		for(int i = 5; i >=1; i--)
//		{
//			for(int j = 1; j<= i; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
			
		
//		*****
//		 ****
//		  ***
//		   **
//		    *
		
//		for(int i = 5; i>= 1; i--)
//		{
//			for(int j =0; j< 5-i; j++)
//			{
//				System.out.print(" ");
//			}
//			for(int k = 1; k<=i; k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
		
//		*
//	   ***
//	  *****
//	 *******
//	*********
		
//		for(int i = 1; i<=5; i++)
//		{
//			for(int j = 1; j <= 5-i; j++) // 첫번쨰 5-i= 5-1 이니ㅣ깐 4개의 공백 후 별 한개
//			{
//				System.out.print(" ");
//			}
//				for(int k = 1; k<= i * 2 -1; k++) // i가 1 이면 1*2 - 1 이니깐 1개 , 2면 2*2-1이니깐 3개
//				{
//					System.out.print("*");
//				}
//				System.out.println();
//				
//			}
		
//		*********
//		 *******
//		  *****
//		   ***
//		    *
		
		for(int i = 5 ; i >=1; i--) //5부터 도는데 (행)
		{ 
			for(int j=0; j<=5-i;j++)   // 5-i = 0이니깐 공백 x  5*2-1이니깐 9개찍어줌 
			{
				System.out.print(" ");
			}
			for(int k = 1; k<= i*2-1; k++)//(열)
			{
				System.out.print("*");
			}
			System.out.println();
			
		
		}
			}



	}

