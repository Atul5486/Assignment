import java.util.Scanner;
class Operation{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number:");
        float num1=inp.nextFloat();
        System.out.print("Enter a  symbol to perform operation (+,>,==):");
        String ch=inp.next();
        System.out.print("Enter another number:");
        float num2=inp.nextFloat();
        switch (ch) {
                case "+":
                    System.out.println("addition"+num1+" "+num2+" = "+(num1+num2));
                    break;
                case "==":
                    System.out.println(num1==num2 ? "Both are Equal":"Not equal");
                    break;
                case ">":
                    System.out.println(num1>num2 ? "Num1 is greater": (num2>num1)?"Num2 is greater":"Both are equal");
                    break;
               default:
                    System.out.println("Enter a valid operation or number");
            }
    }
}
