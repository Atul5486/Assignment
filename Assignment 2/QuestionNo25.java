import java.util.Scanner;
class Path{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
       System.out.print("Enter length :"); //24
        int len=inp.nextInt();
        System.out.print("Enter Breadth:"); //15
        int bre=inp.nextInt();
      int area=len*bre;
      System.out.println("Area of one Brick :"+area);
      System.out.print("Enter Total Number of bricks:"); //100
        int totalBricks=inp.nextInt();
        int pathArea=totalBricks*area;
        System.out.println("Area of path is :"+pathArea);
       
    }
}
