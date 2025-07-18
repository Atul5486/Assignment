import java.util.Scanner;
class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter Length:");
        int  len=inp.nextInt();
        System.out.print("Enter breadth:");
        int  bre=inp.nextInt();
        int area=len*bre;
        System.out.println("Area of Rectangle is :"+area);
        
    }
}
