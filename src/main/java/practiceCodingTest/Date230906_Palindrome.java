package practiceCodingTest;

public class Date230906_Palindrome {
	
		//코딩테스트 연습하기
		//n,m 사이의 숫자 중 앞 뒤의 숫자가 같은 수의 개수를 리턴하시오
		
		public static void main(String[] args) {
			
			int n = 1;
			int m = 100;
			int count =0;
			
			for(int i=n; i<=m; i++) {
				int original = i;
				int reverse =0;
				
				int num =i;
				while(num>0) {
					int digit = num /10;
					reverse = reverse * 10 +digit;
					num/=10;
				}
				
				if(original==reverse) {
					count++;
				}
			}
			System.out.println(n+"과" + m+ "사이의 palindrome의 총 개수 : "+count);
		}

	}
