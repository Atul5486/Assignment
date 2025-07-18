import java.util.Scanner;
class TriangleHeigth{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter Base of triangle:"); //50
        int base=inp.nextInt();
        System.out.print("Enter Area of triangle:"); //500
        int area=inp.nextInt();
        int height= (area*2)/base;
        System.out.println("Height Of triangle is : "+height+"cm");
    }
}
