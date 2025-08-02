import java.util.Scanner;
class Square{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1=inp.nextInt();
        System.out.print("Enter last number : ");
        int num2=inp.nextInt();
        System.out.println("Square between both number");
        for(int i=num1;i<=num2;i++){
            System.out.print(i*i+" ");
        }
        System.out.println();
        System.out.println("Cube between both number");
        for(int i=num1;i<=num2;i++){
            System.out.print(i*i*i+" ");
        }
        System.out.println();
        System.out.println("Square root between both number");
        for(int i=num1;i<=num2;i++){
            double sr=Math.sqrt(i);
            System.out.print(sr+" ");
        }
        System.out.println();
    }
}
