package sorting;

import java.util.*;

public class Sorting {
	public static void main(String[] args) {
		int[] p = {3, 1, 6, 8, 9, 8, 9, 2};
		
		Sort.quicksort(p);
		
		for (int i:p) {
			System.out.print(i + " ");
		}
	}
	
	static class Sort {
		private static int divide(int a[], int low, int high) {
			int k = a[low];
			do {
				while (low<high && a[high]>=k) --high;
				if (low<high) {a[low] = a[high]; ++low;}
				while (low<high && a[low]<=k) ++low;
				if (low<high) {a[high] = a[low]; --high;}
				} while (low != high);
			a[low] = k;
			return low;
			}
		
		private static void qsort(int a[], int low, int high) {
			int mid;
			if (low >= high) return;
			mid = divide(a, low, high);
			qsort(a, low, mid-1);
			qsort(a, mid+1, high);
			}
		
		public static void quicksort(int a[]) {
			int last = a.length-1;
			qsort(a, 0, last);
		}
	}
}
