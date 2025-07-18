import java.util.Scanner;
class Tiling{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter length:"); //300
        int len=inp.nextInt();
        System.out.print("Enter Breadth:"); //150
        int bre=inp.nextInt();
        int plot=len*bre;
        System.out.print("Enter Area:"); //6
        int rate=inp.nextInt();
        float totalPrice=(float)((plot*rate)/100);
        System.out.println("Total Price: $"+totalPrice);
        
    }
}
