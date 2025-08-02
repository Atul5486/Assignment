import java.util.Scanner;
class Reverse {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=inp.nextInt();
        int rem,rev=0;
        while(num>0){
           rem=num%10;
           rev=rev*10+rem;
           num=num/10;
           if(num==0) return 1;
        }
        System.out.println("Number of digit is :"+rev);
    }
}