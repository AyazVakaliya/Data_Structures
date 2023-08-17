import java.util.*;

public class Array{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number of Array");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter The Number of Element");
		for (int i=0;i<n ;i++ ) {
			a[i] = sc.nextInt();
		}
		System.out.println("Entered Element");
		for (int i=0;i<n ;i++ ) {
			System.out.println(" "+a[i]);	

		}
	}
}