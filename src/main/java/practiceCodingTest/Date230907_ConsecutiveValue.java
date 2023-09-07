package practiceCodingTest;

import java.util.Arrays;

public class Date230907_ConsecutiveValue {

	public static void main(String[] args) {
		
		//배열안의 값 중에 가장 큰 값이 배열의 길이와 같고, 안의 값은 가장 큰 값과 연속적으로 이어져있는지 체크하고 
		//true, false 를 리턴하는 코딩짜기
		
		int[] arr1 = {4,1,2,3};
		int[] arr2 = {3,1,4};
		int[] arr3 = {5,1,4,3,2};
		int[] arr4 = {3,4,1,2,6};
		
		boolean result1 = checkMaxNum(arr1);
		boolean result2 = checkMaxNum(arr2);
		boolean result3 = checkMaxNum(arr3);
		boolean result4 = checkMaxNum(arr4);
		
		System.out.println("arr1: "+  result1);
		System.out.println("arr2: "+  result2);
		System.out.println("arr3: "+  result3);
		System.out.println("arr4: "+  result4);
	}
		//배열안의 값에서 가장 큰 값 찾고, 배열의 길이와 가장 큰 값이 같은지 찾는 함수 
		public static boolean checkMaxNum(int[] arr) {
			//배열안의 가장 큰 값 초기화 
			int maxNum = 0;
			int n = arr.length;
			
			for(int num : arr) {
				if(num>maxNum) {
					maxNum = num;
				}
				if(num<1 || num>maxNum) {
					return false;
				}
			}
			
			if(maxNum != n) {
				return false;
			}
			
			//배열을 정렬하기 
			Arrays.sort(arr);
			
			//배열안의 값이 i와 일치해야함 
			for(int i = 1; i<=maxNum; i++) {
				boolean checkNum = false;
				for(int num : arr) {
					if(num==i) {
						checkNum = true;
						break;
					}
				}
				if(!checkNum) {
					return false;
				}
				
				}

			return true;
			
		}
		

	

}
