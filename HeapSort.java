import java.util.*;
public class HeapSort{

	public static void heapify(int[] A,int parent,int n){
		int left =2*parent +1;
		int right=2*parent +2;
		int smaller =parent;

		if (left<n&&A[left]<A[smaller]){
			smaller=left;
		}	
		if(right<n&&A[right]<A[smaller]) {
			smaller=right;
		}
		if(smaller!=parent){
			int temp=A[parent];
			A[parent]=A[smaller];
			A[smaller]=temp;

			heapify(A,smaller,n);
		}	
	}

	public static void sort(int[] A){
		
		for(int i=(A.length-1)/2;i>=0;i--){
			heapify(A,i,A.length);
		}
		for(int j=0;j<A.length;j++){
			int temp=A[0];
			A[0]=A[A.length-1-j];
			A[A.length-1-j]=temp;

			heapify(A,0,A.length-1-j);
		}
		for(int j=0;j<A.length/2;j++){
			int temp=A[j];
			A[j]=A[A.length-1-j];
			A[A.length-1-j]=temp;
		}
	}
}