package algo.sorting;

public class MergeSort extends SortingAlgorithm{
	public static void main(String[] args){
		int[] inputArr = new int[]{1, 42, 35, 13, 4,64, 12, 124, 124, 53, 64, 75, 2 ,5, 7, 8, 346, 31};

		MergeSort is = new MergeSort();
		is.sort(inputArr);
		is.printArr(inputArr);
	}

	public void sort(int[] arr){
		sort(arr, 0, arr.length-1);
	}

	private void sort(int[] givenArr, int start, int end){
		if(end > start){
			sort(givenArr, start, start+(end-start)/2);
			sort(givenArr, start+(end-start)/2+1, end);
			merge(givenArr, start, end);
		}
	}

	private void merge(int[] givenArr, int start, int end){
		int firstCur = start;
		int secondCur = start+(end-start)/2+1;
		int[] sortedArr = new int[end-start+1];
		int i=0;

		while(firstCur < start+(end-start)/2+1 && secondCur <= end){
			if(givenArr[firstCur] < givenArr[secondCur]){
				sortedArr[i] = givenArr[firstCur];
				firstCur++;
			}else{
				sortedArr[i] = givenArr[secondCur];
				secondCur++;
			}
			i++;
		}

		if(firstCur == start+(end-start)/2+1){
			while(secondCur<=end){
				sortedArr[i] = givenArr[secondCur];
				secondCur++;
				i++;
			}
		}

		if(secondCur > end){
			while(firstCur < start+(end-start)/2+1){
				sortedArr[i] = givenArr[firstCur];
				firstCur++;
				i++;
			}
		}

		for(int j=start; j<=end; j++){
			givenArr[j] = sortedArr[j-start];
		}
	}
}
