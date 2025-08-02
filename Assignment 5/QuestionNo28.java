import java.util.Scanner;
class Hello{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter number of term:");
        int n=inp.nextInt();
        int i=1;
        
        while(i<=n){
            if(i%5==0)
                System.out.print("Hello ");
            else
            System.out.print(i+" ");
            
        i++;
        }
        
    }
}
