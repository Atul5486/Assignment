import java.util.Scanner;
class Nine{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        
        System.out.print("Enter number of terms :");
        int num=inp.nextInt();
        int sto=0;
        for(int i=1;i<=num;i++){
            sto=sto*10+9;
            System.out.print(sto+" ");
        }
    }
}