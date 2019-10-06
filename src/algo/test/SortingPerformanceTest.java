package algo.test;

import algo.sorting.*;

import java.util.ArrayList;

public class SortingPerformanceTest {
	public static void main(String []args){
		final int SIZE = 10000;
		final int NUM_LOOP = 10;

		SortingPerformanceTest t = new SortingPerformanceTest();

		long before;
		long after;

		ArrayList<SortingAlgorithm> algList = new ArrayList<SortingAlgorithm>();
		algList.add(new InsertionSort());
		algList.add(new SelectionSort());
		algList.add(new BubbleSort());
		algList.add(new MergeSort());
		algList.add(new QuickSort());
		algList.add(new HeapSort());

		for(SortingAlgorithm alg : algList){
			before = System.currentTimeMillis();
			for(int i=0; i<NUM_LOOP; i++){
				alg.sort(t.getNewArray(SIZE));
			}
			after = System.currentTimeMillis();
			System.out.println(alg.getClass().getSimpleName()+" takes: "+(after-before)+" ms for completing a sorting task "+NUM_LOOP+" times.");
		}

	}

	public int[] getNewArray(int size){
		int[] inputArr = new int[size];

		for(int i=0; i<inputArr.length; i++){
			inputArr[i] = (int)(Math.random()*size);
		}

		return inputArr;
	}
}
