// WAP to print all the prime numbers between two entered numbers
import java.util.Scanner;
class Prime{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1=inp.nextInt();
        int temp=num1;
        System.out.print("Enter last number : ");
        int num2=inp.nextInt();

        for(int i=num1;i<num2;i++){
            boolean isPrime=true;
            if(i<=1){
                isPrime=false;
            }else{
                for(int j = 2; j <= i/2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.print(i+" ");
            }
            }
            System.out.println();
        }
    }
