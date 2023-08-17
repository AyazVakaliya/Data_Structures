import java.util.Scanner;
public class SmallestNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Eliments:");
		int n=sc.nextInt();
		System.out.println("Enter Eliments:");
		int[] num=new int[n];

		for(int i=0;i<n;i++){
			if(min>num[i]){
				min=num[i];
				minIndex=i;
			}
		}
		System.out.println("Min Index is:"+minIndex);
	}
}