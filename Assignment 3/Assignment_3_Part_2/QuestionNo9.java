import java.util.Scanner;
class NegativeAndPositive{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=inp.nextInt();
        if(num >0)
        System.out.println("Number is Positive");
        else if(num <0)
        System.out.println("Number is negative");
        else
        System.out.println("Neutral");
    }
}
