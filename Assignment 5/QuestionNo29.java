import java.util.Scanner;
class Elevan{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter number of term:");
        int n=inp.nextInt();
        int i=0,el=0;
        while(i<=n){
            el=el*10+1;
            System.out.print(el+" ");
            i++;
        }
    }
}
