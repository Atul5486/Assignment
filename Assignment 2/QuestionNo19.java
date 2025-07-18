import java.util.Scanner;
class Measure{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
       System.out.print("Enter edge:"); //7
       int edge=inp.nextInt();
        int cude=edge*edge*edge;
        int cuboidVolume=7*4*8;
        int diff=cude-cuboidVolume;
        System.out.println("Volume Of Cude :"+cude);
        System.out.println("Volume Of Cuboid :"+cuboidVolume);
        System.out.println("Difference Between Both :"+diff+" So,cube is taken more shape");
    }
}
