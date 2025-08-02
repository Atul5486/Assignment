import java.util.Scanner;
class Strong{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=inp.nextInt();
        int fact=1,sum=0,temp=num;
        while(num!=0){
            int rem=num%10;
            fact=1;
            for(int i=1;i<=rem;i++){
                fact*=i;
            }
            sum+=fact;
            num=num/10;
        }
        if(sum==temp)
        System.out.println(temp+" is a Strong number");
        else
        System.out.println(temp+" is not a strong number");
    }
}
