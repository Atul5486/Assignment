import java.util.Scanner;
class Armstrong {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number :");
        int num=inp.nextInt();
        int count=0,temp=num,f=1,sum=0;
        if(temp==0){
            count=1;
        }else{
            while(temp!=0){
                int rem=temp%10;
                temp=temp/10;
                count++;
            }
        }
        temp=num;
        while(temp!=0){
            int rem=temp%10;
            f=1;
        for(int i=1;i<=count;i++){
            f=f*rem;
        }
        sum=sum+f;
        temp=temp/10;
        }
        if(sum==num)
        System.out.println(sum+" is armstrong number");
        else
        System.out.println(sum+" is not a armstrong number");
    }
}
