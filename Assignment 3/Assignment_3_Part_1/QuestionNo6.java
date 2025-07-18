import java.util.Scanner;
class Absolute{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=inp.nextInt();
        if(num>0){
            System.out.println(num);
        }else{
            System.out.println(-num);
        }
        
    }
}
