import java.util.Scanner;
class Ap{
    public static void main(String[] args) {
   Scanner inp=new Scanner(System.in);
   System.out.print("Enter first term:"); //-21
        int a = inp.nextInt();
    System.out.print("Enter difference:"); //3
        int d = inp.nextInt();
    System.out.print("Enter nth term:"); //28
        int n  = inp.nextInt();
  int term=a+(n-1)*d;
  System.out.println("28th term is :"+term);
    }
}
