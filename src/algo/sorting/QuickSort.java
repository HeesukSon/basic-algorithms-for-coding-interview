package algo.sorting;

public class QuickSort extends SortingAlgorithm{
	public static void main(String[] args){
		int[] arr = new int[]{13, 1245, 6436, 124, 634, 12,45, 253, 235, 64, 75, 86, 124, 63,314,2};

		QuickSort ss = new QuickSort();
		ss.sort(arr);
		ss.printArr(arr);
	}

	public void sort(int[] arr){
		sort(arr, 0, arr.length-1);
	}

	public int partition(int[] arr, int start, int end){
		int pivot = arr[end];
		int l_idx = start;
		int r_idx = end;

		while(l_idx <= r_idx){
			while(arr[l_idx] < pivot){
				l_idx++;
			}

			while(arr[r_idx] > pivot){
				r_idx--;
			}

			if(l_idx <= r_idx){
				swap(arr, l_idx, r_idx);
				l_idx++;
				r_idx--;
			}
		}

		return l_idx;
	}

	public void sort(int[] arr, int start, int end){
		if(start < end){
			int m = partition(arr, start, end);
			if(m>=start && m<=end) {
				sort(arr, start, m - 1);
				sort(arr, m, end);
			}
		}
	}
}
