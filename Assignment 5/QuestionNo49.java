import java.util.Scanner;
class Factor {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter two number to get table between them");
        System.out.print("Enter first number : ");
        int num1=inp.nextInt();
        System.out.print("Enter second number greater than first number : ");
        int num2=inp.nextInt();
        while(num1<=num2){
            int sum=0;
            for(int i=1;i<=num1/2;i++){
                if(num1%i==0){
                    sum+=i;
                }
                
            }
               if (sum == num1 && num1 != 0) {
                System.out.println(num1);
            }
            num1++;
        }
    }
}