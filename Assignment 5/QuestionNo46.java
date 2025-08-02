import java.util.Scanner;
class SumOfFirstAndLast{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=inp.nextInt(),temp=num;
        int last=num%10;
        while(num>=10)
        num=num/10;
        
    System.out.println("The sum of first and last digit is "+(num+last));
    }
}