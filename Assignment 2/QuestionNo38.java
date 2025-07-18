import java.util.Scanner;
class CylinderVolume{
    public static void main(String[] args) {
   Scanner inp=new Scanner(System.in);
   System.out.print("Enter radius of cylinder:"); //10
        int radius = inp.nextInt();
    System.out.print("Enter volume of cylinder:"); //1287
        int volume = inp.nextInt();
        float height =(float) (volume / (Math.PI * radius * radius));
        float surfaceArea =(float) (2 * Math.PI * radius * height + 2 * Math.PI * radius * radius);

        System.out.println("Surface Area of cylinder is: " + surfaceArea);
    }
}

