import java.util.Scanner;
class Base{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter Area:"); //0.8
        double area=inp.nextDouble();
        System.out.print("Enter Height:"); //0.2
        double height= inp.nextDouble();
        float base=(float)(2*(area/height));
        System.out.println("Base of triangle: "+base);
    }
}
