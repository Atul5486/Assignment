import java.util.Scanner;
class Divisible{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=inp.nextInt();
        if(num%5==0 && num%11==0)
        System.out.println("The number is divisible is 5 and 11");
        else
        System.out.println("The number is not divisible is 5 and 11");
        
    }
}
