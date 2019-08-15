import java.util.*;
public class MergeSort{
	

	public static void merge(int A[],int l,int m,int r){
		
		int L[]=new int[m-l+1];
		int R[]=new int[r-m];


		for(int i=0;i<m-l+1;i++){
			L[i]=A[l+i];
		}
		for(int i=0;i<r-m;i++){
			R[i]=A[m+i+1];
		}

		int p=0,q=0;
		int k=l;

		while(p<m-l+1 && q<r-m){
			if(L[p]<=R[q]){
				A[k]=L[p];
				p++;
			}
			else{
				A[k]=R[q];
				q++;
			}
			k++;
		}

		while(p<m-l+1){
			A[k]=L[p];
			p++;
			k++;
		}
		while(q<r-m){
			A[k]=R[q];
			q++;
			k++;
		}

			
	}
	public static void sort(int A[],int l,int r){

		if(l<r){
			int m=(l+r)/2;
			sort(A,l,m);
			sort(A,m+1,r);
			merge(A,l,m,r);
		}
	}
	

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();

		int Array[]=new int[n];

		for(int i=0;i<n;i++){
			Array[i]=input.nextInt();
		}

		MergeSort.sort(Array,0,Array.length-1);
		for(int el:Array){
			System.out.printf("%d ",el);
		}
		
	}
}