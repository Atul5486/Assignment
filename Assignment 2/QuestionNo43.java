import java.util.Scanner;
class CylinderVolumeAnother{
    public static void main(String[] args) {
   Scanner inp=new Scanner(System.in);
   System.out.print("Enter height of cylinder:"); //4
        int h = inp.nextInt();
    System.out.print("Enter length of cylinder:"); //5
        int l = inp.nextInt();
    System.out.print("Enter rate of cylinder:"); //10
        int rate  = inp.nextInt();
   float r=(float)(Math.sqrt(l*l-h*h));
        float area=(float)(Math.PI*r*r);
        float totalPrice=area*rate;
        
  System.out.println("Total cost polishing the base of a cone :"+totalPrice);
    }
}
