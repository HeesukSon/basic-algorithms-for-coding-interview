package algo.sorting;

import java.util.Arrays;

public abstract class SortingAlgorithm {
	public abstract void sort(int[] arr);

	public void printArr(int[] arr){
		System.out.println(Arrays.toString(arr));
	}

	protected void swap(int[] arr, int x, int y){
		int tmp = arr[x];
		arr[x] = arr[y];
		arr[y] = tmp;
	}
}
