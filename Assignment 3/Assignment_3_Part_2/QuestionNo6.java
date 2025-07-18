import java.util.Scanner;
class Greater{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter num1:");
        int num1=inp.nextInt();
        System.out.print("Enter num2:");
        int num2=inp.nextInt();
        if(num1==num2)
        System.out.println("Both are Equal");
        else if(num1>num2)
        System.out.println("num1 Is greater");
        else 
        System.out.println("num2 Is greater");
    }
}
