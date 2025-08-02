import java.util.Scanner;
class Fibbonacci{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
    System.out.print("Enter number of term:");
    int n=inp.nextInt();
    int a=0,b=1,sum;
       for(int i=1;i<=n;i++){
        sum=a+b;
        System.out.print(a+" ");
        b=a;
        a=sum;
       }
    }
}
