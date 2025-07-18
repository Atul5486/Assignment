import java.util.Scanner;
class LowestNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = inp.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = inp.nextInt(); 
        System.out.print("Enter the third number: ");
        int num3 = inp.nextInt();
        System.out.print("Enter the fourth number: ");
        int num4 = inp.nextInt();
        int low = num1;
        if (num2 < low)
            low = num2;
        if (num3 < low)
            low = num3;
        if (num4 < low)
            low = num4;
        System.out.println("The lowest number is: " + low);
    }
}
