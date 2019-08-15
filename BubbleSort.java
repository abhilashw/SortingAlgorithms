import java.util.*;
public class BubbleSort{

	public static void sort(int[] A){
		int n= 0;
		while(n<A.length-1){
			for(int i=0;i<A.length-1;i++){
				if(A[i]>A[i+1]){
					int temp= A[i];
					A[i]=A[i+1];
					A[i+1]= temp;
				}	

			}
			n++;
		}			
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		int n = input.nextInt();
		int[] Array= new int[n];

		for(int i=0;i<Array.length;i++){
			Array[i]=input.nextInt();
		}

		BubbleSort.sort(Array);
		for(int el:Array){
			System.out.printf("%d ",el);

		}
		


	}

}