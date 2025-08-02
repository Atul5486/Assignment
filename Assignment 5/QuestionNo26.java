import java.util.Scanner;
class EvenCube{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter number of term:");
        int n=inp.nextInt();
        int i=0,count=0;
        
        while(count<n){
            if(i%2==0){
                System.out.print(i*i*i+" ");
                i++;
                count++;
            }
            else
            i++;
        }
        
    }
}
