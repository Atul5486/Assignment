import java.util.Scanner;
class AreaOfCircle {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter Radius:");
        float radius=inp.nextFloat();
        float areaCircle=(float)(Math.PI*radius*radius);
        System.out.println("Area of circle is :"+areaCircle);
        
    }
}
