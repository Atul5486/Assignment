import java.util.Scanner;
class EvenOddSwitch {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=inp.nextInt();
        int rem=num%2;
        switch (rem) {
                case 0:
                    System.out.println("Even");
                    break;
                case 1:
                    System.out.println("Odd");
                    break;
               default:
                    System.out.println("Odd");
            }
    }
}
