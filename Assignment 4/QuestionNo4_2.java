import java.util.Scanner;
class AnotherSum{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
    System.out.print("Enter number of term:");
    int n=inp.nextInt();
    int sum=0;
       for(int i=1;i<=n;i++){
          if(i%2==0)
          sum-=i;
          else
          sum+=i;
       }
       System.out.println("Sum is:"+sum);
    }
}