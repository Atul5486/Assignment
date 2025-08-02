import java.util.Scanner;
class StarPatten{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter number of term:");
        int n=inp.nextInt();
        int i=0;
        
        while(i<=n){
            if(i%2==0)
                System.out.print(" * ");
            else
            System.out.print(" # ");
            
        i++;
        }
        
    }
}
