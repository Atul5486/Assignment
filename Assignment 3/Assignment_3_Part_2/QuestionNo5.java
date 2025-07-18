import java.util.Scanner;
class SwapBit{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter num1:");
        int num1=inp.nextInt();
        System.out.print("Enter num2:");
        int num2=inp.nextInt();
        System.out.println("Value of num1 and num2 Before Swap:"+ num1+" "  +num2);
        num1=num1^num2;
        num2=num1^num2;
        num1=num1^num2;
        System.out.println("Value of num1 and num2 After Swap:"+ num1 +" "+num2);
    }
}
