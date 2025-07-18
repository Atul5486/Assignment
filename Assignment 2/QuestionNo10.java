import java.util.Scanner;
class Isosceles{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter size:"); //15
        int size=inp.nextInt();
        float areaOfTriangle=(float)(size*size)/2;
        System.out.println("Area of isosceles right is: "+ areaOfTriangle);
    }
}
