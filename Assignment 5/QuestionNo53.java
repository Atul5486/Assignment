// WAP to check whether entered number is strong or not
import java.util.Scanner;
class Strong{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1=inp.nextInt();
        System.out.print("Enter last number : ");
        int num2=inp.nextInt();
        
        for(int j=num1;j<=num2;j++){
            int temp=j;
            int sum=0;
            while(temp!=0){
                int fact=1;
                int rem=temp%10;
          for(int i=1;i<=rem;i++){
        fact*=i;
       }
       sum+=fact;
       temp/=10;
        }
        if(sum==j){
            System.out.println(j);
            }
        }
    }
}
