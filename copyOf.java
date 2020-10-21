package labassignment_day1;
import java.util.Arrays;

public class copyOf {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		int arr[]=new int[] {22,31,87,32,34};
		System.out.println("Original array:");
		for(int i=0;i<arr.length;i++) {
			//arr[i]=sc.nextInt();
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int arr1[]=Arrays.copyOf(arr,6);
		arr1[5]=98;
		System.out.println("copyof array is:");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
	}

}
