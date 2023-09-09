
public class LinearSearchApp {
public static void array(int key ,int[] arr ) {
	for(int i=0;i<=arr.length-1;i++) {
		if(key==arr[i])
		{
			System.out.println("key found at index"+i);
			return ;
		}
	}
	System.out.println("key not found");
}
}
