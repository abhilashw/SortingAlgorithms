import java.util.Scanner;

public class InsertionSort{

	public static void main(String[] args){
		
		int[] sort = new int[]{87,4,6,8,9,7,2,5,1};
		for (int element : sort){
			System.out.printf("%d ", element );
		}
		System.out.println();

		for (int j= 1 ; j< sort.length ;j++ ){
			int key = sort[j];
			int i = j-1;

			while (i >= 0&&key < sort[i] ){
				sort[i +1] = sort[i];
				i--;
			}
			sort[i +1] = key;
		}
		
		for (int ele : sort){
			System.out.printf("%d ",ele);
		}
	}
}