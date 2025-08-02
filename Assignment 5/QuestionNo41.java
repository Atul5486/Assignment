import java.util.Scanner;
class Lcm{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num1=inp.nextInt();
        System.out.print("Enter another number : ");
        int num2=inp.nextInt();
        int lcm;
        int max=(num1 > num2 )?num1:num2;
        while(true){
            if(max%num1==0 && max%num2==0){
                lcm=max;
                break;
            }
            max++;
        }
         System.out.println("The LCM of " + num1 + " and " + num2 + " is " + lcm);
    }
}