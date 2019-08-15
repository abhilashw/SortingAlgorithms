import java.util.*;

public class QuickSortIterative{

	public static int partition(int[] A,int p,int r){

		int i=p-1;
		int pivot=A[r];

		for(int j=p;j<r;j++){

			if(A[j]<=pivot){
				i++;

				int temp=A[j];
				A[j]=A[i];
				A[i]=temp;
			}


		}

		int temp=A[i+1];
		A[i+1]=A[r];
		A[r]=temp;

		return i+1;
	}

	public static void iterativeSort(int A[], int p,int r){

		Stack<Integer> arr = new Stack<>();
		arr.push(p);
		arr.push(r);
		while(!arr.isEmpty()){
			r=arr.pop();
			p=arr.pop();
			
			int q=partition(A,p,r);
			

			if(q-p>1){
				arr.push(p);
				arr.push(q-1);
			}
			if(r-q>1){
				arr.push(q+1);
				arr.push(r);
			}

			
		}	
	}

}