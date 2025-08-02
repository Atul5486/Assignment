import java.util.Scanner;
class Odd{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1=inp.nextInt();
        System.out.print("Enter last number : ");
        int num2=inp.nextInt();
        for(int i=num1;i<=num2;i++){
            if(i%2==1){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}