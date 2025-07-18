import java.util.Scanner;
class EvenOdd {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=inp.nextInt();
        if(num%2==0)
        System.out.println("Even");
        else
        System.out.println("Odd");
    }
}
