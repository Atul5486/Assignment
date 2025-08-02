import java.util.Scanner;
class Fibo{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter number of term:");
        int n=inp.nextInt();
        long a=1,b=2,multi;
        for(int i=1;i<=n;i++){
            multi=a*b;
            System.out.print(a+" ");
            b=a;
            a=multi;
        }
    }
}
