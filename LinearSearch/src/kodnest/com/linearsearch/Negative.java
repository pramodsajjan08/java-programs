package kodnest.com.linearsearch;

public class Negative {
	int[]merge(int arr1[]){
		for(int i=0;i<=arr1.length-1;i++) {
			if(arr1[i]<=0)
			{
				arr1[i]=0;
			}
		}
		return arr1;
	}

}
