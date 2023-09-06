package practiceCodingTest;

import java.util.HashSet;
import java.util.Set;

public class Date230906_HashSet {
	//코딩테스트 연습하기
	//배열안의 수 3개의 합이 소수인 경우 중복되지 않은 소수의 개수 리턴하세요.
	
	//소수판별하는 함수 -> 효율적으로 사용하기 위해 함수로 구현 
	public static boolean isPrime(int num) {
		// 1보다 작으면 소수가 아니다 
		if(num<=1) {
			return false;
		}
		// 3보다 작거나 같으면 소수 
		if(num<=3) {
			return true;
		}
		//2로 나눠 지거나 3으로 나눠지면 소수가 아님 
		if(num %2==0 || num%3==0) {
			return false;
		}
		
		//6k+1 : 소수구하는 함수 사용하여 반복문 구현, 제곱근으로 나눴을 때의 경우도 체크하기 
		for(int i=5; i*i<=num; i+=6) {
			if(num%i==0 || num%(i+2)==0) {
				return false;
			}
		
		}
		return true;	
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {2,5,7,11,17,31,19};
		int n = arr.length;
		int count = 0;
		
		//중복제거를 위해 hashSet 사용 
		Set<Integer> uniqueNum= new HashSet<>();
		
		for(int i=0; i<n-2; i++) {
			for(int j=1; j<n-1; j++) {
				for(int k=2; k<n; k++) {
					int sum = arr[i]+arr[j]+arr[k];
					if(isPrime(sum)) {
						uniqueNum.add(sum);
					}
				}
			}
		}
		count = uniqueNum.size();
		System.out.println("3개의 합이 소수인 경우의 수 : "+count);
		//15 나옴 
		
		
	}

}
