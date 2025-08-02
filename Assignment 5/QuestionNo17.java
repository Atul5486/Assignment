import java.util.Scanner;
class Previous{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter number of term:");
        int n=inp.nextInt();
        int pre=1;
        for(int i=1;i<=n;i++){
            System.out.print(pre+" ");
            pre+=i;
        }
        
    }
}
