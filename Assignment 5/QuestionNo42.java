import java.util.Scanner;
class Hcf{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num1=inp.nextInt();
        System.out.print("Enter another number : ");
        int num2=inp.nextInt();
        int hcf=1,min = (num1 < num2) ? num1 : num2;
        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }
        System.out.println("The HCF of " + num1 + " and " + num2 + " is " + hcf);

    }
}