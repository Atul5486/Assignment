import java.util.Scanner;
class CountEvenOdd{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=inp.nextInt();
        int countEven=0,countOdd=0;
        for(int i=1;i<=num;i++){
            if(i%2==0)
            countEven++;
            else
            countOdd++;
        }
       System.out.println("Even numbers are : "+countEven);
       System.out.println("Odd numbers are : "+countOdd);
    }
}
