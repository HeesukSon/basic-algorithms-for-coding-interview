package algo.sorting;

public class InsertionSort extends SortingAlgorithm{
	public static void main(String[] args){
		int[] inputArr = new int[]{1, 42, 35, 13, 4,64,124,53,46,57,68,123,2,4,6,8,19};

		InsertionSort is = new InsertionSort();
		is.sort(inputArr);
		is.printArr(inputArr);
	}

	/**
	 *
	 * @param arr
	 * @param from_idx should be larger than to_idx
	 * @param to_idx should be smaller than from_idx
	 */
	public void insertAndPush(int[] arr, int from_idx, int to_idx){
		int insertedVal = arr[from_idx];

		for(int i=from_idx; i>to_idx; i--){
			arr[i] = arr[i-1];
		}

		arr[to_idx] = insertedVal;
	}

	public void sort(int[] arr) {
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<i; j++){
				if(arr[i] < arr[j]){
					insertAndPush(arr, i, j);
				}
			}
		}
	}
}
