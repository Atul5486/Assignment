import java.util.Scanner;
class Even{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
    System.out.print("Enter number of term:");
    int n=inp.nextInt();
       for(int i=0;n!=0;n--){
       i+=2;
       System.out.print(i+" ");
       
       }
    }
}
