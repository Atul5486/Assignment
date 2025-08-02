import java.util.Scanner;
class Natural{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of term :");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
            System.out.print("sum of all number is : "+sum);
    }
}