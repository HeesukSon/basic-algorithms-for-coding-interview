package algo.sorting;

public class HeapSort extends SortingAlgorithm {
	public static void main(String[] args){
		int[] inputArr = new int[]{1000, 42, 35, 13, 253, 14, 1, 6, 1029, 395, 1092, 49, 293, 1024, 8491, 983, 129, 24, 10, 0, 238, 24, 35, 7, 8, 9};

		HeapSort hs = new HeapSort();
		hs.sort(inputArr);
		hs.printArr(inputArr);
	}
	@Override
	public void sort(int[] arr) {
		buildHeap(arr);
		for(int i=arr.length-1; i>0; i--){
			sort(arr, 0, i);
		}
	}

	private void sort(int[] arr, int root, int end){
		if(end > 0){
			swap(arr, 0, end);
			heapify(arr, root, end-1);
		}
	}

	private void buildHeap(int[] arr){
		int n = arr.length;
		for(int i=n/2-1; i>=0; i--){
			heapify(arr, i, n-1);
		}
	}

	private void heapify(int[] arr, int root, int end){
		int l = root*2+1;
		int r = root*2+2;

		if(l <= end && r <= end){ // both child nodes exist
			int max = getMaxIdx(arr, root, l, r);

			if(max != root){
				swap(arr, root, max);
				heapify(arr, max, end);
			}
		}else if(l <= end && r > end){ // only left child node exists
			int max = getMaxIdx(arr, root, l);
			if(max != root){
				swap(arr, root, max);
				heapify(arr, max, end);
			}
		}else{ // no child exists
			// Do nothing
		}
	}

	private int getMaxIdx(int[] arr, int x, int y){
		int max = x;
		if(arr[max] < arr[y]) max = y;

		return max;
	}

	private int getMaxIdx(int[] arr, int x, int y, int z){
		int max = x;
		if(arr[max] < arr[y]) max = y;
		if(arr[max] < arr[z]) max = z;

		return max;
	}
}
