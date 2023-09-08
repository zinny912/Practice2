package practiceCodingTest;

import java.util.Arrays;

public class PracticeExample {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,3,3,4};
		int[] arr2 = {1,1,2,2};
		int[] arr3 = {1};
		
		int result1 = checkNum(arr1);
		int result2 = checkNum(arr2);
		int result3 = checkNum(arr3);
		
		
		System.out.println("arr1: "+result1);
		System.out.println("arr2: "+result2);
		System.out.println("arr3: "+result3);
	
	}
	
	//배열의 수의 최빈값을 새로운 배열에 담아서 같은 값이 계속나오면 해당 값이 ++ 되게하는 함수
	public static int checkNum(int[] arr) {
		
		int n = arr.length;
		int[] count = new int[1001];
		
		Arrays.sort(arr);
		
		for(int i=0; i<n; i++) {
			count[arr[i]]++;

			}
		//최빈값 누적된 
		int maxNum = 0;
		//최빈값을 가진 수 
		int num = 0;
		
		for(int i=0; i<count.length; i++) {
			int frequency = count[i];
			
			if(frequency > maxNum) {
				maxNum = frequency;
				num = i;
			
			}else if(frequency==maxNum) {
				num =-1;
			}
			
		}
		
		return num;
	}

}
