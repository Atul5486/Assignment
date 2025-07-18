import java.util.Scanner;
class CylinderVolumeAnother{
    public static void main(String[] args) {
   Scanner inp=new Scanner(System.in);
   System.out.print("Enter radius of cylinder:"); //5
        int radius = inp.nextInt();
    System.out.print("Enter height of cylinder:"); //9
        int height = inp.nextInt();
        float volume=(float)(Math.PI*radius*radius*height);
  System.out.println("Volume Of Cylinder is :"+volume);
    }
}
