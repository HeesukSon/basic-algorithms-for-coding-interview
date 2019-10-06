package algo.sorting;

public class SelectionSort extends SortingAlgorithm{
	public static void main(String[] args){
		int[] arr = new int[]{13, 2, 4, 14, 56, 1, 65, 10, 3, 29, 45,67,19};

		SelectionSort ss = new SelectionSort();
		ss.sort(arr);
		ss.printArr(arr);
	}

	public void sort(int[] arr) {
		int tmp;
		int min_idx;

		for(int i=0; i< arr.length; i++){
			min_idx = i;

			for(int j=i+1; j<arr.length; j++){
				if (arr[min_idx] >= arr[j]){
					min_idx = j;
				}
			}

			tmp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = tmp;
		}
	}
}
