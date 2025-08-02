import java.util.Scanner;
class Seven{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter number of term : ");
        int n=inp.nextInt();
        for(int i=0;i<=n;i++){
            System.out.print(i*7+" ");
        }
    }
}
