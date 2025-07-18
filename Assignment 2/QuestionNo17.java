import java.util.Scanner;
class Ribbon{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
       System.out.print("Enter length:"); //3
       int len=inp.nextInt();
       System.out.print("Enter Breadth:"); //2
      int bre=inp.nextInt();
      int peri=2*(len+bre);
      System.out.println("Luci needs :"+peri+"m Long ribbon");
    }
}
