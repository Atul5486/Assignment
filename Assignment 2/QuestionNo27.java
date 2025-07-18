import java.util.Scanner;
class DiningRoom{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
       System.out.print("Enter length :"); //20
        int len=inp.nextInt();
        System.out.print("Enter wide:"); //15
        int wide=inp.nextInt();
      int area=len*wide;
      System.out.println("Area of one Brick :"+area);
      System.out.print("Enter Rate:"); //5
      int rate=inp.nextInt();
      int price=area*rate;
      System.out.println("Cost of tiling a dining room is :"+price+"$");  
    }
}
