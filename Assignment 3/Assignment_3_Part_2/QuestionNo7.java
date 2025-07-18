import java.util.Scanner;
class GreaterThree {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter num1:");
        int num1=inp.nextInt();
        System.out.print("Enter num2:");
        int num2=inp.nextInt();
        System.out.print("Enter num3:");
        int num3=inp.nextInt();
        if(num1==num2 || num2==num3 || num1==num3)
        System.out.println("Any two are Equal");
        else if(num1>num2 && num1 > num3)
        System.out.println("num1 Is greater");
        else if(num2>num1 && num2>num3)
        System.out.println("num2 Is greater");
        else
        System.out.println("num3 is greater");
    }
}
