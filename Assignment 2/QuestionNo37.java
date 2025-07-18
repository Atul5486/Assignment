import java.util.Scanner;
class CylinderSurface{
    public static void main(String[] args) {
   Scanner inp=new Scanner(System.in);
   System.out.print("Enter heigth of cylinder:"); //6
   int height=inp.nextInt();
    System.out.print("Enter area of cylinder:"); //149
   int area =inp.nextInt();
  float diameter=(float)(2*(Math.sqrt(height*height+2*(area/Math.PI))-height)/2);
  System.out.println("Diameter of cylinder is :"+diameter);
    }
}
