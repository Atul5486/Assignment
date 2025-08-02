import java.util.Scanner;
class Prime{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number :");
        int num=inp.nextInt();
        boolean prime=true;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                prime=false;
            }
        }
        System.out.println(prime);
    }
}
