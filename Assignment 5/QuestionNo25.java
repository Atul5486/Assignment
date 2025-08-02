import java.util.Scanner;
class OddCube{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter number of term:");
        int n=inp.nextInt();
        int i=1,count=0;
        
        while(count<n){
            if(i%2==1){
                System.out.print(i*i*i+" ");
                i++;
                count++;
            }
            else
            i++;
        }
        
    }
}
