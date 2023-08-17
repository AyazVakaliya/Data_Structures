import java.util.Scanner;
public class PrimeOrNot{
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter Number");		
		int n = Sc.nextInt();
		int a=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				a++;
			}
			if(a==2){
				System.out.println("Numbre is Prime");
			}
			else{
				System.out.println("Number is Not Prime");
			}
		}
	}
}