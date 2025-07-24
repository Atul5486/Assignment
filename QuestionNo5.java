import java.util.Scanner;
class Odd{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
    System.out.print("Enter number of term:");
    int n=inp.nextInt();
       for(int i=1;i<=n;i=i+2){
       System.out.println(i+" ");
       }
    }
}