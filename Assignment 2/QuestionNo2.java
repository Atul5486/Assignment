import java.util.Scanner;
class Length{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter Breadth:");  //8
        int breadth=inp.nextInt();
        System.out.println("Enter Area:");  //96
        int area=inp.nextInt();
        int length=area/breadth;
        int perimeter=2*(length + breadth);
        System.out.println("Length of Rectangle "+length);
        System.out.println("Perimeter of Rectangle "+perimeter);
        
    }
}
