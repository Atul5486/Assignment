import java.util.Scanner;
class Factorial{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        long fact=1;
        for(int i=n;i>=1;i--){
           fact=fact*i;
        }
        System.out.println("Factorial of "+n+" is "+fact);
    }
}