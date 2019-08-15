import java.util.*;
public class QuickSort{


	public static int partition(int[] A, int p, int r){
		
		int i= p-1;
		
		int pivot = A[r];
		for (int j=p;j<r;j++){

			if (A[j]<=pivot){
				i++;

				int temp= A[i];
				A[i]=A[j];
				A[j]=temp;
				

				
			}
		}
		int temp = A[i+1];
		A[i+1]= A[r];
		A[r]=temp;

		return i+1;
		

	}

	public static void sort(int[] Array,int p,int r){

		if(p<r){

			int q= partition(Array,p,r);
			sort(Array,p,q-1);
			sort(Array,q+1,r);
		}		
	}

}
