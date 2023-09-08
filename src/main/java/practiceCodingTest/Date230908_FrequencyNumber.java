package practiceCodingTest;

public class Date230908_FrequencyNumber {
	//최빈값을 구하세요! 최빈값이 여러개일 경우 -1을 리턴하세요.
	
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,3,3,4};
		int[] arr2 = {2,2,3,3,1};
		int[] arr3 = {1};
		int[] arr4 = {5,5,2,1,6,6,6,4,4,4,3,2,4};
		
		int result1= checkNumber(arr1);
		int result2= checkNumber(arr2);
		int result3= checkNumber(arr3);
		int result4= checkNumber(arr4);
		
		System.out.println("arr1 :"+result1);
		System.out.println("arr2 :"+result2);
		System.out.println("arr3 :"+result3);
		System.out.println("arr4 :"+result4);
		
		
		

	}
	
	//최빈값을 담는 배열과 count 배열을 만들어서 최빈값을 리턴하는 함수 만들기 
	public static int checkNumber (int[] arr) {
		//배열을 순회해서 최빈값 count을 배열로 만들기 
		int[] count = new int[100];
		
		for(int i=0; i<arr.length; i++) {
			count[arr[i]]++;
		}
		
		int maxNumber = 0;
		
		int number = 0;
		
		for(int i=0; i<count.length; i++) {
			int frequency = count[i];
			if(frequency > maxNumber) {
				maxNumber = frequency;
				number =i;
			}else if(frequency == maxNumber) {
				number =-1;
			}
		}
		
		return number;
	}

}
