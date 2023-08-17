import java.util.Scanner;
public class Fact{
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter Number");		
		int n = Sc.nextInt();
		int fact=Factorial(n);
		System.out.println(""+fact);
	}
	public static int Factorial(int n){
		int fact=1;
		if (n==0 || n==1) {
			return 1;
		}
		else {
			return fact*(n-1);
		}
	}
}