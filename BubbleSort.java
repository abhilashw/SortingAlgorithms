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

}