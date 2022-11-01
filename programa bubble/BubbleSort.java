public class BubbleSort {
	public void sortArray(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
					swap(array, j, j+1);
				}
				printArray(array);
			}
			System.out.println("comparacion");
		}
	}

	public void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d \t", array[i]);
		}
		System.out.println();
	}

	public void swap(int[] array, int a, int b) {
		int value = array[b];
		array[b] = array[a];
		array[a] = value;
	}

	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		int[] array = { 15, 1, 5, 80, 12, 34, 54, 12, 28, 87 };
		bubbleSort.printArray(array);
		bubbleSort.sortArray(array);
		bubbleSort.printArray(array);
	}
}	