// WAP to reverse all the numbers between two entered numbers
import java.util.Scanner;
class Reverse {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1=inp.nextInt();
        System.out.print("Enter last number : ");
        int num2=inp.nextInt();
        for (int i=num1;i<=num2;i++) {
                int ori = i;
                int rev = 0;
                while (ori != 0) {
                    int rem = ori % 10;
                    rev = rev * 10 + rem;
                    ori /= 10;
                }
                System.out.println(i + " => " + rev);
            }
    }
    }