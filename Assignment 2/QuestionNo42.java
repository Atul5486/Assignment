import java.util.Scanner;
class CylinderVolumeDiameter{
    public static void main(String[] args) {
   Scanner inp=new Scanner(System.in);
   System.out.print("Enter diameter of cylinder:"); //2.25
        float diameter = inp.nextFloat();
    System.out.print("Enter height of cylinder:"); //2.25
        float height = inp.nextFloat();
    float radius=(float)(diameter/2.0);
  float volume=(float)(Math.PI*radius*radius*height);
  System.out.println("Volume Of Cylinder is :"+volume);
    }
}
