public class arrayLearn {
	int array[] = {2,3,4,1,9,10,8,9,6,7,5,0};
	public static void main(String[] args) {
		/*
		int day[] = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
		for (int i = 0; i < day.length; i++) {
			System.out.println(day[i]);
		}

		int month[] = new int[] {1,2,3,4,5,6,7,8,9,10,11,12};
		String[] year = {"2017", "2018", "2019", "2021"};

		for (int i = 0; i < year.length; i++ ) {
			for (int j = 0; j < month.length; j++ ) {
				System.out.println(year[i] + "年" + month[j] + "月有" + day[j] + "天");
			}
			
		}

		for (String y : year) {
			for (int m : month) {
				System.out.println(y + "年" + m + "月");
			}
			
		}
		*/
		arrayLearn sorted = new	arrayLearn();
		sorted.bubbleSort(sorted.array);
		sorted.showArray(sorted.array);

		sorted.selectSort(sorted.array);
		sorted.showArray(sorted.array);
	}
	//冒泡排序
	public void bubbleSort(int array[]) {
		for (int i = 1; i < array.length; i++ ) {
			for (int j = 0; j < array.length - 1; j++ ) {
				if (array[j] < array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;					
				}				
			}			
		}
		showArray(array);
	}
	//直接选择排序
	public void selectSort(int array[]) {
		int index;
		for (int i = 1; i < array.length; i++ ) {
			index = 0;
			for (int j = 1; j <= array.length-i; j++ ) {
				if (array[j] > array[index]) {
					index = j;					
				}				
			}
			int temp = array[array.length-i];
			array[array.length-i] = array[index];
			array[index] = temp;			
		}
	}
	//反转排序
	public void reverseSort(int[] array) {
		int temp;
		int len = array.length;
		for (int i = 0; i < len/2; i++ ) {
			temp = array[i];
			array[i] = array[len-i-1];
			array[len-i-1] = temp; 		
		}

	}

	public void showArray(int[] array) {
		for (int i : array) {
			System.out.print(" > " + i);
		}
		System.out.println();
	}
}