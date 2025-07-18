import java.util.Scanner;
class Carpet{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
       System.out.print("Enter length :"); //5
        int len=inp.nextInt();
        System.out.print("Enter wide:"); //4
        int wide=inp.nextInt();
      int area=len*wide;
      System.out.println("Area of one Brick :"+area);
      System.out.print("Enter Rate:"); //205
      int rate=inp.nextInt();
      int price=area*rate;
      System.out.println("Total price of tiles :"+price+"$");
    }
}
