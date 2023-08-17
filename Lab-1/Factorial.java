import java.util.Scanner;
public class Factorial{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        long fact = multiplyNumbers(num);
        System.out.println("Factorial of " + num + ": " + fact);
    }
    public static long multiplyNumbers(int num){
        if (num >= 1){
            return num * multiplyNumbers(num - 1);
        }
        else{
            return 1;
        }
    }
}