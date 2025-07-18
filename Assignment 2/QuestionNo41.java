import java.util.Scanner;
class CylinderVolumeAnother{
    public static void main(String[] args) {
   Scanner inp=new Scanner(System.in);
   System.out.print("Enter diameter of cylinder:"); //30
        int diameter = inp.nextInt();
    System.out.print("Enter height of cylinder:"); //50
        int height = inp.nextInt();
        float radius=(float)(diameter/2.0);
  float volume=(float)(Math.PI*radius*radius*height);
  System.out.println("Volume Of Cylinder is :"+volume);
    }
}
