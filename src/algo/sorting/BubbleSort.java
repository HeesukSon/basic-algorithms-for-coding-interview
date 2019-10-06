package algo.sorting;

public class BubbleSort extends SortingAlgorithm{
	public static void main(String[] args){
		int[] inputArr = new int[]{1000, 42, 35, 13, 4,64,124,53,46,57,68,123,2,4,6,8,19};

		BubbleSort bs = new BubbleSort();
		bs.sort(inputArr);
		bs.printArr(inputArr);
	}

	public void sort(int[] arr) {
		boolean swapped = false;

		for(int i=0; i<arr.length-1; i++){
			for(int j=0; j<arr.length-i-1; j++){
				if(arr[j] > arr[j+1]){
					swap(arr, j, j+1);
					swapped = true;
				}
			}

			if(swapped == false) break;
		}
	}
}
