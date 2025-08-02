import java.util.Scanner;
class Square{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter number of term: ");
       int num=sc.nextInt();
       for(int i=1;i<=num;i++){
           System.out.print(i*i+" ");
       }
    }
}
