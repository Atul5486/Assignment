import java.util.Scanner;
class Rectangle{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter Perimeter in cm:");  //230
        int perimeter=inp.nextInt();
        System.out.print("Enter Length in cm:");  //70
        int length=inp.nextInt();
        int breadth=perimeter/2-length;
        int area=breadth*length;
        System.out.println("Breadth of Rectangle "+breadth);
        System.out.println("Area of Rectangle "+area);
        
    }
}
