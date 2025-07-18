import java.util.Scanner;
class PathLay{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
       System.out.print("Enter length :"); //24
        int len=inp.nextInt();
        System.out.print("Enter Breadth:"); //15
        int bre=inp.nextInt();
      int area=len*bre;
      System.out.println("Area of one Brick :"+area);
      System.out.print("Enter length of path:"); //120
      int lenP=inp.nextInt();
      int lenPath=lenP*100;
      System.out.print("Enter Breadth of path:"); //2.4
      float breP=inp.nextFloat();
        float brePath=(float)(breP*100);
        float pathArea=(float)(lenPath*brePath);
        float numberOfBricks=(float)(pathArea/area);
        System.out.println("Area of path is :"+numberOfBricks);
       
    }
}
