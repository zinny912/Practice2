package practiceCodingTest;

import java.util.Arrays;

public class PracticeExample {

	public static void main(String[] args) {
		int[] arr1 = {4,1,2,3};
		int[] arr2 = {3,1,4};
		int[] arr3 = {5,1,4,3,2};
		int[] arr4 = {3,4,1,2,6};
		
		boolean result1 = checkNum(arr1);
		boolean result2 = checkNum(arr2);
		boolean result3 = checkNum(arr3);
		boolean result4 = checkNum(arr4);
		
		System.out.println("arr1 : "+result1);
		System.out.println("arr2 : "+result2);
		System.out.println("arr3 : "+result3);
		System.out.println("arr4 : "+result4);

	}
	
	//배열의 수가 연속된 숫자인지, 배열의 길이 = maxNum인지, 확인하는 함수
	public static boolean checkNum(int[] arr) {
		
		//배열안의 최대값 초기화 
		int maxNum = 0;
		int n = arr.length; // 배열의 길이 
		
		//배열안의 수의 최대값 찾기 
		for(int num : arr) {
			if(num>maxNum) {
				maxNum = num;
			}
			if(num<1 || num>maxNum) {
				return false;
			}
		}
		if(maxNum !=n) {
			return false;
		}
		
		//배열안의 수를 순서대로 정렬
		Arrays.sort(arr);
		
		for(int i =1; i<=maxNum; i++) {
			//배열안의 수가 1~maxNum까지 연속적으로 있는지 확인 
			boolean check = false;
			for(int num : arr) {
				if(num ==i) {
					check = true;
					break;
				}
			}
			if(!check) {
				return false;
			}
		}
		
		
		return true;
	}

}
