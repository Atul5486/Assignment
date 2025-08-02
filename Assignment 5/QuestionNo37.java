import java.util.Scanner;
class Palindrome {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number :");
        int num=inp.nextInt();
        int temp=num,rev=0;
        while(temp!=0){
            int rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(rev==num)
        System.out.print("Number is Palindrome");
            else
            System.out.println("Not a palindrome");
    }
}
