import java.util.Scanner;
class NumberPattern{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter number of term: ");
       int num=sc.nextInt();
       int i=-num,n=num;
       while(i <= num){
           n=i*3;
           System.out.print(n+" ");
           i++;
       }
    }
    }

