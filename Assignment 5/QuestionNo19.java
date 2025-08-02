import java.util.Scanner;
class Half{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter number of term:");
        int n=inp.nextInt();
        double sum=0;
        for(int i=1;i<=n;i++){
            sum+=(double)(1.0/i);
        }
        System.out.println("Sum of series is : "+sum);
    }
}
