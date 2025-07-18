import java.util.Scanner;
class Arithmetic{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number:");
        float num1=inp.nextFloat();
        System.out.print("Enter a  symbol to perform operation(+,*,/,-,):");
        char ch=inp.next().charAt(0);
        System.out.print("Enter another number:");
        float num2=inp.nextFloat();
        switch (ch) {
                case '+':
                    System.out.println("addition "+num1+" + "+num2+" "+(num1+num2));
                    break;
                case '*':
                    System.out.println("Subtract "+num1+" * "+num2+" "+(num1*num2));
                    break;
                case '-':
                    System.out.println("Multiply "+num1+" - "+num2+" = "+(num1-num2)); 
                    break;
                case '/':
                    System.out.println("Division "+num1+" / "+num2+" "+(num1/num2));
                    break;
                case '%':
                    System.out.println("Reminder "+num1+" % "+num2+" "+(num1%num2));
                    break;
               default:
                    System.out.println("Not a vowel");
            }
    }
}
