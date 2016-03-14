import java.util.Arrays;


public class BubbleSort {
	
	public static void main(String[] args){
		
		int[] inputArr = {4, 15, 6, 7, 3, 95, 84};
		
		System.out.println(Arrays.toString(inputArr));
		
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.sort(inputArr);
		
		System.out.println(Arrays.toString(inputArr));
		
	}
	
	private void sort(int[] inputArr){
		
		boolean swapped = true;
		
		while(swapped){
			swapped = false;
			
			for(int i = 0; i < inputArr.length - 1; i++){
				if(inputArr[i] > inputArr[i + 1]){
					swapNumbers(inputArr, i, i + 1);
					swapped = true;
				}	
			}
		} 
		
	} 
	
	private void swapNumbers(int[] inputArr, int index1, int index2){
		int temp = inputArr[index1];
		inputArr[index1] = inputArr[index2];
		inputArr[index2] = temp;
	}
	
}