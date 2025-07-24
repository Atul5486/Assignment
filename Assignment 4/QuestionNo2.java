import java.util.Scanner;
class  Series{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
    System.out.print("Enter number of term:");
    int n=inp.nextInt();
       for(int i=1;i<=n;i++){
           System.out.print(i+" ");
       }
    }
}