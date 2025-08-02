import java.util.Scanner;
class SumOfDigit{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=inp.nextInt();
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum+=rem;
            num=num/10;
        }
            System.out.print(sum);
    }
}