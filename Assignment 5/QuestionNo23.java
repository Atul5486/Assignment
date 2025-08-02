import java.util.Scanner;
class OddSquare{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter number of term:");
        int n=inp.nextInt();
        int i=1,count=0;
        
        while(count<n){
            if(i%2==1){
                System.out.print(i*i+" ");
                i++;
                count++;
            }
            else
            i++;
        }
        
    }
}
