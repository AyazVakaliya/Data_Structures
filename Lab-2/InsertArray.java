import java.util.Scanner;
public class InsertArray{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Array Size=");
		int size=sc.nextInt();
		int[] arr=new int [size+1];

		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Replace Index :");
		int index=sc.nextInt();
		for(int i=size+1;i>=index;i--){
			arr[i]=arr[i-1];
		}
		System.out.println("Replace Number :");
		int num=sc.nextInt();
		arr[index]=num;
	}
}