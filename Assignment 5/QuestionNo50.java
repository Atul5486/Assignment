import java.util.Scanner;
class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();
        
        while(num1<=num2){
            int temp=num1,rev=0;
            while(temp!=0){
                int rem=temp%10;
                rev=rev*10+rem;
                temp/=10;
            }
            if(rev==num1 && rev>=10){
                System.out.print(num1+" ");
            }
            num1++;
        }
    }
}