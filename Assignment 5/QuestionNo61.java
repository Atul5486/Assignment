import java.util.Scanner;
class Leap{
    public static void main(String args[]){
    Scanner inp=new Scanner(System.in);
    System.out.println("Enter two year to find leap year between them");
    System.out.print("Enter first year : ");
    int first=inp.nextInt();
    System.out.print("Enter last year : ");
    int last=inp.nextInt();
        for(int i=first;i<=last;i++){
        if(i%4==0 || i%100==0){
            System.out.print(i+" ");
        }
        }
    } 
}





